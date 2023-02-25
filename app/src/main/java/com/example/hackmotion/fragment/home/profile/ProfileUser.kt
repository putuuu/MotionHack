package com.example.hackmotion.fragment.home.profile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.hackmotion.MainActivity
import com.example.hackmotion.Menu
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentProfileUserBinding
import com.example.hackmotion.fragment.home.transaction.TransactionMenuDirections
import com.example.hackmotion.fragment.model.Users
import com.example.hackmotion.retrofit.Api
import com.example.hackmotion.retrofit.RetrofitClient
import com.giphy.sdk.analytics.models.User
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

        val user: Users = Source.getUser()[0]

        _binding = FragmentProfileUserBinding.inflate(inflater, container, false)
        val view = binding.root

        model.username.postValue(user.username)
        model.profilePhoto.postValue(user.profilePhoto)

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

        binding.logout.setOnClickListener {
            val intent = Intent (requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }

        binding.Name.setOnClickListener {
            val direction = ProfileUserDirections.actionProfileUserToProfileChange("name")
            findNavController().navigate(direction)
        }

        binding.phone.setOnClickListener {
            val direction = ProfileUserDirections.actionProfileUserToProfileChange("phone")
            findNavController().navigate(direction)
        }

        binding.Email.setOnClickListener {
            val direction = ProfileUserDirections.actionProfileUserToProfileChange("email")
            findNavController().navigate(direction)
        }

        binding.Password.setOnClickListener {
            val direction = ProfileUserDirections.actionProfileUserToProfileChange("password")
            findNavController().navigate(direction)
        }


//        val userApi = RetrofitClient.getData().create(Api::class.java)
//        GlobalScope.launch {
//            val result = userApi.getUsers()
//            Log.d("Pengguna", result.body().toString())
//            model.username.postValue(result.body()?.user?.username.toString())
//            model.profilePhoto.postValue(result.body()?.user?.profilePhoto.toString())
//        }


        return view
    }

}