package com.example.hackmotion.fragment.home.discovery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentPaymentMethodBinding
import com.example.hackmotion.databinding.FragmentVABinding

class VA : Fragment() {

    private var _binding: FragmentVABinding? = null
    private val binding get() = _binding!!

    private val args : VAArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentVABinding.inflate(inflater, container, false)
        val view = binding.root

        if (args.metode == "paypal"){
            binding.imageView17.setImageResource(R.drawable.paypal)
        }else if (args.metode == "google")
            binding.imageView17.setImageResource(R.drawable.google_icon)
        else{
            binding.imageView17.setImageResource(R.drawable.facebook)
        }

        binding.textviewHarga4.text =  args.harga

        binding.linearLayoutBack.setOnClickListener{
            val direction = VADirections.actionVAToDiscoveryMenu("","","","",
            "","","","")
            findNavController().navigate(direction)
        }

        return view
    }

}