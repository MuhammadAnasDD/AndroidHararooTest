package com.example.androidproject.di.component



import android.app.Application
import com.example.androidproject.AndroidHararooApp
import com.example.androidproject.di.builder.ActivityBuilder
import com.example.androidproject.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(hararooApp: AndroidHararooApp)
}