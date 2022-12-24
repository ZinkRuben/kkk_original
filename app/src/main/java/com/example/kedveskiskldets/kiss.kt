package com.example.kedveskiskldets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kiss.*

class kiss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kiss)
        var counter = 0
        kiss_button.setOnClickListener {
        when (counter) {
            0 -> {
                val kissText0 = "Umm mégegyszer"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, kissText0, duration)
                toast.show()
                counter += 1
            }
            1 -> {
                val kissText1 = "Meg mégegyszer"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, kissText1, duration)
                toast.show()
                counter += 1
            }
            2 -> {
                val kissText2 = "Meg most mégegyszer =)"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, kissText2, duration)
                toast.show()
                counter += 1
            }
            3 -> {
                val kissText3 = "MEEEEEEG mégegyszer, utoljára"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, kissText3, duration)
                toast.show()
                counter += 1
            }
            4 -> {
                val kissText4 = "Najó még most egyszer, de mostmár továbbmehetsz szerelmem"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, kissText4, duration)
                toast.show()
                startActivity(Intent(this, ThirdTask::class.java))
            }
        }



        }


    }
}