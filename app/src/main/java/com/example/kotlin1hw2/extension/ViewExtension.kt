package com.example.kotlin1hw2.extension

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(context: Context, url: String) {
    Glide.with(this).load(url).into(this)

}

