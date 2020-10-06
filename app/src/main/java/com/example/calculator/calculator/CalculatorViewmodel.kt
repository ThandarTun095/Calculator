package com.example.calculator.calculator

import androidx.lifecycle.ViewModel

class CalculatorViewmodel : ViewModel() {

    private var res: Int = 0
//Add
    fun getAdd(): Int = res

    fun setAdd(num1: Int, num2: Int): Int {
        res = num1 + num2
        return res
    }
//Sub
    fun getSub(): Int = res

    fun setSub(num1: Int, num2: Int): Int {
        res = num1 - num2
        return res
    }
//Mult
    fun getMult(): Int = res

    fun setMult(num1: Int, num2: Int): Int {
        res = num1 * num2
        return res
    }
//Div
    fun getDiv(): Int = res

    fun setDiv(num1: Int, num2: Int) : Int{
        res = num1 / num2
        return res
    }

}