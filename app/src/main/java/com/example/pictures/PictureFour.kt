package com.example.pictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PictureFour : AppCompatActivity() {
    lateinit var btnBack3:Button
    lateinit var btnNext4:Button
    lateinit var tvText4:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_four)
        view4()
        click4()
    }

    fun view4(){
        btnBack3=findViewById<Button>(R.id.btnBack3)
        btnNext4=findViewById<Button>(R.id.btnNext4)
        tvText4=findViewById<TextView>(R.id.tvText4)
    }
    fun click4(){
        btnBack3.setOnClickListener {
            var intent=Intent(baseContext,PictureThree::class.java)
            startActivity(intent)
        }
        btnNext4.setOnClickListener {
            var intent=Intent(baseContext,PictureFive::class.java)
            startActivity(intent)


        }

    }
}