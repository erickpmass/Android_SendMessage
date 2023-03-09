package com.ds2.sendmessages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myapplication.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view:View)
    {
        val textMessage = findViewById<EditText>(R.id.TextMessage)
        //val displayMessage = findViewById<TextView>(R.id.Message)
        //displayMessage.text = TextMessage.text
        // Essas linhas mostram o valor de Message na própria Activity

        val message = textMessage.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra( EXTRA_MESSAGE,message)
    }
        startActivity(intent)
    }
}