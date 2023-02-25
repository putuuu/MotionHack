package com.example.hackmotion.fragment.home.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackmotion.R
import com.example.hackmotion.dataSource.RecyclerViewClickListener
import com.example.hackmotion.fragment.home.transaction.RvCallAdapterDone
import com.example.hackmotion.fragment.model.LiveStream
import de.hdodenhof.circleimageview.CircleImageView

class  RvLsAdapter (private val items: List<LiveStream>) : RecyclerView.Adapter<RvLsAdapter.ViewHolder>(){
    class ViewHolder (ItemView: View) : RecyclerView.ViewHolder(ItemView){
        var nama = ItemView.findViewById<TextView>(R.id.usernamels)
        var judul = ItemView.findViewById<TextView>(R.id.titlels)
        var profile = ItemView.findViewById<ImageView>(R.id.profilels)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_live_streaming, parent, false)

        return RvLsAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = items[position]

        holder.nama.text = ItemsViewModel.nama
        holder.judul.text = ItemsViewModel.Judul
        Glide.with(holder.itemView.context)
            .load(ItemsViewModel.profil)
            .into(holder.profile);
    }

    override fun getItemCount(): Int {
        return items.size
    }


}