package com.clone.moviesphere.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.clone.moviesphere.databinding.MoviesItemBinding

class MovieAdapter() : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    lateinit var binding: MoviesItemBinding
    inner class MovieViewHolder(itemView : MoviesItemBinding) : RecyclerView.ViewHolder(itemView.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        binding = MoviesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
    }

}