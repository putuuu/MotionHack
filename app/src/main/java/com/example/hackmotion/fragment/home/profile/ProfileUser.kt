package com.example.hackmotion.fragment.home.profile

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.hackmotion.databinding.FragmentProfileUserBinding
import com.example.hackmotion.retrofit.Api
import com.example.hackmotion.retrofit.RetrofitClient
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ProfileUser : Fragment() {

    private val model: ProfileVM by viewModels()
    private var _binding: FragmentProfileUserBinding? = null
    private val binding get() = _binding!!
    private lateinit var username: String

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentProfileUserBinding.inflate(inflater, container, false)
        val view = binding.root

        model.username.observe(viewLifecycleOwner){name ->
            if (name.isNotEmpty()){
                binding.username.text = name
            }
        }

        model.profilePhoto.observe(viewLifecycleOwner){uri ->
            if (uri.isNotEmpty()){
                Glide.with(this).load(uri).into(binding.profileImage)
            }

        }

        val userApi = RetrofitClient.getData().create(Api::class.java)
        GlobalScope.launch {
            val result = userApi.getUsers()
            Log.d("Pengguna", result.body().toString())
            model.username.postValue(result.body()?.user?.username.toString())
            model.profilePhoto.postValue(result.body()?.user?.profilePhoto.toString())
        }

        return view
    }

}