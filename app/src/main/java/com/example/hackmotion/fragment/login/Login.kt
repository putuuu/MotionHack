package com.example.hackmotion.fragment.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hackmotion.R
import com.example.hackmotion.dataSource.Source
import com.example.hackmotion.databinding.FragmentLoginBinding
import com.example.hackmotion.fragment.model.Users

class Login : Fragment() {

    private var _binding: FragmentLoginBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val lstUser: List<Users> = Source.getUser()

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.textViewRegister.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_signup)
        }

        binding.buttonLogin.setOnClickListener{
            if (checkEmail(lstUser) == checkPass(lstUser) && (checkEmail(lstUser)!="-1")){
                val direction = LoginDirections.actionLoginToMenu("1")
                findNavController().navigate(direction)
            }else{
                binding.textInputLayout2.helperText = "* email/username atau password salah"
                binding.textInputLayout3.helperText = "* email/username atau password salah"
                if (binding.password.text.isNullOrEmpty()){
                    binding.textInputLayout2.helperText = "* password tidak boleh kosong"
                    binding.textInputLayout3.helperText = ""
                }
                if (binding.email.text.isNullOrEmpty()){
                    binding.textInputLayout2.helperText = ""
                    binding.textInputLayout3.helperText = "* email/username tidak boleh kosong"
                }
            }
        }

        binding.textViewForgetPass.setOnClickListener{
            findNavController().navigate(R.id.action_login_to_inputEmail)
        }

        return view
    }

    fun checkEmail(users: List<Users>):String{
        var check: String = "-1"
        for (i in users){
            if (i.email ==  binding.email.text.toString()){
                check = i.id
            }
            if (i.username == binding.email.text.toString()){
                check = i.id
            }
        }
        binding.textInputLayout3.helperText = ""
        return check
    }

    fun checkPass(users: List<Users>):String{
        var check = "-1"
        for (i in users){
            if (i.password == binding.password.text.toString()){
                check = i.id
            }
        }

        return check
    }

}