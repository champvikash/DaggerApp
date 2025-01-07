package com.example.minidaggerapp

import com.example.minidaggerapp.data.local.DatabaseService
import com.example.minidaggerapp.data.remote.NetworkService
import com.example.minidaggerapp.di.ActivityScope
import javax.inject.Inject


@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {


    fun getSomeData(): String {
        return "Get Dummy Data"
    }
}