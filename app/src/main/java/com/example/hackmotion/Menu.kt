package com.example.hackmotion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.SurfaceControl.Transaction
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hackmotion.databinding.ActivityMenuBinding
import com.example.hackmotion.databinding.FragmentDashboardBinding
import com.example.hackmotion.fragment.home.dashboard.Dashboard
import com.example.hackmotion.fragment.home.discovery.Discovery
import com.example.hackmotion.fragment.home.notification.Notification
import com.example.hackmotion.fragment.home.profile.Profile
import kotlin.math.log

class Menu : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root

        loadFragment(Dashboard())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId){
                R.id.profile ->{
                    loadFragment(Profile())
                    true
                }
                R.id.dashboard ->{
                    loadFragment(Dashboard())
                    true
                }
                R.id.discovery ->{
                    loadFragment(Discovery())
                    true
                }
                R.id.notification ->{
                    loadFragment(Notification())
                    true
                }
                else -> {
                    loadFragment(com.example.hackmotion.fragment.home.transaction.Transaction())
                    true
                }
            }
        }

        setContentView(view)
    }

    public fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.menuFragment,fragment)
        transaction.commit()
    }
}