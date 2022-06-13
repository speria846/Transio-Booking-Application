package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PickRideActivity : AppCompatActivity() {
    lateinit var imgcarA:ImageButton
    lateinit var imagecarB:ImageButton
    lateinit var imageView13: ImageButton
    lateinit var imgcarB:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_ride)
        imgcarA=findViewById(R.id.imgcarA)
        imagecarB=findViewById(R.id.imagecarB)
        imgcarB=findViewById(R.id.imgcarB)
        imageView13=findViewById(R.id.imageView13)
        imgcarA.setOnClickListener {
            val intent=Intent(this,CarActivity::class.java)
            startActivity(intent)
        }
        imagecarB.setOnClickListener {
            val intent=Intent(this,CarBActivity::class.java)
            startActivity(intent)
        }
        imageView13.setOnClickListener {
            val intent=Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }
        imgcarB.setOnClickListener {
            val intent=Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }
    }
}