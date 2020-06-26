package com.example.uhyo.model

import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import org.junit.Test

class ServerConnectionTest {

    @Test
    fun serverConnectionTest(){
        val testServerUrl = "http://192.168.1.6:80/get"
        val request = Request.Builder().apply {
            url(testServerUrl)
            get()
        }.build()

        val body = OkHttpClient().newCall(request).execute().body().string()
        println(body)
    }
}