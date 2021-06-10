package com.example.pictures

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PictureTwo : AppCompatActivity() {
    lateinit var btnBack1:Button
    lateinit var btnNext:Button
    lateinit var tvText2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_two)

        views()
        click2()
    }
    fun views(){
        btnBack1=findViewById<Button>(R.id.btnBack1)
        btnNext=findViewById<Button>(R.id.btnNext)
        tvText2=findViewById<TextView>(R.id.tvText2)
    }
    fun click2(){
        btnBack1.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext.setOnClickListener {
            var intent=Intent(baseContext,PictureThree::class.java)
            startActivity((intent))

        }
    }
}