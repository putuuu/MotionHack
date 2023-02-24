package com.example.hackmotion.fragment.home.transaction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentTransactionOngoingBinding


class TransactionOngoing : Fragment() {

    private var _binding: FragmentTransactionOngoingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentTransactionOngoingBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonJoin.setOnClickListener {

        }

        return view
    }



}