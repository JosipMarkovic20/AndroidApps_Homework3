package com.example.diceroller

import android.widget.Button
import android.widget.TextView

class Roller(val diceList: List<Dice>, val rollButton: Button, val result: TextView, val result2: TextView): MainActivity() {
    var rollNumber = 0
    fun start() {
        rollButton.setOnClickListener {
            rollButtonClick()
            if (rollNumber == 1) enableLocking()
        }
    }


    fun firstRoll() {
        var diceNumber = 0
        var sum = 0
        var dice: Dice
        for (i in diceList) {
            dice = diceList[diceNumber]
            diceList[diceNumber].value = dice.rollDice()
            sum += diceList[diceNumber].value
            diceNumber++
        }
        result.text = "First roll result: $sum"
        rollNumber++

    }

    fun secondRoll() {
        var diceNumber = 0
        var sum = 0
        var dice: Dice
        for (i in diceList) {
            dice = diceList[diceNumber]
            sum += dice.rollDice()
            diceNumber++

        }
        result2.text = "Second roll result: $sum"
        rollNumber++
    }

    fun rollButtonClick() {

        if (rollNumber == 0) {
            firstRoll()
        } else if (rollNumber == 1) {
            secondRoll()
        } else {
            reset()
            firstRoll()
        }
    }

    fun reset() {
        result.text = ""
        result2.text = ""
        rollNumber = 0
        diceList[0].isLocked = false
        diceList[0].id.setImageResource(R.drawable.dice_red1)
        diceList[1].isLocked = false
        diceList[1].id.setImageResource(R.drawable.dice_red2)
        diceList[2].isLocked = false
        diceList[2].id.setImageResource(R.drawable.dice_red3)
        diceList[3].isLocked = false
        diceList[3].id.setImageResource(R.drawable.dice_red4)
        diceList[4].isLocked = false
        diceList[4].id.setImageResource(R.drawable.dice_red5)
        diceList[5].isLocked = false
        diceList[5].id.setImageResource(R.drawable.dice_red6)

    }

    fun enableLocking() {

            diceList[0].id.setOnClickListener {
                if (diceList[0].isLocked) {
                    diceList[0].isLocked = false
                    when (diceList[0].value) {
                        1 -> diceList[0].id.setImageResource(R.drawable.dice_red1)
                        2 -> diceList[0].id.setImageResource(R.drawable.dice_red2)
                        3 -> diceList[0].id.setImageResource(R.drawable.dice_red3)
                        4 -> diceList[0].id.setImageResource(R.drawable.dice_red4)
                        5 -> diceList[0].id.setImageResource(R.drawable.dice_red5)
                        6 -> diceList[0].id.setImageResource(R.drawable.dice_red6)
                    }
                } else {
                    diceList[0].isLocked = true
                    when (diceList[0].value) {
                        1 -> diceList[0].id.setImageResource(R.drawable.dice_red_1_locked)
                        2 -> diceList[0].id.setImageResource(R.drawable.dice_red_2_locked)
                        3 -> diceList[0].id.setImageResource(R.drawable.dice_red_3_locked)
                        4 -> diceList[0].id.setImageResource(R.drawable.dice_red_4_locked)
                        5 -> diceList[0].id.setImageResource(R.drawable.dice_red_5_locked)
                        6 -> diceList[0].id.setImageResource(R.drawable.dice_red_6_locked)
                    }
                }
            }

        diceList[1].id.setOnClickListener {
            if (diceList[1].isLocked) {
                diceList[1].isLocked = false
                when (diceList[1].value) {
                    1 -> diceList[1].id.setImageResource(R.drawable.dice_red1)
                    2 -> diceList[1].id.setImageResource(R.drawable.dice_red2)
                    3 -> diceList[1].id.setImageResource(R.drawable.dice_red3)
                    4 -> diceList[1].id.setImageResource(R.drawable.dice_red4)
                    5 -> diceList[1].id.setImageResource(R.drawable.dice_red5)
                    6 -> diceList[1].id.setImageResource(R.drawable.dice_red6)
                }
            } else {
                diceList[1].isLocked = true
                when (diceList[1].value) {
                    1 -> diceList[1].id.setImageResource(R.drawable.dice_red_1_locked)
                    2 -> diceList[1].id.setImageResource(R.drawable.dice_red_2_locked)
                    3 -> diceList[1].id.setImageResource(R.drawable.dice_red_3_locked)
                    4 -> diceList[1].id.setImageResource(R.drawable.dice_red_4_locked)
                    5 -> diceList[1].id.setImageResource(R.drawable.dice_red_5_locked)
                    6 -> diceList[1].id.setImageResource(R.drawable.dice_red_6_locked)
                }
            }
        }

        diceList[2].id.setOnClickListener {
            if (diceList[2].isLocked) {
                diceList[2].isLocked = false
                when (diceList[2].value) {
                    1 -> diceList[2].id.setImageResource(R.drawable.dice_red1)
                    2 -> diceList[2].id.setImageResource(R.drawable.dice_red2)
                    3 -> diceList[2].id.setImageResource(R.drawable.dice_red3)
                    4 -> diceList[2].id.setImageResource(R.drawable.dice_red4)
                    5 -> diceList[2].id.setImageResource(R.drawable.dice_red5)
                    6 -> diceList[2].id.setImageResource(R.drawable.dice_red6)
                }
            } else {
                diceList[2].isLocked = true
                when (diceList[2].value) {
                    1 -> diceList[2].id.setImageResource(R.drawable.dice_red_1_locked)
                    2 -> diceList[2].id.setImageResource(R.drawable.dice_red_2_locked)
                    3 -> diceList[2].id.setImageResource(R.drawable.dice_red_3_locked)
                    4 -> diceList[2].id.setImageResource(R.drawable.dice_red_4_locked)
                    5 -> diceList[2].id.setImageResource(R.drawable.dice_red_5_locked)
                    6 -> diceList[2].id.setImageResource(R.drawable.dice_red_6_locked)
                }
            }
        }

        diceList[3].id.setOnClickListener {
            if (diceList[3].isLocked) {
                diceList[3].isLocked = false
                when (diceList[3].value) {
                    1 -> diceList[3].id.setImageResource(R.drawable.dice_red1)
                    2 -> diceList[3].id.setImageResource(R.drawable.dice_red2)
                    3 -> diceList[3].id.setImageResource(R.drawable.dice_red3)
                    4 -> diceList[3].id.setImageResource(R.drawable.dice_red4)
                    5 -> diceList[3].id.setImageResource(R.drawable.dice_red5)
                    6 -> diceList[3].id.setImageResource(R.drawable.dice_red6)
                }
            } else {
                diceList[3].isLocked = true
                when (diceList[3].value) {
                    1 -> diceList[3].id.setImageResource(R.drawable.dice_red_1_locked)
                    2 -> diceList[3].id.setImageResource(R.drawable.dice_red_2_locked)
                    3 -> diceList[3].id.setImageResource(R.drawable.dice_red_3_locked)
                    4 -> diceList[3].id.setImageResource(R.drawable.dice_red_4_locked)
                    5 -> diceList[3].id.setImageResource(R.drawable.dice_red_5_locked)
                    6 -> diceList[3].id.setImageResource(R.drawable.dice_red_6_locked)
                }
            }
        }

        diceList[4].id.setOnClickListener {
            if (diceList[4].isLocked) {
                diceList[4].isLocked = false
                when (diceList[4].value) {
                    1 -> diceList[4].id.setImageResource(R.drawable.dice_red1)
                    2 -> diceList[4].id.setImageResource(R.drawable.dice_red2)
                    3 -> diceList[4].id.setImageResource(R.drawable.dice_red3)
                    4 -> diceList[4].id.setImageResource(R.drawable.dice_red4)
                    5 -> diceList[4].id.setImageResource(R.drawable.dice_red5)
                    6 -> diceList[4].id.setImageResource(R.drawable.dice_red6)
                }
            } else {
                diceList[4].isLocked = true
                when (diceList[4].value) {
                    1 -> diceList[4].id.setImageResource(R.drawable.dice_red_1_locked)
                    2 -> diceList[4].id.setImageResource(R.drawable.dice_red_2_locked)
                    3 -> diceList[4].id.setImageResource(R.drawable.dice_red_3_locked)
                    4 -> diceList[4].id.setImageResource(R.drawable.dice_red_4_locked)
                    5 -> diceList[4].id.setImageResource(R.drawable.dice_red_5_locked)
                    6 -> diceList[4].id.setImageResource(R.drawable.dice_red_6_locked)
                }
            }
        }

        diceList[5].id.setOnClickListener {
            if (diceList[5].isLocked) {
                diceList[5].isLocked = false
                when (diceList[5].value) {
                    1 -> diceList[5].id.setImageResource(R.drawable.dice_red1)
                    2 -> diceList[5].id.setImageResource(R.drawable.dice_red2)
                    3 -> diceList[5].id.setImageResource(R.drawable.dice_red3)
                    4 -> diceList[5].id.setImageResource(R.drawable.dice_red4)
                    5 -> diceList[5].id.setImageResource(R.drawable.dice_red5)
                    6 -> diceList[5].id.setImageResource(R.drawable.dice_red6)
                }
            } else {
                diceList[5].isLocked = true
                when (diceList[5].value) {
                    1 -> diceList[5].id.setImageResource(R.drawable.dice_red_1_locked)
                    2 -> diceList[5].id.setImageResource(R.drawable.dice_red_2_locked)
                    3 -> diceList[5].id.setImageResource(R.drawable.dice_red_3_locked)
                    4 -> diceList[5].id.setImageResource(R.drawable.dice_red_4_locked)
                    5 -> diceList[5].id.setImageResource(R.drawable.dice_red_5_locked)
                    6 -> diceList[5].id.setImageResource(R.drawable.dice_red_6_locked)
                }
            }
        }
    }
}
