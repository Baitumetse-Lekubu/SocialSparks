package com.example.socialsparks

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity is the core logic of the Social Spark App.
 * This class handles user input and suggests social actions.
 */
class MainActivity : AppCompatActivity() {

    private val tag = "SocialSparkEvents"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connecting our Kotlin code to our XML layout
        val etTimeInput = findViewById<EditText>(R.id.etTimeInput)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        Log.i(tag, "App initialized successfully.")
        btnGenerate.setOnClickListener {
            // Get user text, remove extra spaces, and make lowercase for easy matching
            val input = etTimeInput.text.toString().trim().lowercase()

            Log.d(tag, "User clicked Generate. Input: $input")

            // If statement logic for social spark suggestion
            val sparkMessage = if (input == "morning") {
                "Send a 'Good morning' text to a family member."
            } else if (input == "mid-morning") {
                "Reach out to a colleague with a quick 'Thank you'."
            } else if (input == "afternoon") {
                "Share a funny meme or interesting link with a friend."
            } else if (input == "afternoon snack time") {
                "Send a quick 'thinking of you' message."
            } else if (input == "dinner") {
                "Call a friend or relative for a 5-minute catch-up."
            } else if (input == "after dinner" || input == "night") {
                "Leave a thoughtful comment on a friend's post."
            } else if (input.isEmpty()) {
                // Error Handling for Empty input
                Log.w(tag, "Empty input detected.")
                "Please enter a time of day."
            } else {
                // Error Handling for Invalid input
                Log.e(tag, "Invalid input: $input")
                " I don't recognize '$input'. Try typing 'Morning' or 'Dinner'!"
            }
            tvResult.text = sparkMessage
        }

        // Reset button logic
        btnReset.setOnClickListener {
            etTimeInput.text.clear()
            tvResult.text = ""
            Log.i(tag, "User reset the application.")
        }
    }
}