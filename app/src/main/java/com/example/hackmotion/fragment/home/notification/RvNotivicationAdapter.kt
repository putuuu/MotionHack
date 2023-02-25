package com.example.hackmotion.fragment.home.notification

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackmotion.databinding.LayoutNotificationItemBinding
import com.example.hackmotion.fragment.model.Notif

class RvNotivicationAdapter(private val items: ArrayList<Notif>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutNotificationItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return NotificationListViewHolder(view)
    }

    inner class NotificationListViewHolder(private val binding: LayoutNotificationItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setData(data: Notif){
            Glide.with(binding.profileImage)
                .load(data.profile)
                .into(binding.profileImage)
            binding.textviewtitle.text = data.nama
            binding.textviewDesc.text =data.time
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as NotificationListViewHolder).setData(items[position])
    }

    override fun getItemCount(): Int = items.size

}