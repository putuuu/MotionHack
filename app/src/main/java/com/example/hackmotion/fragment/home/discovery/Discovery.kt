package com.example.hackmotion.fragment.home.discovery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentDashboardBinding
import com.example.hackmotion.databinding.FragmentDiscoveryBinding

class Discovery : Fragment() {

    private var _binding: FragmentDiscoveryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentDiscoveryBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }

}