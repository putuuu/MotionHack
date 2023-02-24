package com.example.hackmotion.retrofit

import com.example.hackmotion.fragment.home.profile.model.Users
import retrofit2.Response
import retrofit2.http.GET

public interface Api {

    @GET("/v1/users")
    suspend fun getUsers() : Response<Users>


}