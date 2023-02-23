package com.example.hackmotion.splash.changepass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentInputEmailBinding
import com.example.hackmotion.databinding.FragmentOtpBinding

class Otp : Fragment() {

    private var _binding: FragmentOtpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentOtpBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.linearLayoutBack.setOnClickListener{
            findNavController().navigate(R.id.action_otp_to_inputEmail)
        }

        binding.textViewResendOtp.setOnClickListener {

        }

        binding.buttonSubmitOtp.setOnClickListener{

        }

        return view
    }

}