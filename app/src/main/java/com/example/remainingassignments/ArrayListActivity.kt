package com.example.remainingassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class ArrayListActivity : AppCompatActivity() {

    private lateinit var names: MutableList<String>
    private lateinit var tv: TextView
    private lateinit var nameInput: EditText
    private lateinit var numberInput: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array_list)

        names = mutableListOf()
        tv = findViewById(R.id.activity_array_tv_name)
        nameInput = findViewById(R.id.activity_array_ed_name)
        numberInput = findViewById(R.id.activity_array_ed_number)


    }

    fun addName(view: View) {
        val name = nameInput.text.toString()
        if(name.isNotEmpty()) {
            names.add(name)
            Toast.makeText(this, "$name added successfully", Toast.LENGTH_LONG).show()
        }
    }
    fun displayName(view: View) {
        try {
            val num = numberInput.text.toString()!!.toInt() - 1
            if( names.size > 0 && (0 <= num || num >= names.size))
                tv.text = names[num]
        }catch (e: Exception){

        }
    }
}