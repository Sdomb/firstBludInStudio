package com.example.firstbludinstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
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
        setContentView(R.layout.activity_nine)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.nine)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.text)
        val editText = findViewById<EditText>(R.id.edit_text)
        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)

        button.setOnClickListener {
            if (checkBox.isChecked ) {
                if (editText.text.isNotBlank()) {
                    textView.text = editText.text
                    progressBar.progress = (progressBar.progress + 10).coerceAtMost(progressBar.max)
                }
                else {
                    val toast = Toast.makeText(this, "Сначала введи текст", Toast.LENGTH_LONG)
                    toast.setGravity(Gravity.TOP, 100, 100)
                    toast.show()
                }
            }
            else {
                textView.text = "put checkbox"
            }
        }
    }
}