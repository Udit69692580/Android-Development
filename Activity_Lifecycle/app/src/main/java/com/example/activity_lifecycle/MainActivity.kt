package com.example.activity_lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"This is a Oncreate method",Toast.LENGTH_SHORT).show()
    }

    override fun onStart(){
        super.onStart()
        Log.d("TAG","onStart:")
        Toast.makeText(this,"This is a onStart method",Toast.LENGTH_SHORT).show()
    }
    override fun onResume(){
        super.onResume()
        Log.d("TAG","onResume:")
        Toast.makeText(this,"This is a onResume method",Toast.LENGTH_SHORT).show()
    }
    override fun onPause(){
        super.onPause()
        Log.d("TAG","onPause:")
        Toast.makeText(this,"This is a onPause method",Toast.LENGTH_SHORT).show()
    }
    override fun onStop(){
        super.onStop()
        Log.d("TAG","onStop:")
        Toast.makeText(this,"This is a onStop method",Toast.LENGTH_SHORT).show()
    }
    override fun onRestart(){
        super.onRestart()
        Log.d("TAG","onRestart:")
        Toast.makeText(this,"This is a onRestart method",Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("TAG","onDestroy:")
        Toast.makeText(this,"This is a onDestroy method",Toast.LENGTH_SHORT).show()
    }

}