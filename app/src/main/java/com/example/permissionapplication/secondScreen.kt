package com.example.permissionapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class secondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        val message = intent.getStringExtra("username")
        val text = findViewById<TextView>(R.id.display)
        text.text = message

    }

    fun clickscreen(view: View){
        val intent = Intent(this,thirdactivity::class.java)
        startActivity(intent)
    }
}