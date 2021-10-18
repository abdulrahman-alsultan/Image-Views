package com.example.remainingassignments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun moveToButtonCounter(view: View){
        startActivity(Intent(this, ButtonCounter::class.java))
    }

    fun moveToPersistentCalculation(view: View) {
        startActivity(Intent(this, PersistentCalculation::class.java))
    }

    fun moveToArrayListActivity(view: View) {
        startActivity(Intent(this, ArrayListActivity::class.java))
    }

    fun moveToActivityLifecycle(view: View) {
        startActivity(Intent(this, ActivityLifecycle::class.java))
    }

    fun moveToSimpleCalculator(view: View) {
        startActivity(Intent(this, SimpleCalculator::class.java))
    }

    fun moveToImageViews(view: View) {
        startActivity(Intent(this, ImageViews::class.java))
    }
}