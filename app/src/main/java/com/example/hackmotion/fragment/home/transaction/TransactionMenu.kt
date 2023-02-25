package com.example.hackmotion.fragment.home.transaction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackmotion.R
import com.example.hackmotion.dataSource.RecyclerViewClickListener
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentTransactionMenuBinding
import com.example.hackmotion.fragment.model.Call

class TransactionMenu : Fragment(), RecyclerViewClickListener{

    private var _binding: FragmentTransactionMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentTransactionMenuBinding.inflate(inflater, container, false)
        val view = binding.root
        val data = Source.getCall() as ArrayList<Call>

        val adapterOngoing = RvCallAdapter(getOngoing(data))
        adapterOngoing.listener = this
        binding.RvOngoing.layoutManager = LinearLayoutManager(context)
        binding.RvOngoing.adapter = adapterOngoing

        val adapterDone = RvCallAdapterDone(getDone(data))
        adapterDone.listener = this
        binding.RvDone.layoutManager = LinearLayoutManager(context)
        binding.RvDone.adapter = adapterDone


        return view
    }

    private fun getOngoing(data:ArrayList<Call>):ArrayList<Call>{
        val call = ArrayList<Call>()
        for (i in data){
            if(i.status == "Ongoing"){
                call.add(i)
            }
        }
        return call
    }

    private fun getDone(data:ArrayList<Call>):ArrayList<Call>{
        val call = ArrayList<Call>()
        for (i in data){
            if(i.status == "Done"){
                call.add(i)
            }
        }
        return call
    }

    override fun onItemCallClicked(view: View, call: Call) {
        val direction = TransactionMenuDirections.actionTransactionMenuToVideoCall(call.nama,
        call.tanggal, call.judul, call.desc, call.harga, call.category, call.foto, call.status)
        findNavController().navigate(direction)
    }

}