package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ron.splashactivity.databinding.ActivitySafeBinding

class SafeActivity : AppCompatActivity() {
    lateinit var binding:ActivitySafeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySafeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView18.setOnClickListener {
            val intent= Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }
    }
}