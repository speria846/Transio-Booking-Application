package com.ron.splashactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ron.splashactivity.databinding.ActivitySeatBinding

class SeatActivity : AppCompatActivity() {
    lateinit var binding:ActivitySeatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContentView(R.layout.activity_seat)
    }
}