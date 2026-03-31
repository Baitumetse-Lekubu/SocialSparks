package com.example.socialsparks

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity: The core logic of the Social Spark App.
 * This class handles user input and suggests social actions.
 */
class MainActivity : AppCompatActivity() {

    // Tag for Logcat debugging
    private val tag = "SocialSparkEvents"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. LINKING: Connecting our Kotlin code to our XML layout IDs
        val etTimeInput = findViewById<EditText>(R.id.etTimeInput)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        Log.i(tag, "App initialized successfully.")

        // 2. GENERATE BUTTON LOGIC
        btnGenerate.setOnClickListener {
            // Get user text, remove extra spaces, and make lowercase for easy matching
            val input = etTimeInput.text.toString().trim().lowercase()

            Log.d(tag, "User clicked Generate. Input: $input")

            // 3. IF-STATEMENT LOGIC (Requirement: Social Spark Suggestion Logic)
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
                // Error Handling: Empty input
                Log.w(tag, "Empty input detected.")
                "Please enter a time of day."
            } else {
                // Error Handling: Invalid input (Requirement 3)
                Log.e(tag, "Invalid input: $input")
                " I don't recognize '$input'. Try typing 'Morning' or 'Dinner'!"
            }

            // Update the UI with the suggestion
            tvResult.text = sparkMessage
        }

        // 4. RESET BUTTON LOGIC (Requirement 1)
        btnReset.setOnClickListener {
            etTimeInput.text.clear()
            tvResult.text = ""
            Log.i(tag, "User reset the application.")
        }
    }
}