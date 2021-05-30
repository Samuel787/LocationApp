package com.example.locationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViewListeners()
    }

    fun initializeViewListeners() {
        val wifiTriangulationButton = findViewById<Button>(R.id.wifi_triangulation_button)
        wifiTriangulationButton.setOnClickListener{ _ ->
            openWifiTriangulationActivity()
        }
    }

    fun openWifiTriangulationActivity() {
        val intent = Intent(this, WifiTriangulationActivity::class.java)
        startActivity(intent)
    }
}