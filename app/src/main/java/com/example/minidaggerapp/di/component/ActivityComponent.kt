package com.example.minidaggerapp.di.component

import com.example.minidaggerapp.MainActivity
import com.example.minidaggerapp.di.ActivityScope
import com.example.minidaggerapp.di.module.ActivityModule
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {


    fun inject(activity: MainActivity)
}