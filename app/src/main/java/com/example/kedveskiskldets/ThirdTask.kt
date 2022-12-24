package com.example.kedveskiskldets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second_task_irodalom.*
import kotlinx.android.synthetic.main.third_task.*

class ThirdTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_task)


        var anwserList = listOf<String>("íróasztal", "iroasztal", "Iroasztal", "Íróasztal", "IROASZTAL", "ÍRÓASZTAL")


        thirdTaskCheckButton.setOnClickListener {
            if (thirdTaskAnwserTextInput.text.toString() in anwserList) {
                startActivity(Intent(this, kiegSakk::class.java))

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