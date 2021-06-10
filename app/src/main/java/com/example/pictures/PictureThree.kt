package com.example.pictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PictureThree : AppCompatActivity() {
    lateinit var btnBack2:Button
    lateinit var btnNext3:Button
    lateinit var tvText3:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_three)

        veiw3()
        click3()
    }
    fun veiw3(){
        btnBack2=findViewById<Button>(R.id.btnBack2)
        btnNext3=findViewById<Button>(R.id.btnNext3)
        tvText3=findViewById<TextView>(R.id.tvText3)
    }
    fun click3(){
        btnNext3.setOnClickListener {
            var intent=Intent(baseContext,PictureFour::class.java)
            startActivity(intent)
        }
        btnBack2.setOnClickListener {
            var intent=Intent(baseContext,PictureTwo::class.java)
            startActivity(intent)
        }
    }

}