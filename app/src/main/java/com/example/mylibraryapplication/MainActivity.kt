package com.example.mylibraryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.mydemolibrary.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Toaster.simpleToast(applicationContext,"TOAST FROM THE LIBRARY")
        val hello = findViewById<TextView>(R.id.textViewHello)
        hello.setOnClickListener {
            Toaster.showFullScreenDialog(this)
        }
    }
}