package com.example.hackmotion.fragment.home.discovery

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.core.app.NotificationCompat.getOngoing
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackmotion.R
import com.example.hackmotion.dataSource.RecyclerViewClickListener
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentDiscoveryBinding
import com.example.hackmotion.databinding.FragmentDiscoveryMenuBinding
import com.example.hackmotion.fragment.home.transaction.RvCallAdapter
import com.example.hackmotion.fragment.home.transaction.RvCallAdapterDone
import com.example.hackmotion.fragment.model.Call
import java.util.*
import kotlin.collections.ArrayList

class DiscoveryMenu : Fragment(), RecyclerViewClickListener {

    private var _binding: FragmentDiscoveryMenuBinding? = null
    private val binding get() = _binding!!
    val data = Source.getCall() as ArrayList<Call>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentDiscoveryMenuBinding.inflate(inflater, container, false)
        val view = binding.root

        val adapterDiscovery = RvCallAdapterDone(data)
        adapterDiscovery.listener = this
        binding.rvDiscovery.layoutManager = LinearLayoutManager(context)
        binding.rvDiscovery.adapter = adapterDiscovery

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(s: String): Boolean {
                return false
            }

            override fun onQueryTextChange(s: String): Boolean {
                filterList(s)
                return true
            }
        })

        return view
    }

    private fun filterList(s: String) {
        var filterList = arrayListOf<Call>()
        if (s.isEmpty()) {
            filterList = data
        } else {
            for (item in data) {
                if (item.nama.lowercase().contains(s.lowercase(Locale.getDefault()))) {
                    filterList.add(item)
                }
                if (item.judul.lowercase().contains(s.lowercase(Locale.getDefault()))){
                    filterList.add(item)
                }
            }
        }
        if (filterList.isEmpty()) {
            Toast.makeText(context, "Pencarian tidak ditemukan", Toast.LENGTH_SHORT).show()
        } else {
            binding.rvDiscovery.adapter = RvCallAdapterDone(filterList)
        }
    }

    override fun onItemCallClicked(view: View, call: Call) {
        val direction = DiscoveryMenuDirections.actionDiscoveryMenuToDiscoveryDetail(call.nama,
            call.tanggal, call.judul, call.desc, call.harga, call.category, call.foto, call.status)
        findNavController().navigate(direction)
        Log.d("iniRv", call.judul)
    }

}