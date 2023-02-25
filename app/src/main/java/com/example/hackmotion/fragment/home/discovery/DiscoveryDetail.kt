package com.example.hackmotion.fragment.home.discovery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs
import com.bumptech.glide.Glide
import com.example.hackmotion.R
import com.example.hackmotion.databinding.FragmentDiscoveryDetailBinding
import com.example.hackmotion.databinding.FragmentDiscoveryMenuBinding
import com.example.hackmotion.fragment.home.transaction.TransactionMenuArgs

class DiscoveryDetail : Fragment() {

    private var _binding: FragmentDiscoveryDetailBinding? = null
    private val binding get() = _binding!!

    private val args : DiscoveryMenuArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentDiscoveryDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.username2.text = args.name
        binding.textviewtitle.text = args.judul
        binding.category.text = args.category
        binding.textviewTanggal2.text = args.tanggal
        binding.textViewdesc.text = args.desc
        binding.textviewHarga2.text = args.harga
        Glide.with(this)
            .load(args.foto)
            .into(binding.profileImage3);


        binding.linearLayoutBack.setOnClickListener{
            findNavController().navigate(R.id.action_discoveryDetail_to_discoveryMenu)
        }

        return view
    }

}