package com.example.firstbludinstudio

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_four)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.four)) { v, insets -> main
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button?>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this,"Нажата Ok", Toast.LENGTH_LONG).show()
        }
    }
}