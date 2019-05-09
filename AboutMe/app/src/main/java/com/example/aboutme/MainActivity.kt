package com.example.aboutme

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mailMeButton.setOnClickListener { composeEmail() }
    }


    fun composeEmail() {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:josip.j.markovic@gmail.com")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }





}
