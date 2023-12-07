package com.clone.moviesphere.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clone.moviesphere.R
import com.clone.moviesphere.databinding.ActivityHomeBinding
import com.clone.moviesphere.ui.adapters.PageAdapter

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityHomeBinding.inflate(layoutInflater).also { binding = it }.root)

        window.statusBarColor = getColor(R.color.background)
        binding.tabLayout.selectTab(binding.tabLayout.getTabAt(1))

        val pageAdapter = PageAdapter(this)
        binding.viewPager.adapter = pageAdapter
    }
}