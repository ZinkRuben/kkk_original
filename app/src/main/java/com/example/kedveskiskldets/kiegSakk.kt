package com.example.kedveskiskldets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kieg_sakk.*
import kotlinx.android.synthetic.main.activity_main2.*

class kiegSakk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kieg_sakk)

        sakkTovabblepesGomb.setOnClickListener {
            startActivity(Intent(this, FourthTaskInvisibleInk::class.java))
        }



    }
}