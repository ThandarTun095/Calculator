package com.example.calculator.calculator

import androidx.lifecycle.ViewModel

class Sub : ViewModel() {

    private var res: Int =0

    fun getCount(): Int = res

    fun setCount(num1: Int, num2: Int) : Int{
        res = num1 - num2
        return res
    }
}