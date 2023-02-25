package com.example.hackmotion.fragment.home.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.hackmotion.dataSource.RecyclerViewClickListener
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentDashboardBinding
import com.example.hackmotion.fragment.home.profile.ProfileUserArgs
import com.example.hackmotion.fragment.home.transaction.RvCallAdapter
import com.example.hackmotion.fragment.login.LoginArgs
import com.example.hackmotion.fragment.model.Call
import com.example.hackmotion.fragment.model.Kategori
import com.example.hackmotion.fragment.model.LiveStream
import com.example.hackmotion.fragment.model.Users

class Dashboard : Fragment(), RecyclerViewClickListener {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val user: Users = Source.getUser()[0]

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.textView25.text = "Hi, "+user.name
        Glide.with(this).load(user.profilePhoto).into(binding.profileImage)

        val dataAvailable = Source.getCall() as ArrayList<Call>
        val dataLive = Source.getStream() as ArrayList<LiveStream>
        val dataCategory = Source.getKategori() as ArrayList<Kategori>

        val adapterAvailable = RvCallAdapter(getAvailable(dataAvailable))
        binding.available.layoutManager = LinearLayoutManager(context)
        binding.available.adapter = adapterAvailable


        val adapterLive = RvLsAdapter(dataLive)
        binding.liveStreamRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.liveStreamRv.adapter = adapterLive

        val adapterCategory = RVCategoryAdapter(dataCategory)
        binding.categoryR.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.categoryR.adapter = adapterCategory

        return view
    }

    private fun getAvailable(data:ArrayList<Call>):ArrayList<Call>{
        val call = ArrayList<Call>()
        for (i in data){
            if(i.status == "Available"){
                call.add(i)
            }
        }
        return call
    }

    override fun onItemCallClicked(view: View, call: Call) {}


}