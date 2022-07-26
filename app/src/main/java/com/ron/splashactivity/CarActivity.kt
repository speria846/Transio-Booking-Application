package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ron.splashactivity.databinding.ActivityCarBinding

class CarActivity : AppCompatActivity() {
    lateinit var binding:ActivityCarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent=Intent(this,PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}