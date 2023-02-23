package com.example.hackmotion.fragment.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentScreen1Binding

class Screen1 : Fragment() {

    private var _binding: FragmentScreen1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentScreen1Binding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.VIewPagerSplash)

        binding.BtnNext.setOnClickListener{
            viewPager?.currentItem = 1
        }

        binding.BtnSkip.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_login)
        }

        return view
    }

}