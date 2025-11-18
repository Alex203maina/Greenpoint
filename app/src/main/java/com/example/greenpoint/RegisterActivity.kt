package com.example.greenpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

  private lateinit var signUpButton: Button
  private lateinit var loginLink: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_register)

    // Initialize views
    signUpButton = findViewById(R.id.signUpButton)
    loginLink = findViewById(R.id.loginLink)

    // Set click listener for Sign Up button
    signUpButton.setOnClickListener {
      // Here you would handle registration logic
      // For now, redirect to login screen
      val intent = Intent(this, LoginActivity::class.java)
      startActivity(intent)
      finish() // Close register activity
    }

    // Set click listener for Login link
    loginLink.setOnClickListener {
      // Redirect to LoginActivity
      val intent = Intent(this, LoginActivity::class.java)
      startActivity(intent)
    }
  }
}
