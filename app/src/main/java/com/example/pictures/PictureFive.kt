package com.example.pictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.net.Inet4Address

class PictureFive : AppCompatActivity() {
    lateinit var btnBack4:Button
    lateinit var tvText5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_five)
        view5()
        click5()

    }
    fun view5(){
        btnBack4=findViewById<Button>(R.id.btnBack4)
        tvText5=findViewById<TextView>(R.id.tvText5)
    }
    fun click5(){
        btnBack4.setOnClickListener {
            var intent=Intent(baseContext,PictureFour::class.java)
            startActivity(intent)

        }

    }
}