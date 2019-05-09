package com.example.bmicalculator

import kotlin.math.pow

class Calculator(val height: Double, val weight: Double) {

    fun calculateBMI(): Double{
        return weight/(height/100).pow(2)
    }

}