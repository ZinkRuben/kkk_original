package com.example.kedveskiskldets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second_task_irodalom.*

class SecondTaskIrodalom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task_irodalom)
        var alliterationList = listOf<String>("alliteráció", "alliterál", "alliteration", "alliterate","Alliteráció","ALLITERÁCIÓ","alliteracio", "Alliteracio")

        secondTaskButton.setOnClickListener {
            if (secondTaskEditText.text.toString() in alliterationList) {
                startActivity(Intent(this, kiss::class.java))
            }
            else {
                val hibatext = "Nem jó ez a megoldás :("
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, hibatext, duration)
                toast.show()
            }



        }
    }




}