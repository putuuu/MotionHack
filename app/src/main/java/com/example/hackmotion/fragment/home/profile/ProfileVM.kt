package com.example.hackmotion.fragment.home.profile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileVM : ViewModel() {

    val id: MutableLiveData<String> = MutableLiveData<String>()
    val name: MutableLiveData<String> = MutableLiveData<String>()
    val phone: MutableLiveData<String> = MutableLiveData<String>()
    val username: MutableLiveData<String> = MutableLiveData<String>()
    val profilePhoto: MutableLiveData<String> = MutableLiveData<String>()
    val isVerified: MutableLiveData<String> = MutableLiveData<String>()

}