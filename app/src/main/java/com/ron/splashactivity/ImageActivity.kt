package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ron.splashactivity.databinding.ActivityImageBinding


class ImageActivity : AppCompatActivity() {
    lateinit var binding:ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnpaynow.setOnClickListener {
            var intent=Intent(this,PaymentActivity::class.java)
            startActivity(intent)
        }

    }
}