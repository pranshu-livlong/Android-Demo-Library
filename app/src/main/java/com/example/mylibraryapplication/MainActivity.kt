package com.example.mylibraryapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydemolibrary.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.simpleToast(applicationContext,"TOAST FROM THE LIBRARY")

    }
}