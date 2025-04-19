package com.example.firstbludinstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())
        enableEdgeToEdge()
        setContentView(R.layout.activity_five)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.five)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textInput = findViewById<EditText>(R.id.input)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val t = textInput.text.toString()
            Log.d("MY MESSAGE", "Ddtltyysq ntrcn $t")
            Timber.d("ТИШИНА! ТИМБЕР ГОВОРИТ! $t")

        }
    }
}