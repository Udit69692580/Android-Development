package com.example.loginpage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val editTextUserName: EditText = findViewById(R.id.editTextText)
        val editTextPassword: EditText = findViewById(R.id.editTextText2)
        val buttonLogin: Button = findViewById(R.id.button2)
        val buttonReset: Button = findViewById(R.id.button)

        buttonLogin.setOnClickListener {
            val userName = editTextUserName.text.toString()
            val password = editTextPassword.text.toString()

            if (userName == "Udit" && password == "123") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }

        buttonReset.setOnClickListener {
            editTextUserName.text.clear()
            editTextPassword.text.clear()
        }
    }
}
