package com.clone.moviesphere.ui.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.clone.moviesphere.R
import com.clone.moviesphere.databinding.FragmentMoviesBinding
import com.clone.moviesphere.ui.adapters.MovieAdapter


class MoviesFragment : Fragment() {

    lateinit var binding: FragmentMoviesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMoviesBinding.inflate(layoutInflater)

        binding.rvRecent.layoutManager = LinearLayoutManager(binding.root.context, LinearLayoutManager.VERTICAL, false)
        binding.rvRecent.adapter = MovieAdapter()
        requireActivity().window.navigationBarColor = Color.BLACK
        return binding.root
    }
}