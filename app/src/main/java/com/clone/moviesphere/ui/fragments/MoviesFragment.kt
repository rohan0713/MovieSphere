package com.clone.moviesphere.ui.fragments

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.clone.moviesphere.R
import com.clone.moviesphere.databinding.FragmentMoviesBinding
import com.clone.moviesphere.ui.adapters.MovieAdapter
import com.clone.moviesphere.ui.adapters.PopularMovieAdapter


class MoviesFragment : Fragment() {

    lateinit var binding: FragmentMoviesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMoviesBinding.inflate(layoutInflater)

        val layoutManager = LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvRecent.layoutManager = layoutManager
        binding.rvRecent.adapter = MovieAdapter()

        binding.cvRight.setOnClickListener {
            binding.rvRecent.smoothScrollToPosition(layoutManager.findLastVisibleItemPosition() + 1)
            val num = layoutManager.findFirstVisibleItemPosition()
            Log.d("position", num.toString())
            if(num == 3){
                binding.cvRight.visibility = View.GONE
            }
        }

        if(layoutManager.findLastVisibleItemPosition() < 4){
            binding.cvRight.visibility = View.VISIBLE
        }

        requireActivity().window.navigationBarColor = Color.BLACK

        binding.rvPopular.layoutManager = LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvPopular.adapter = PopularMovieAdapter()

        binding.rvContinue.layoutManager = LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvContinue.adapter = PopularMovieAdapter()
        return binding.root
    }
}