package com.example.hackmotion.fragment.home.profile.model

import com.google.gson.annotations.SerializedName

data class Pengguna (
    val id: String,
    val name: String,
    val phone: String,
    val username: String,
    val profilePhoto: String,
    val isVerified: String,
    )

