package com.example.kedveskiskldets

import android.content.ClipData
import android.content.ClipDescription
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.DragEvent
import android.view.DragEvent.ACTION_DROP
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_first_task_r_o_y_g_b_i_v.*

class FirstTaskROYGBIV : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_task_r_o_y_g_b_i_v)

        val redCricle = findViewById<ImageView>(R.id.redCircle)

        llBottom.setOnDragListener(dragListener)
        llTop.setOnDragListener(dragListener)

        firstTaskButton.setOnClickListener {
            val first = llTop.getChildAt(0 ) == redCricle
            val second = llTop.getChildAt(1 ) == orangeCircle
            val third = llTop.getChildAt(2 ) == yellowCircle
            val fourth = llTop.getChildAt(3 ) == greenCircle
            val fifth = llTop.getChildAt(4 ) == blueCircle
            val sixth = llTop.getChildAt(5 ) == indigoCircle
            val seventh = llTop.getChildAt(6 ) == violetCircle



            if (first && second && third && fourth && fifth && sixth && seventh) {
                startActivity(Intent(this, SecondTaskIrodalom::class.java))
            }
            else {
                val hibatext = "Nem jó ez a megoldás :("
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, hibatext, duration)
                toast.show()

            }
        }
        redCricle.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            //it.visibility = View.INvisible
            true
        }

        orangeCircle.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            //it.visibility = View.INvisible
            true
        }

        yellowCircle.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            //it.visibility = View.INvisible
            true
        }

        greenCircle.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            //it.visibility = View.INvisible
            true
        }

        blueCircle.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            //it.visibility = View.INvisible
            true
        }

        indigoCircle.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            //it.visibility = View.INvisible
            true
        }

        violetCircle.setOnLongClickListener {
            val clipText = ""
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes, item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            //it.visibility = View.INvisible
            true
        }


    }

    //defining what will happen when after a drag started
    
    
    
    val dragListener = View.OnDragListener { view, event ->
        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)

            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                view.invalidate()
                true


            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                view.invalidate()
                true

            }

            DragEvent.ACTION_DRAG_LOCATION -> true
            DragEvent.ACTION_DRAG_EXITED -> {
                view.invalidate()
                true

            }
            DragEvent.ACTION_DROP -> {
                val item = event.clipData.getItemAt(0)
                val dragData = item.text
                view.invalidate()

                val v = event.localState as View
                val owner = v.parent as ViewGroup
                owner.removeView(v)
                val destination = view as LinearLayout
                destination.addView(v)
                v.visibility = View.VISIBLE
                true
            }
            DragEvent.ACTION_DRAG_ENDED -> {
                view.invalidate()
                true

            }
            else -> false

        }

    }
}
 
