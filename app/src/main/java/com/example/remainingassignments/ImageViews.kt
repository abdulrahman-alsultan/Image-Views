package com.example.remainingassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class ImageViews : AppCompatActivity() {

    private lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_views)

        image = findViewById(R.id.image_views_IV_coding_sda)
    }

    fun codingDojo(view: View) {
        image.setImageDrawable(resources.getDrawable(R.drawable.cd))
    }
    fun sda(view: View) {
        image.setImageDrawable(resources.getDrawable(R.drawable.sda))
    }
}