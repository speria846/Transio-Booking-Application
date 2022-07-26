package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.ron.splashactivity.databinding.ActivityPickRideBinding

class PickRideActivity : AppCompatActivity() {
    lateinit var binding:ActivityPickRideBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPickRideBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val intent=Intent(this,CarActivity::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener {
            val intent=Intent(this,CarBActivity::class.java)
            startActivity(intent)
        }
        binding.button3.setOnClickListener {
            val intent=Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }
//        binding.imgcarB.setOnClickListener {
//            val intent=Intent(this,ImageActivity::class.java)
//            startActivity(intent)
//        }
    }
}