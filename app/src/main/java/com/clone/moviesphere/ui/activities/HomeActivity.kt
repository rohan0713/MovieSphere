package com.clone.moviesphere.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clone.moviesphere.R
import com.clone.moviesphere.databinding.ActivityHomeBinding
import com.clone.moviesphere.ui.adapters.PageAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityHomeBinding.inflate(layoutInflater).also { binding = it }.root)

        window.statusBarColor = getColor(R.color.background)

        val pageAdapter = PageAdapter(this)
        binding.viewPager.adapter = pageAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "All"
                1 -> tab.text = "Movies"
                2 -> tab.text = "TV shows"
                3 -> tab.text = "Trending"
                4 -> tab.text = "Kids"
                5 -> tab.text = "Sports"
            }
        }.attach()

        binding.viewPager.setCurrentItem(1, true)
    }
}