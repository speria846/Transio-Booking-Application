package com.ron.splashactivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import com.ron.splashactivity.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val intent=Intent(this,DestinyActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignin.setOnClickListener{
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)
            validation()

        }
    }
    fun validation(){
        var error = false
        binding.tiEmail.error = null
        binding.tilPasward.error = null
        val email=binding.etEmail.text.toString()
        if (email.isBlank()){
            binding.tiEmail.error="The user name is required"
            error=true
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tiEmail.error="Not a valid email address"
            error=true
        }

        val passward=binding.etPassward.text.toString()
        if (passward.isBlank()) {
            binding.tilPasward.error = "The user name is required"
            error = true
        }

        if (error == true) {


            }

        }
    }


