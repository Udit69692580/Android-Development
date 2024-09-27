package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var fadeInAnim: Animation

    companion object {
        private const val SPLASH_SCREEN_DURATION = 3000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        fadeInAnim = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        // Apply animations to views
        val imageView: ImageView = findViewById(R.id.image)
        val logoTextView: TextView = findViewById(R.id.logo)
        val sloganTextView: TextView = findViewById(R.id.slogan)

        imageView.startAnimation(topAnim)
        logoTextView.startAnimation(bottomAnim)
        sloganTextView.startAnimation(fadeInAnim)

        // Navigate to LoginActivity after the splash screen duration
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN_DURATION.toLong())
    }
}
