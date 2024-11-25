package com.example.explicit_intent

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.explicit_intent.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private val binding : ActivityMain2Binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.BackloginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.CreateAccountButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            val repassword = binding.RepasswordEditText.text.toString()

            if(username.isNotEmpty() && password.isNotEmpty() && repassword.isNotEmpty() && password == repassword){
                Toast.makeText(this, "Account created successfully, back to login", Toast.LENGTH_SHORT).show()
            }
        }
    }
}