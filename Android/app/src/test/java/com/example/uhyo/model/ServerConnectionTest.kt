package com.example.uhyo.model

import org.junit.Test
import java.net.URL

class ServerConnectionTest {

    @Test
    fun serverConnectionTest(){
        val testServerUrl = URL("http://192.168.1.6:80/get")
        val connection = testServerUrl.openConnection()
        connection.apply {
            doOutput = true
            getRequestProperty("GET")
            connect()
        }

        val status = connection.content
    }
}