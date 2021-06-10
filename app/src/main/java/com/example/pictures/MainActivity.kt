package com.example.pictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnNext:Button
    lateinit var tvText1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        views()
        click()


    }
    fun views(){

        btnNext=findViewById<Button>(R.id.btnNext1)
        tvText1=findViewById<TextView>(R.id.tvText1)
    }
    fun click(){
        btnNext.setOnClickListener {
            val intent=Intent(baseContext,PictureTwo::class.java)
            startActivity(intent)
        }

    }
}
