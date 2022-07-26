package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ron.splashactivity.databinding.ActivityCarBactivityBinding

class CarBActivity : AppCompatActivity() {
    lateinit var binding:ActivityCarBactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCarBactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnpay22.setOnClickListener {
            val intent=Intent(this,PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}