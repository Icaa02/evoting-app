package com.app.myvoting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, ScanNfcActivity::class.java))
            finish()
        }, 2000)
    }
}