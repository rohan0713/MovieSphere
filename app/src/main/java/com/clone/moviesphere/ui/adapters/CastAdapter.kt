package com.clone.moviesphere.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.clone.moviesphere.databinding.CastItemBinding

class CastAdapter : RecyclerView.Adapter<CastAdapter.ViewHolder>() {

    lateinit var binding: CastItemBinding

    inner class ViewHolder(itemView: CastItemBinding) : RecyclerView.ViewHolder(itemView.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = CastItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }
}