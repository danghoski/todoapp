package com.aghogho.todoapp

import android.content.Intent
import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class ProfileActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        profileButton = findViewById(R.id.profileButton)

        usernameDisplay.text = intent.getStringExtra("Username")

        profileButton.setOnClickListener {
            profileButton
        }

 

    }
}