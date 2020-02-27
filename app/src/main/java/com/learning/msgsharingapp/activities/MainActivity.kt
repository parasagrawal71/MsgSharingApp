package com.learning.msgsharingapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.learning.msgsharingapp.R
import com.learning.msgsharingapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener{
            Log.i("MainActivity", "Btn was clicked")
            //Toast.makeText(this, "Show Toast Button was clicked", Toast.LENGTH_SHORT).show()

            // Use of Extension Function
            showToast("Show Toast Button was clicked")
        }

        sendMsgToNextActivity.setOnClickListener {
            val message: String = userMessage.text.toString()
            // Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            // Explicit Intent
            var intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message", message)
            startActivity(intent)
        }

        btnShareToApps.setOnClickListener {
            val message: String = userMessage.text.toString()

            // Implicit Intent
            var intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select the app: "))

        }

        btnRecyclerView.setOnClickListener {
            var intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
