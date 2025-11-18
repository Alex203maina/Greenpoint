package com.example.greenpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

  private lateinit var loginButton: Button
  private lateinit var registerLink: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)

    // Initialize views
    loginButton = findViewById(R.id.loginButton)
    registerLink = findViewById(R.id.registerLink)

    // Set click listener for Login button
    loginButton.setOnClickListener {
      // Here you would validate credentials
      // For now, redirect to home/dashboard
      val intent = Intent(this, HomeActivity::class.java)
      startActivity(intent)
      finish() // Close login activity
    }

    // Set click listener for Register link
    registerLink.setOnClickListener {
      // Redirect to RegisterActivity
      val intent = Intent(this, RegisterActivity::class.java)
      startActivity(intent)
    }
  }
}
