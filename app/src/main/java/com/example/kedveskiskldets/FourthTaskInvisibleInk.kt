package com.example.kedveskiskldets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_fourth_task_invisible_ink.*
import kotlinx.android.synthetic.main.activity_second_task_irodalom.*
import kotlinx.android.synthetic.main.third_task.*

class FourthTaskInvisibleInk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_task_invisible_ink)
    fourthTaskCheckButton.setOnClickListener{
        if (fourthTaskEditTaskNumber.text.toString() == "1689") {
            startActivity(Intent(this, coordinatesTheEnd::class.java))
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