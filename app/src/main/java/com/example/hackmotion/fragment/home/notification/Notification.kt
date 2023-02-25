package com.example.hackmotion.fragment.home.notification

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackmotion.R
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentNotificationBinding
import com.example.hackmotion.fragment.home.transaction.RvCallAdapterDone
import com.example.hackmotion.fragment.model.Call

class Notification : Fragment() {

    private lateinit var binding: FragmentNotificationBinding
    private lateinit var adapter: RvNotivicationAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setAdapter()
    }

    private fun setAdapter(){
        val data = Source.getCall() as ArrayList<Call>
        binding.apply {
            adapter = RvNotivicationAdapter(getNotification(data))
            RvNotivication.layoutManager = LinearLayoutManager(context)
            RvNotivication.adapter = adapter
        }
    }

    private fun getNotification(data:ArrayList<Call>):ArrayList<Call>{
        val call = ArrayList<Call>()
        for (i in data){
            if(i.status == "Notification"){
                call.add(i)
            }
        }
        return call
    }

}