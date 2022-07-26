package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ron.splashactivity.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    lateinit var binding:ActivityPaymentBinding
//    lateinit var btngo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding= ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        btngo=findViewById(R.id.btngo)
//        btngo.setOnClickListener {
//            val intent=Intent(this,PaymentActivity::class.java)
//            startActivity(intent)
//        }
    }
}