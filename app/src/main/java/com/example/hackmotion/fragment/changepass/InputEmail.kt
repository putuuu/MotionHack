package com.example.hackmotion.fragment.changepass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentInputEmailBinding
import com.example.hackmotion.fragment.login.Login
import com.example.hackmotion.fragment.model.Users

class InputEmail : Fragment() {

    private var _binding: FragmentInputEmailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentInputEmailBinding.inflate(inflater, container, false)
        val view = binding.root
        val lstUser: List<Users> = Source.getUser()

        binding.linearLayoutBack.setOnClickListener {
            findNavController().navigate(R.id.action_inputEmail_to_login)
        }

        binding.buttonInputEmail.setOnClickListener{
            if (binding.email.text.isNullOrEmpty()){
                binding.textInputLayout7.helperText = "* Email tidak boleh kosong"
            }
            else if(checkEmail(lstUser) == "-1"){
                binding.textInputLayout7.helperText = "* Email belum terdaftar"
            }else{
                findNavController().navigate(R.id.action_inputEmail_to_otp)
            }
        }

        return view
    }

    fun checkEmail(users: List<Users>):String{
        var check: String = "-1"
        for (i in users){
            if (i.username == binding.email.text.toString()){
                check = i.id
            }
        }
        return check
    }

}