package com.learning.msgsharingapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Reading Message Data from Main Activity Screen
        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("user_message")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        navigatedMsg.text = msg
    }
}