package com.example.hackmotion.fragment.home.discovery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentDiscoveryDetailBinding
import com.example.hackmotion.databinding.FragmentPaymentMethodBinding

class PaymentMethod : Fragment() {

    private var _binding: FragmentPaymentMethodBinding? = null
    private val binding get() = _binding!!

    private val args : DiscoveryMenuArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentPaymentMethodBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.linearLayoutBack.setOnClickListener{
            val direction = PaymentMethodDirections.actionPaymentMethodToDiscoveryDetail(args.name,
                args.tanggal, args.judul, args.desc, args.harga, args.category, args.foto, args.status)
            findNavController().navigate(direction)
        }

        binding.buttonpaypal.setOnClickListener {
            val direction = PaymentMethodDirections.actionPaymentMethodToVA("paypal", args.harga)
            findNavController().navigate(direction)
        }

        binding.buttongoogle.setOnClickListener {
            val direction = PaymentMethodDirections.actionPaymentMethodToVA("google", args.harga)
            findNavController().navigate(direction)
        }

        binding.buttonfacebook.setOnClickListener {
            val direction = PaymentMethodDirections.actionPaymentMethodToVA("facebook", args.harga)
            findNavController().navigate(direction)
        }

        return view
    }

}