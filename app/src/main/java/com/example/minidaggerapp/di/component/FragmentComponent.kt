package com.example.minidaggerapp.di.component

import com.example.minidaggerapp.di.module.FragmentModule
import dagger.Component


@Component(modules = [FragmentModule::class])
interface FragmentComponent {
}