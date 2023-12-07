package com.clone.moviesphere.main

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import com.clone.moviesphere.R
import com.clone.moviesphere.databinding.ActivityMainBinding
import com.clone.moviesphere.ui.activities.HomeActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).also { binding = it }.root)

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        window.statusBarColor = Color.BLACK

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            Intent(this@MainActivity, HomeActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }, 3000)
    }
}