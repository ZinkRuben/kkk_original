package com.example.kedveskiskldets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        kiegfeladatJoGomb.setOnClickListener {
            startActivity(Intent(this, FirstTaskROYGBIV::class.java))
        }
        button.setOnClickListener {
            val hibatext = "Nem jó ez a megoldás :("
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, hibatext, duration)
            toast.show()
        }
        button2.setOnClickListener {
            val hibatext = "Nem jó ez a megoldás :("
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, hibatext, duration)
            toast.show()
        }
        button4.setOnClickListener {
            val hibatext = "Nem jó ez a megoldás :("
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, hibatext, duration)
            toast.show()
        }

    }
}