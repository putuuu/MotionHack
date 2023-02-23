package com.example.hackmotion.splash.changepass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentInputEmailBinding
import com.example.hackmotion.databinding.FragmentLoginBinding

class InputEmail : Fragment() {

    private var _binding: FragmentInputEmailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentInputEmailBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.linearLayoutBack.setOnClickListener {
            findNavController().navigate(R.id.action_inputEmail_to_login)
        }

        binding.buttonInputEmail.setOnClickListener{
            findNavController().navigate(R.id.action_inputEmail_to_otp)
        }

        return view
    }

}