package com.ron.splashactivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import com.speriabreria.workoutlog.SignupActivity

class LoginActivity : AppCompatActivity() {
    lateinit var tiEmail:TextInputLayout
    lateinit var etEmail:EditText
    lateinit var tilPassward:TextInputLayout
    lateinit var etPassward:EditText
    lateinit var btnLogin:Button
    lateinit var tvSignUp:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tiEmail=findViewById(R.id.tiEmail)
        etEmail=findViewById(R.id.etEmail)
        tilPassward=findViewById(R.id.tilPasward)
        etPassward=findViewById(R.id.etPassward)
        btnLogin=findViewById(R.id.btnLogin)
        tvSignUp=findViewById(R.id.tvSignUp)
        btnLogin.setOnClickListener{ validation()}
        tvSignUp.setOnClickListener {
            val intent=Intent(this,SignupActivity::class.java)
             startActivity(intent)
        }
        btnLogin.setOnClickListener {
            val intent=Intent(this,DestinyActivity::class.java)
            startActivity(intent)
        }
    }
    fun validation(){
        var error = false
        tiEmail.error = null
        tilPassward.error = null
        var email=etEmail.text.toString()
        if (email.isBlank()){
            tiEmail.error="the user name is required"
            error=true
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tiEmail.error="Not a valid email address"
            error=true
        }

        var passward=etPassward.text.toString()
        if (passward.isBlank()) {
            tilPassward.error = "the user name is required"
            error = true
        }

            if (error != true) {


            }

        }
    }


