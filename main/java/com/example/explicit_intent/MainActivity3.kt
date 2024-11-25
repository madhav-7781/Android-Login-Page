package com.example.explicit_intent

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.explicit_intent.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private val binding : ActivityMain3Binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        binding.textView.text = "Welcome, $username!"

        binding.LogoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}