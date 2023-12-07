package com.clone.moviesphere.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.clone.moviesphere.ui.fragments.MoviesFragment

class PageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> MoviesFragment()
            1 -> MoviesFragment()
            2 -> MoviesFragment()
            3 -> MoviesFragment()
            4 -> MoviesFragment()
            else -> MoviesFragment()
        }
    }
}