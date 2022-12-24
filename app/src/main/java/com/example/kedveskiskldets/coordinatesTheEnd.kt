package com.example.kedveskiskldets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import kotlinx.android.synthetic.main.activity_coordinates_the_end.*

class coordinatesTheEnd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinates_the_end)

        textViewLink.setMovementMethod(LinkMovementMethod.getInstance());
    }
}