package com.example.hackmotion.fragment.changepass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentPassChangeBinding

class PassChange : Fragment() {

    private var _binding: FragmentPassChangeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentPassChangeBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonNewPass2.setOnClickListener {
            findNavController().navigate(R.id.action_passChange_to_login)
        }

        return view
    }

}