package com.example.msterialdesign

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.materialdesign.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Ensure this matches your XML layout file name

        // Initialize the views
        val usernameInputLayout = findViewById<TextInputLayout>(R.id.main)
        val usernameEditText = findViewById<TextInputEditText>(R.id.imageView)
        val loginButton = findViewById<Button>(R.id.loginButton)

        // Set an onClickListener for the login button
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()

            if (username.isEmpty()) {
                // Display an error if the username field is empty
                usernameInputLayout.error = "Username cannot be empty"
            } else {
                // Clear any existing errors
                usernameInputLayout.error = null

                // Perform login (this is just a placeholder, you should replace this with your actual login logic)
                if (username == "admin") {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Invalid Username", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}