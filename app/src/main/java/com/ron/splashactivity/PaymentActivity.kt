package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaymentActivity : AppCompatActivity() {
    lateinit var btncont22:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        btncont22=findViewById(R.id.btncont22)
        btncont22.setOnClickListener {
            val intent=Intent(this,SafeActivity::class.java)
            startActivity(intent)
        }
    }
}