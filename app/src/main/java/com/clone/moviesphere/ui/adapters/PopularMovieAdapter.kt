package com.clone.moviesphere.ui.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.clone.moviesphere.databinding.PopularMovieItemBinding
import com.clone.moviesphere.ui.activities.DetailsActivity

class PopularMovieAdapter() : RecyclerView.Adapter<PopularMovieAdapter.ViewHolder>() {

    lateinit var binding: PopularMovieItemBinding
    inner class ViewHolder(itemView : PopularMovieItemBinding) : RecyclerView.ViewHolder(itemView.root) {
        fun bind(position: Int) {
            itemView.setOnClickListener {
                Intent(binding.root.context, DetailsActivity::class.java).also {
                    binding.root.context.startActivity(it)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = PopularMovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }
}