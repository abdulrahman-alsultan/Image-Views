package com.example.remainingassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Data{
    companion object{
        val list = mutableListOf<List<String>>()
    }
}

class RecyclerViewSecondActivity : AppCompatActivity() {

    lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_second)

        rv = findViewById(R.id.rv)
        rv.adapter = RVAdapter(Data.list)
        rv.layoutManager = LinearLayoutManager(this)

        Toast.makeText(this, "size: ${Data.list.size}", Toast.LENGTH_LONG).show()
    }
}