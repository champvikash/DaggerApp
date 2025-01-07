package com.example.minidaggerapp.data.local

import android.content.Context
import com.example.minidaggerapp.di.ApplicationContext
import com.example.minidaggerapp.di.DatabaseName
import com.example.minidaggerapp.di.DatabaseVersion
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class DatabaseService @Inject constructor(

    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val version: Int
) {


    fun getDummy(): String {
        return "GEt Dummy Data"

    }

}