package com.example.minidaggerapp

import android.app.Application
import com.example.minidaggerapp.apputils.DatabaseService
import com.example.minidaggerapp.apputils.NetworkService
import com.example.minidaggerapp.di.component.ApplicationComponent
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var networkService : NetworkService



    @Inject
    lateinit var databaseService: DatabaseService


    override fun onCreate() {
        super.onCreate()


    }
}