package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashBoardActivity : AppCompatActivity() {

    private lateinit var loginButton: Button
    private lateinit var signupButton: Button
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        loginButton = findViewById(R.id.login_button)
        signupButton = findViewById(R.id.signup_button)
        registerButton = findViewById(R.id.register_button)

        loginButton.setOnClickListener {
            val intent = Intent(this@DashBoardActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        signupButton.setOnClickListener {
            val intent = Intent(this@DashBoardActivity, SignupActivity::class.java)
            startActivity(intent)
        }

        registerButton.setOnClickListener {

        }
    }
}
