package com.example.greenpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  private lateinit var getStartedButton: Button
  private lateinit var loginText: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Initialize views
    getStartedButton = findViewById(R.id.getStartedButton)
    loginText = findViewById(R.id.loginText)

    // Set click listener for GET STARTED button
    getStartedButton.setOnClickListener {
      // Redirect to RegisterActivity
      val intent = Intent(this, RegisterActivity::class.java)
      startActivity(intent)
    }

    // Set click listener for login text
    loginText.setOnClickListener {
      // Redirect to LoginActivity
      val intent = Intent(this, LoginActivity::class.java)
      startActivity(intent)
    }
  }
}
