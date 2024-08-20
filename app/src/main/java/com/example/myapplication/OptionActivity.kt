package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OptionActivity : AppCompatActivity() {
    private lateinit var cd: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_option)
       cd = findViewById(R.id.card1)
        cd.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}