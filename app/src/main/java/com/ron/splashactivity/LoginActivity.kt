package com.ron.splashactivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
class LoginActivity : AppCompatActivity() {
    lateinit var tiEmail:TextInputLayout
    lateinit var etEmail:EditText
    lateinit var tilPassward:TextInputLayout
    lateinit var etPassward:EditText
    lateinit var btnLogin:Button
    lateinit var tvsignup:TextView
    lateinit var btnSign:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tiEmail=findViewById(R.id.tiEmail)
        etEmail=findViewById(R.id.etEmail)
        tilPassward=findViewById(R.id.tilPasward)
        etPassward=findViewById(R.id.etPassward)
        btnLogin=findViewById(R.id.btnLogin)
        btnSign=findViewById(R.id.btnSign)
        tvsignup=findViewById(R.id.tvsignup)
        btnLogin.setOnClickListener{ validation()}
        btnLogin.setOnClickListener {
            val intent=Intent(this,DestinyActivity::class.java)
            startActivity(intent)
        }
        btnSign.setOnClickListener{
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)

        }
    }
    fun validation(){
        var error = false
        tiEmail.error = null
        tilPassward.error = null
        val email=etEmail.text.toString()
        if (email.isBlank()){
            tiEmail.error="The user name is required"
            error=true
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tiEmail.error="Not a valid email address"
            error=true
        }

        val passward=etPassward.text.toString()
        if (passward.isBlank()) {
            tilPassward.error = "The user name is required"
            error = true
        }

        if (error == true) {


            }

        }
    }


