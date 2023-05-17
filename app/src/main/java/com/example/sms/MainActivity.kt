package com.example.sms

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat


class MainActivity : AppCompatActivity() {
    private lateinit var phno : EditText
    private lateinit var smstxt : EditText
    lateinit var btnsend : Button
    val obj = SmsManager.getDefault()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phno = findViewById(R.id.phno)
        smstxt = findViewById(R.id.smstxt)
        btnsend = findViewById(R.id.btnsend)

        btnsend.setOnClickListener {
            try {
                var obj = SmsManager.getDefault()
                obj.sendTextMessage(phno.text.toString(), null, smstxt.text.toString(), null, null)
                Toast.makeText(applicationContext, "SMS Sent", Toast.LENGTH_LONG).show()
            }
            catch(e: Exception){
                Toast.makeText(applicationContext, "Error", Toast.LENGTH_LONG).show()
            }
        }
    }
}