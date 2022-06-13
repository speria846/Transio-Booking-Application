package com.ron.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.HandlerThread
import java.util.logging.Handler

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this,LoginActivity::class.java))

//        Handler().postDelayed({
//            val intent = Intent(this,LoginActivity::class.java)
//            startActivity(intent)
//            finish();
//
//      },delayMillis:8000)
    }
}