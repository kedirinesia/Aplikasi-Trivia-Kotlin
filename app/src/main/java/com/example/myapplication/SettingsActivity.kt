package com.example.myapplication

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.edit
import com.google.android.material.card.MaterialCardView

class SettingsActivity : AppCompatActivity() {

    private lateinit var switchDarkMode: Switch
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)


        sharedPreferences = getSharedPreferences("AppPreferences", MODE_PRIVATE)


        switchDarkMode = findViewById(R.id.switchDarkMode)


        val isDarkMode = sharedPreferences.getBoolean("dark_mode", false)
        switchDarkMode.isChecked = isDarkMode
        updateTheme(isDarkMode)


        switchDarkMode.setOnCheckedChangeListener { _: CompoundButton?, isChecked: Boolean ->

            sharedPreferences.edit {
                putBoolean("dark_mode", isChecked)
            }

            updateTheme(isChecked)
        }
    }

    private fun updateTheme(isDarkMode: Boolean) {
        if (isDarkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }
}
