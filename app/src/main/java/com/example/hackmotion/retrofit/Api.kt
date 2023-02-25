package com.example.hackmotion.retrofit

import com.example.hackmotion.fragment.model.Pengguna
import retrofit2.Response
import retrofit2.http.GET

public interface Api {

    @GET("/v1/users")
    suspend fun getUsers() : Response<Pengguna>

}