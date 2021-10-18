package com.example.remainingassignments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var ed1: EditText
    private lateinit var ed2: EditText
    private lateinit var ed3: EditText
    private lateinit var ed4: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        ed1 = findViewById(R.id.recycler_view_activity_ed_phrase_one)
        ed2 = findViewById(R.id.recycler_view_activity_ed_phrase_two)
        ed3 = findViewById(R.id.recycler_view_activity_ed_phrase_three)
        ed4 = findViewById(R.id.recycler_view_activity_ed_phrase_four)

    }

    fun add(view: View) {
        val l = listOf(ed1.text.toString(), ed2.text.toString(), ed3.text.toString(), ed4.text.toString())
        Data.list.add(l)
        startActivity(Intent(this, RecyclerViewSecondActivity::class.java))
    }
}