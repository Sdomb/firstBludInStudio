package com.example.firstbludinstudio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.baseFrame)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView: RecyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val listsAnimal = listOf(
            ViewModel(R.drawable.bear, "Медведь"),
            ViewModel(R.drawable.deer, "Олень"),
            ViewModel(R.drawable.duck, "Утка"),
            ViewModel(R.drawable.giraf, "Жираф"),
            ViewModel(R.drawable.lion, "Лев"),
            ViewModel(R.drawable.pandas, "Панда"),
            ViewModel(R.drawable.rabb, "Кролик"),
            ViewModel(R.drawable.racc, "Енотик"),
            ViewModel(R.drawable.redrac, "Енотовидная лиса"),
            ViewModel(R.drawable.squir, "Белка"),
            ViewModel(R.drawable.tiger, "Тигр"))

        val adapter = MyRecyclerAdapter(listsAnimal)
        recyclerView.adapter = adapter
    }
}