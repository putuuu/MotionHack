package com.example.hackmotion.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackmotion.databinding.FragmentViewPagerBinding
import com.example.hackmotion.fragment.screens.Screen1
import com.example.hackmotion.fragment.screens.Screen2
import com.example.hackmotion.fragment.screens.Screen3

class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        val view = binding.root

        val fragmentList = arrayListOf<Fragment>(
            Screen1(),
            Screen2(),
            Screen3()
        )

        val adapter = ViewPagerAdapter(
            fragmentList, requireActivity().supportFragmentManager, lifecycle
        )

        binding.VIewPagerSplash.adapter = adapter

        return view
    }

}