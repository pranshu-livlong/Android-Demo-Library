package com.example.mydemolibrary

import android.content.Context
import android.widget.Toast

class Toaster {

    companion object {
        fun simpleToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }

}