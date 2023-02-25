package com.example.hackmotion.fragment.home.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentProfileChangeBinding
import com.example.hackmotion.databinding.FragmentProfileUserBinding
import com.example.hackmotion.fragment.home.transaction.TransactionMenuArgs

class ProfileChange : Fragment() {

    private var _binding: FragmentProfileChangeBinding? = null
    private val binding get() = _binding!!

    private val args : ProfileUserArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentProfileChangeBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.constraintpass.visibility = View.GONE

        if (args.change == "name"){
            binding.titlechange.text = "Name"
            binding.textView57.text = "Full Name"
        } else if (args.change == "phone"){
            binding.titlechange.text = "Phone"
            binding.textView57.text = "Phone Number"
            binding.changetext2.visibility = View.GONE
            binding.textView58.visibility = View.GONE
        } else if (args.change == "email"){
            binding.changetext2.visibility = View.GONE
            binding.textView58.visibility = View.GONE
            binding.textView57.text = "Email"
            binding.titlechange.text = "Email"
        } else if (args.change == "password"){
            binding.titlechange.text = "Password"
            binding.constraintLayout7.visibility = View.GONE
            binding.constraintpass.visibility = View.VISIBLE
        }

        binding.buttonLogin3.setOnClickListener {
            val direction = ProfileChangeDirections.actionProfileChangeToProfileUser("")
            findNavController().navigate(direction)
        }

        binding.linearLayoutBack.setOnClickListener {
            val direction = ProfileChangeDirections.actionProfileChangeToProfileUser("")
            findNavController().navigate(direction)
        }

        return view
    }

}