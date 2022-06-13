package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaymentActivity : AppCompatActivity() {
    lateinit var btnreciept:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        btnreciept=findViewById(R.id.btnreciept)
        btnreciept.setOnClickListener {
            val intent=Intent(this,JourneyActivity::class.java)
            startActivity(intent)
        }
    }
}