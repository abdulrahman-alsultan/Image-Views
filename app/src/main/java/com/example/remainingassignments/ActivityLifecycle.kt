package com.example.remainingassignments

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class ActivityLifecycle : AppCompatActivity() {

    private lateinit var lastSeen: TextView
    var str = ""

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onPause() {
        super.onPause()
        str += "\nLast seen on ${LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))}"
        lastSeen.text = str
    }

    override fun onRestart() {
        super.onRestart()
        str += "\nOnline"
        lastSeen.text = str
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        lastSeen = findViewById(R.id.activity_lifecycle_tv_lastSeen)

        str += "\nOnline"
        lastSeen.text = str

    }
}