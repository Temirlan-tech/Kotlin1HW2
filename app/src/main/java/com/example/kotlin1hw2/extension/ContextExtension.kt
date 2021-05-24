package com.example.kotlin1hw2.extension

import android.content.Context
import android.net.Uri
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

fun Context.showMessage(message: String?) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Any.random(arrayImage: MutableList<String>) : String {
     if (!arrayImage.isNullOrEmpty()) {
         return   arrayImage.random()
    }
    return arrayImage[1]
}