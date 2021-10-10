package com.example.postrequest

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface APIInterface {
    @GET("/test/")
    fun getUser(): Call<List<Users.UserDetails>>

    @POST("/test/")
    fun addUser(@Body userData: Users.UserDetails): Call<Users.UserDetails>
}