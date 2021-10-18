package com.example.remainingassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class SimpleCalculator : AppCompatActivity() {

    private lateinit var firstNumber: EditText
    private lateinit var secondNumber: EditText
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_calculator)

        firstNumber = findViewById(R.id.simple_calculator_ed_first_number)
        secondNumber = findViewById(R.id.simple_calculator_ed_second_number)
        result = findViewById(R.id.simple_calculator_tv_result)

    }

    fun plus(view: View) {
        try {
            val num1 = firstNumber.text.toString()!!.toFloat()
            val num2 = secondNumber.text.toString()!!.toFloat()
            result.text = (num1 + num2).toString()
        }catch (e: Exception){
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
        }
    }
    fun division(view: View) {
        try {
            val num1 = firstNumber.text.toString()!!.toFloat()
            val num2 = secondNumber.text.toString()!!.toFloat()
            result.text = (num1 / num2).toString()
        }catch (e: Exception){
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
        }
    }
    fun multiply(view: View) {
        try {
            val num1 = firstNumber.text.toString()!!.toFloat()
            val num2 = secondNumber.text.toString()!!.toFloat()
            result.text = (num1 * num2).toString()
        }catch (e: Exception){
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
        }
    }
    fun minus(view: View) {
        try {
            val num1 = firstNumber.text.toString()!!.toFloat()
            val num2 = secondNumber.text.toString()!!.toFloat()
            result.text = (num1 - num2).toString()
        }catch (e: Exception){
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
        }
    }
}