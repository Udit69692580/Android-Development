package com.example.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var add: Button
    private lateinit var sub: Button
    private lateinit var mul: Button
    private lateinit var results: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the views
        num1 = findViewById(R.id.eNum1)
        num2 = findViewById(R.id.eNum2)
        add = findViewById(R.id.btnAdd)
        sub = findViewById(R.id.btnSub)
        mul = findViewById(R.id.btnMul)
        results = findViewById(R.id.res)

        // Set click listeners for buttons
        add.setOnClickListener {
            performOperation { n1, n2 -> n1 + n2 }
        }

        sub.setOnClickListener {
            performOperation { n1, n2 -> n1 - n2 }
        }

        mul.setOnClickListener {
            performOperation { n1, n2 -> n1 * n2 }
        }
    }

    // Function to perform the operation and handle input validation
    private fun performOperation(operation: (Int, Int) -> Int) {
        val n1 = num1.text.toString().toIntOrNull()
        val n2 = num2.text.toString().toIntOrNull()

        if (n1 == null || n2 == null) {
            results.text = "Please enter valid numbers"
        } else {
            val result = operation(n1, n2)
            results.text = "Result: $result"
        }
    }
}
