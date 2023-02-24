package com.example.hackmotion.fragment.home.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.Menu
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentDashboardBinding
import com.example.hackmotion.databinding.FragmentDiscoveryBinding
import com.example.hackmotion.databinding.FragmentLoginBinding

class Dashboard : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }


}