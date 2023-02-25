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
import com.example.hackmotion.databinding.FragmentDiscoveryMenuBinding
import com.example.hackmotion.databinding.FragmentDiscoveryVoucherBinding

class DiscoveryVoucher : Fragment() {

    private var _binding: FragmentDiscoveryVoucherBinding? = null
    private val binding get() = _binding!!

    private val args : DiscoveryMenuArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentDiscoveryVoucherBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.buttonLogin2.setOnClickListener {
            val direction = DiscoveryVoucherDirections.actionDiscoveryVoucherToDiscoveryDetail(args.name,
                args.tanggal, args.judul, args.desc, args.harga, args.category, args.foto, args.status)
            findNavController().navigate(direction)
        }

        binding.linearLayoutBack.setOnClickListener {
            val direction = DiscoveryVoucherDirections.actionDiscoveryVoucherToDiscoveryDetail(args.name,
                args.tanggal, args.judul, args.desc, args.harga, args.category, args.foto, args.status)
            findNavController().navigate(direction)
        }

        return view
    }

}