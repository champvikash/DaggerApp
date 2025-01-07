package com.example.minidaggerapp.di.module

import android.content.Context
import com.example.minidaggerapp.MyApplication
import com.example.minidaggerapp.apputils.DatabaseService
import com.example.minidaggerapp.apputils.FileStorageService
import com.example.minidaggerapp.apputils.NetworkService
import com.example.minidaggerapp.di.DatabaseName
import com.example.minidaggerapp.di.NetworkApiKey
import dagger.Module
import dagger.Provides
import io.ktor.client.HttpClient
import javax.inject.Singleton


@Module
class ApplicationModule(private val application: MyApplication) {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return application.applicationContext
    }


    @Singleton
    @Provides
    fun provideHTTPClient(): HttpClient {
        return HttpClient()
    }


    @Singleton
    @DatabaseName
    fun databaseName(): String {
        return "databseName"
    }

    @Singleton
    @NetworkApiKey
    fun networkapiKey(): String {
        return "Apikey"
    }




    @Singleton
    @Provides
    fun databaseService(): DatabaseService {
        return DatabaseService
    }

    @Singleton
    @Provides
    fun networkService(): NetworkService{
        return NetworkService
    }

    @Singleton
    @Provides
    fun getfileStorageService(): FileStorageService {
        return FileStorageService
    }


}