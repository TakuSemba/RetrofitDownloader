package com.takusemba.retrofitdownloader

import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.util.concurrent.TimeUnit


/**
 * Created by takusemba on 2017/05/07.
 */

class ApiClient {

    private val okHttpClient = OkHttpClient
            .Builder()
            .addNetworkInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.HEADERS))
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()

    private val retrofit = Retrofit
            .Builder()
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://hoge")
            .build()

    interface Service {

//        @GET fun downloadFile(@Url fileUrl: String, @Header("Range") range: String): Call<ResponseBody>

//        @GET("/blog/2016/luna_1.jpg")
//        fun downloadFile(@Header("Range") range: String): Call<ResponseBody>

        @Headers("Content-Type: image/jpg; charset=binary")
        @Streaming @GET fun downloadFileWithRange(@Url fileUrl: String, @HeaderMap headers: Map<String, String>): Observable<ResponseBody>

        @Streaming
        @Headers("Content-Type: image/jpg; charset=binary")
        @GET fun downloadFileWithStreaming(@Url fileUrl: String): Observable<ResponseBody>
    }

    fun downloadFileWithRange(url: String, count: Int): Observable<ResponseBody> {
        val range = 5000
        val rangeStart = (count - 1) * range
        val rangeEnd = rangeStart + range - 1
        val map = HashMap<String, String>()
        map.put("Range", "bytes=$rangeStart-$rangeEnd")
        return retrofit.create(Service::class.java).downloadFileWithRange(url, map)
    }

    fun downloadFileWithStreaming(url: String): Observable<ResponseBody> {
        return retrofit.create(Service::class.java).downloadFileWithStreaming(url)
    }
}