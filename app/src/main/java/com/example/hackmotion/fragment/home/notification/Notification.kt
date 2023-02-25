package com.example.hackmotion.fragment.home.notification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentNotificationBinding
import com.example.hackmotion.fragment.model.Notif

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
        val data = Source.getNotif() as ArrayList<Notif>
        binding.apply {
            adapter = RvNotivicationAdapter(data)
            RvNotivication.layoutManager = LinearLayoutManager(context)
            RvNotivication.adapter = adapter
        }
    }


}