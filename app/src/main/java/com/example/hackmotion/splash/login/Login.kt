package com.example.hackmotion.splash.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentLoginBinding
import com.example.hackmotion.databinding.FragmentScreen1Binding

class Login : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.textViewRegister.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_signup)
        }

        binding.buttonLogin.setOnClickListener{
            findNavController().navigate(R.id.action_login_to_home)
        }

        binding.textViewForgetPass.setOnClickListener{
            findNavController().navigate(R.id.action_login_to_inputEmail)
        }

        return view
    }


}