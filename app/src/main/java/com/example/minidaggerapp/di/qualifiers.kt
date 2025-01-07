package com.example.minidaggerapp.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DatabaseName



@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NetworkApiKey

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DatabaseVersion


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApplicationContext
