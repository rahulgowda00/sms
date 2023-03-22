package com.example.sms

import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat


class MainActivity : AppCompatActivity() {

    lateinit var btnsend : Button
    val obj = SmsManager.getDefault()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsend = findViewById(R.id.btnsend)

        btnsend.setOnClickListener {
            try {
                var obj = SmsManager.getDefault()
                obj.sendTextMessage("9066951700", null, "hi", null, null)
                Toast.makeText(applicationContext, "SMS Sent!", Toast.LENGTH_LONG).show()
            }
            catch(e: Exception){
                Toast.makeText(applicationContext, "Error", Toast.LENGTH_LONG).show()
            }
        }
    }
}