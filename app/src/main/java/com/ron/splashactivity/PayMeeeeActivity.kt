package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ron.splashactivity.databinding.ActivityPayMeeeeBinding

class PayMeeeeActivity : AppCompatActivity() {
    lateinit var binding:ActivityPayMeeeeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPayMeeeeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button8.setOnClickListener {
            val intent= Intent(this,SafeActivity::class.java)
            startActivity(intent)

        }
    }

}