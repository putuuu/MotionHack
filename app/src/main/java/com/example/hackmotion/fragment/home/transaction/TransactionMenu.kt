package com.example.hackmotion.fragment.home.transaction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentSignupBinding
import com.example.hackmotion.databinding.FragmentTransactionMenuBinding

class TransactionMenu : Fragment() {

    private var _binding: FragmentTransactionMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentTransactionMenuBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_transactionMenu_to_videoCall)
        }

        return view
    }

}