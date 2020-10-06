package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.calculator.CalculatorViewmodel
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var calculatorViewmodel = ViewModelProvider(this)
            .get(CalculatorViewmodel::class.java)

        btnAdd.setOnClickListener {
            var n1 = txtOne.text.toString().toInt()
            var n2 = txtTwo.text.toString().toInt()
            var res = calculatorViewmodel.setAdd(n1, n2)
            txtOutput.text = calculatorViewmodel.getAdd().toString()
        }

        btnSub.setOnClickListener {
            var n1 = txtOne.text.toString().toInt()
            var n2 = txtTwo.text.toString().toInt()
            var res = calculatorViewmodel.setSub(n1,n2)
            txtOutput.text = calculatorViewmodel.getSub().toString()
        }
        btnMul.setOnClickListener {
            var n1 = txtOne.text.toString().toInt()
            var n2 = txtTwo.text.toString().toInt()
            var res = calculatorViewmodel.setMult(n1,n2)
            txtOutput.text = calculatorViewmodel.getMult().toString()
        }
        btnDiv.setOnClickListener {
            var n1 = txtOne.text.toString().toInt()
            var n2 = txtTwo.text.toString().toInt()
            var res = calculatorViewmodel.setDiv(n1,n2)
            txtOutput.text = calculatorViewmodel.getMult().toString()
        }





    }
}