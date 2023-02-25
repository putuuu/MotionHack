package com.example.hackmotion.fragment.home.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackmotion.R
import com.example.hackmotion.fragment.model.Kategori

class RVCategoryAdapter(private val items: List<Kategori>) : RecyclerView.Adapter<RVCategoryAdapter.ViewHolder>() {
    class ViewHolder (ItemView: View) : RecyclerView.ViewHolder(ItemView){
        var judul = ItemView.findViewById<TextView>(R.id.textViewcategory)
        var profile = ItemView.findViewById<ImageView>(R.id.imageView12)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_category, parent, false)

        return RVCategoryAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = items[position]

        holder.judul.text = ItemsViewModel.title
        holder.profile.setImageResource( ItemsViewModel.img)
    }

    override fun getItemCount(): Int {
        return items.size
    }

}