package com.example.hackmotion

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hackmotion.databinding.ActivityMenuBinding
import com.example.hackmotion.fragment.home.dashboard.Dashboard
import com.example.hackmotion.fragment.home.discovery.Discovery
import com.example.hackmotion.fragment.home.notification.Notification
import com.example.hackmotion.fragment.home.profile.Profile
import com.example.hackmotion.fragment.home.bnvvm.BnvVM
import com.example.hackmotion.fragment.home.profile.ProfileVM

class Menu : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    private val model: BnvVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root

        loadFragment(Dashboard())

        model.selectedMenu.observe(this){menu->
            when (menu){
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

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId){
                R.id.profile ->{
                    loadFragment(Profile())
                    model.setSelectedMenu(it.itemId)
                    true
                }
                R.id.dashboard ->{
                    loadFragment(Dashboard())
                    model.setSelectedMenu(it.itemId)
                    true
                }
                R.id.discovery ->{
                    loadFragment(Discovery())
                    model.setSelectedMenu(it.itemId)
                    true
                }
                R.id.notification ->{
                    loadFragment(Notification())
                    model.setSelectedMenu(it.itemId)
                    true
                }
                else -> {
                    loadFragment(com.example.hackmotion.fragment.home.transaction.Transaction())
                    model.setSelectedMenu(it.itemId)
                    true
                }
            }
        }


        setContentView(view)
    }


    public fun loadFragment(fragment: Fragment){
        val changefragment = supportFragmentManager.beginTransaction()
        changefragment.replace(R.id.menuFragment,fragment)
        changefragment.commit()
    }
}