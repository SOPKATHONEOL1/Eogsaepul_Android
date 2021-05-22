package org.sopt.eogsaepul.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object EoqsaepulCreator {
    private const val BASE_URL = ""

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val eoqsaepulService : EoqsaepulService = retrofit.create(EoqsaepulService::class.java)
}