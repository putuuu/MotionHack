package com.example.hackmotion.fragment.home.transaction

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hackmotion.R
import com.example.hackmotion.dataSource.RecyclerViewClickListener
import com.example.hackmotion.fragment.model.Call
import de.hdodenhof.circleimageview.CircleImageView

class RvCallAdapter(private val items: List<Call>) : RecyclerView.Adapter<RvCallAdapter.ViewHolder>() {

    var listener: RecyclerViewClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_call, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = items[position]

        holder.nama.text = ItemsViewModel.nama
        holder.category.text = ItemsViewModel.category
        holder.harga.text = ItemsViewModel.harga
        holder.tanggal.text = ItemsViewModel.tanggal
        holder.judul.text = ItemsViewModel.judul
        Glide.with(holder.itemView.context)
            .load(ItemsViewModel.foto.toString())
            .into(holder.foto);

        holder.itemView.setOnClickListener{
            listener?.onItemCallClicked(it, items[position])
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var nama: TextView = ItemView.findViewById<TextView>(R.id.textViewNama)
        var category: TextView = ItemView.findViewById<TextView>(R.id.category)
        var harga: TextView = ItemView.findViewById<TextView>(R.id.textviewHarga)
        var tanggal: TextView = ItemView.findViewById<TextView>(R.id.textviewTanggal)
        var judul: TextView = ItemView.findViewById<TextView>(R.id.textviewtitle)
        var foto: CircleImageView = ItemView.findViewById(R.id.profile_image)
    }
}