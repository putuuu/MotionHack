package com.example.hackmotion.fragment.home.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackmotion.dataSource.RecyclerViewClickListener
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentDashboardBinding
import com.example.hackmotion.fragment.home.transaction.RvCallAdapter
import com.example.hackmotion.fragment.model.Call
import com.example.hackmotion.fragment.model.LiveStream

class Dashboard : Fragment(), RecyclerViewClickListener {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view = binding.root

        val dataAvailable = Source.getCall() as ArrayList<Call>
        val dataLive = Source.getStream() as ArrayList<LiveStream>

        val adapterAvailable = RvCallAdapter(dataAvailable)
        binding.available.layoutManager = LinearLayoutManager(context)
        binding.available.adapter = adapterAvailable


        val adapterLive = RvLsAdapter(dataLive)
        binding.liveStreamRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.liveStreamRv.adapter = adapterLive

        return view
    }

    override fun onItemCallClicked(view: View, call: Call) {}


}