package com.example.minidaggerapp.di.component

import com.example.minidaggerapp.MyApplication
import com.example.minidaggerapp.apputils.DatabaseService
import com.example.minidaggerapp.apputils.NetworkService
import com.example.minidaggerapp.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)


//    fun getContext() : Context


    // Expose Method
    fun getNetworkService(): NetworkService

    fun getdatabaseService(): DatabaseService

//    fun filestorageService(): FileStorageService


}