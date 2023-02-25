package com.example.hackmotion.fragment.home.notification

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackmotion.R
import com.example.hackmotion.dataSource.RecyclerViewClickListener
import com.example.hackmotion.databinding.LayoutNotificationItemBinding
import com.example.hackmotion.fragment.model.Call
import de.hdodenhof.circleimageview.CircleImageView

class RvNotivicationAdapter(private val items: List<Call>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutNotificationItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return NotificationListViewHolder(view)
    }

    inner class NotificationListViewHolder(private val binding: LayoutNotificationItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(data: Call){
            Glide.with(binding.profileImage)
                .load(data.foto)
                .into(binding.profileImage)
            binding.textviewtitle.text = data.nama
            binding.textviewDesc.text =data.tanggal
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as NotificationListViewHolder).setData(items[position])
    }

    override fun getItemCount(): Int = items.size

}