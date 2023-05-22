package com.example.androidproject.di.builder

import com.example.androidproject.ui.main.MainActivityModule
import com.example.androidproject.ui.main.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun bindMainActivityModule(): MainActivity
}