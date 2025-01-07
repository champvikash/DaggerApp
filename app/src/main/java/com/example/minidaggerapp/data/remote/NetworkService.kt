package com.example.minidaggerapp.data.remote

import com.example.minidaggerapp.di.NetworkApiKey
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @NetworkApiKey private val apiKey: NetworkApiKey
) {


    fun getDummyData() : String {
        return " Get Dummy Data"
    }
}