package com.example.kotlin1hw2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1hw2.R
import com.example.kotlin1hw2.extension.loadImage
import com.example.kotlin1hw2.extension.random
import com.example.kotlin1hw2.extension.showMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var arrayImage = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getImages()
        randomImage()
        addImage()

    }

    private fun getImages() {
        arrayImage.add("https://klike.net/uploads/posts/2020-03/1583918415_11.jpg")
        arrayImage.add("https://proprikol.ru/wp-content/uploads/2020/08/kartinki-kyrgyzstan-3.jpg")
        arrayImage.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAhlBSYx-ep0P8iWnMZUNC0hBMUp1akGxMwA&usqp=CAU")
        arrayImage.add("https://u01.appmifile.com/images/2018/06/22/6e45c8a8-8860-40f9-b8f7-406a30361c6a.jpg")
        arrayImage.add("https://centralasia-adventures.com/image/new/the-nature-of-kyrgyzstan.jpg")
    }

    private fun addImage() {
        btn_add.setOnClickListener {
            if (edit_text.length() != 0){
                arrayImage.add(edit_text.text.toString())
            } else {
                showMessage(getString(R.string.toast))
            }
        }
    }

    private fun randomImage() {
        btn_random.setOnClickListener {
//            if (!arrayImage.isNullOrEmpty()) {
//                val url = arrayImage.random()
//                image_view.loadImage(this, url)
//            }
            image_view.loadImage(this, btn_random.random(arrayImage))
        }
    }

}

//Дз. Первоначально добавляем в массив 5 рандомных url картинок.
//В xml вы добавляете ImageView, EditText, Button, RandomButton
//При ввводе и нажатии кнопки submit в массив добавляете урл картинки
//при нажатии на рандомБаттон вы рандомно через глайд выводите картинку