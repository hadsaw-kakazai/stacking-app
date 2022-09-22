package com.example.permissionapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun intentFunction(view: View){

        intent = Intent(this,secondScreen::class.java)
        intent.putExtra("username","hadsaw")


        startActivity(intent)
    }
}