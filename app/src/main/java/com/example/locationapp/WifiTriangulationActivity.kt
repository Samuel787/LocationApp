package com.example.locationapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.rtt.WifiRttManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class WifiTriangulationActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wifi_triangulation)
        executeRangingWithRTT()
    }

    @RequiresApi(Build.VERSION_CODES.P)
    fun executeRangingWithRTT() {
        // step 1: Check whether the device supports WIFI RTT
//        val supportsWifiRTT = applicationContext.packageManager.hasSystemFeature(PackageManager.FEATURE_WIFI_RTT)
//        if(!supportsWifiRTT){
//            Toast.makeText(applicationContext, "Device does not support WIFI RTT", Toast.LENGTH_LONG).show()
//            return
//        }

//        val rttManager = this.getSystemService(Context.WIFI_RTT_RANGING_SERVICE)
//        Log.v("Samuel", "Rtt manager exists ${applicationContext.javaClass.name}")
//        Log.v("Samuel", "Class type: ${rttManager is WifiRttManager}")

//        // step 2: Check whether WIFI RTT is available
//        val filter = IntentFilter(WifiRttManager.ACTION_WIFI_RTT_STATE_CHANGED)
//        val wifiRttManager = applicationContext.getSystemService(Context.WIFI_RTT_RANGING_SERVICE) as WifiRttManager
//        val myReceiver = object: BroadcastReceiver() {
//            override fun onReceive(p0: Context?, p1: Intent?) {
//                if(wifiRttManager.isAvailable) {
//                    Toast.makeText(applicationContext, "wifiRTTManager Is Available", Toast.LENGTH_LONG).show()
//                } else {
//                    Toast.makeText(applicationContext, "wifiRTTManager Is Not Available", Toast.LENGTH_LONG).show()
//                }
//            }
//        }
//        applicationContext.registerReceiver(myReceiver, filter)

    }
}