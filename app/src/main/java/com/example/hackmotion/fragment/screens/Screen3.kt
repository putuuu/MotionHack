package com.example.hackmotion.fragment.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentScreen3Binding

class Screen3 : Fragment() {

    private var _binding: FragmentScreen3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentScreen3Binding.inflate(inflater, container, false)
        val view = binding.root

        binding.BtnNext.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_login)
//            onBoardingFinished()
        }

        return view
    }

    private fun onBoardingFinished(){
        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putBoolean("Finished", true)
            apply()
        }

    }


}