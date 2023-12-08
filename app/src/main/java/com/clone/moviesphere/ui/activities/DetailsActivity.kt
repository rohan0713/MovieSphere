package com.clone.moviesphere.ui.activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.clone.moviesphere.R
import com.clone.moviesphere.databinding.ActivityDeatilsBinding
import com.clone.moviesphere.ui.adapters.CastAdapter

class DetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityDeatilsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityDeatilsBinding.inflate(layoutInflater).also { binding = it }.root)

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        window.statusBarColor = Color.TRANSPARENT

        binding.rvCast.layoutManager = LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCast.adapter = CastAdapter()

    }
}