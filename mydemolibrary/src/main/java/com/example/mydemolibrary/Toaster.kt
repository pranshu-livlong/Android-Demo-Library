package com.example.mydemolibrary

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast

class Toaster {

    companion object {
        fun simpleToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }

        fun showFullScreenDialog(context: Context) {
            val inflater = LayoutInflater.from(context)
            val view = inflater.inflate(R.layout.full_screen_dialog_layout, null)

            val dialog = AlertDialog.Builder(context)
                .setView(view)
                .setPositiveButton("OK") { dialog, _ ->
                    // Handle the OK button click
                    simpleToast(context, view.findViewById<EditText>(R.id.editText).text.toString())
                    dialog.dismiss()
                }
                .setNegativeButton("Cancel") { dialog, _ ->
                    // Handle the Cancel button click
                    dialog.dismiss()
                }
                .create()

            dialog.show()

//            val window = dialog.window
//            window?.setLayout(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//            )
//            window?.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
//

        }
    }

}