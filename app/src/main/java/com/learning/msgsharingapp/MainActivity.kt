package com.learning.msgsharingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener{
            // Code
            Log.i("MainActivity", "Btn was clicked")
            Toast.makeText(this, "Show Toast Button was clicked", Toast.LENGTH_SHORT).show()
        }

        sendMsgToNextActivity.setOnClickListener {
            val message: String = userMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
