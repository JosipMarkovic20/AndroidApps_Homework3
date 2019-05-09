package com.example.bmicalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculateButton.setOnClickListener {
            calculateClick()
        }
    }

    fun calculateClick(){

        val heightText: String = enterHeightBox.text.toString()
        val weightText: String = enterWeightBox.text.toString()

        val height: Double = getData(heightText)
        val weight: Double = getData(weightText)


        if(height>250||weight>350||height==0.0||weight==0.0){
            bmiResult.text="Invalid input."
        }else {
            val calculator = Calculator(height, weight)
            val resultBMI= calculator.calculateBMI()
            val decimal = BigDecimal(resultBMI).setScale(1, RoundingMode.HALF_EVEN)
            bmiResult.text = "Your BMI is: $decimal"
            if(resultBMI<18.5){
                resultPic.setImageResource(R.drawable.underweight)
                resultTitle.text=getString(R.string.underweight)
                description.text=getString(R.string.underWeightDescription)
            }else if(resultBMI>=18.5&&resultBMI<=24.9){
                resultPic.setImageResource(R.drawable.normalweight)
                resultTitle.text=getString(R.string.normalWeight)
                description.text=getString(R.string.normalWeightDescription)
            }else if(resultBMI>=25&&resultBMI<=29.9){
                resultPic.setImageResource(R.drawable.overweight)
                resultTitle.text=getString(R.string.overweight)
                description.text=getString(R.string.overWeightDescription)
            }else if(resultBMI>=30&&resultBMI<=34.9){
                resultPic.setImageResource(R.drawable.obese)
                resultTitle.text=getString(R.string.obese)
                description.text=getString(R.string.obeseDescription)
            }else if(resultBMI>=35){
                resultPic.setImageResource(R.drawable.extremelyobese)
                resultTitle.text=getString(R.string.extremelyObese)
                description.text=getString(R.string.extremelyObeseDescription)
            }
        }
    }

    fun getData(dataText: String): Double{
        if(dataText.isNotBlank()){
            return dataText.toDouble()
        }else return 0.0
    }
}
