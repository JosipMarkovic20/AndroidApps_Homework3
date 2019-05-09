package com.example.diceroller

import android.widget.ImageView
import kotlin.random.Random

class Dice(val id: ImageView, var isLocked: Boolean = false, var value: Int = 0) {


    fun rollDice(): Int {
        if (isLocked) {
            return value
        } else {
            val diceValue = Random.nextInt(1, 7)
            when (diceValue) {
                1 -> id.setImageResource(R.drawable.dice_red1)
                2 -> id.setImageResource(R.drawable.dice_red2)
                3 -> id.setImageResource(R.drawable.dice_red3)
                4 -> id.setImageResource(R.drawable.dice_red4)
                5 -> id.setImageResource(R.drawable.dice_red5)
                6 -> id.setImageResource(R.drawable.dice_red6)
            }
            return diceValue
        }
    }
}