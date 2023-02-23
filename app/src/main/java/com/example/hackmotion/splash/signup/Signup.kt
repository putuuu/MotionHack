package com.example.hackmotion.splash.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentLoginBinding
import com.example.hackmotion.databinding.FragmentSignupBinding

class Signup : Fragment() {

    private var _binding: FragmentSignupBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentSignupBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.textViewLogin.setOnClickListener {
            findNavController().navigate(R.id.action_signup_to_login)
        }

        binding.buttonRegister.setOnClickListener{
            findNavController().navigate(R.id.action_signup_to_home)
        }

        return view
    }

}