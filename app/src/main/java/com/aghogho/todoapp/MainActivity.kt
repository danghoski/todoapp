package com.aghogho.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {

    val validUsername = "admin"
    val validPassword = "admin"

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.userNameInput)
        passwordInput = findViewById(R.id.passWordInput)
        submitButton = findViewById(R.id.SubmitBotton)

        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            login(username, password)
        }

    }

    private fun login(username: String, password: String) {
        if (isValidCredentials(username, password)) {
            val intent: Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("UserName", username)
            startActivity(intent)
        } else {
            Toast.makeText(applicationContext, "Wrong Password or Error in Network Connection, Please Try Again", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        if (username == validUsername && password == validPassword) return true
        return false
    }
}