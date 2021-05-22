package org.sopt.eogsaepul.api

import org.sopt.eogsaepul.data.request.RequestDetailData
import org.sopt.eogsaepul.data.response.ResponseDetailData
import org.sopt.eogsaepul.data.response.ResponseMainData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface EoqsaepulService {
    @GET("{user}:/category/:name")
    fun getCategoryData(@Path("user") user:String): Call<ResponseMainData>

    @GET("{user}:/detail/:detailldx")
    fun getDetailReceiveData(@Path("user") user:String) : Call<ResponseDetailData>

    @POST("{user}:/detail/:detailldx")
    fun getDetailDualData(@Path("user") user:String,
    @Body body: RequestDetailData) : Call<ResponseDetailData>

}

