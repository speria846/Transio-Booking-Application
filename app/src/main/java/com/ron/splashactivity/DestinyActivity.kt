package com.ron.splashactivity

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.ron.splashactivity.databinding.ActivityDestinyBinding
import java.util.*

class DestinyActivity : AppCompatActivity() {
    lateinit var binding:ActivityDestinyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDestinyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView22.setOnClickListener {
            val intent=Intent(this,PickRideActivity::class.java)
            startActivity(intent)
        }
        binding.tvroutes.setOnClickListener {
            var intent=Intent(this,RouteaActivity::class.java)
            startActivity(intent)
        }
        val mPickTimeBtn = findViewById<Button>(R.id.pickDateBtn)
        val textView = findViewById<TextView>(R.id.dateTv)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        mPickTimeBtn.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                textView.setText("" + dayOfMonth + " " + month + ", " + year)
            }, year, month, day)
            dpd.show()
        }

    }
}
