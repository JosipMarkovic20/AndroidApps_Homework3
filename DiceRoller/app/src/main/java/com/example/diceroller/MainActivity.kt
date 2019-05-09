package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceList: List<Dice> = listOf(Dice(dice1),Dice(dice2),Dice(dice3),Dice(dice4),Dice(dice5),Dice(dice6))
        val button: Button = rollButton
        val textViewOne = result
        val textViewTwo = result2
        val roller = Roller(diceList, button, textViewOne, textViewTwo)
        roller.start()
    }







}
