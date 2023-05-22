package com.example.androidproject.di.module


import com.example.androidproject.util.CommonUtil
import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.provider.Settings
import com.androidnetworking.BuildConfig
import com.example.androidproject.data.network.ApiEndPoint
import com.example.androidproject.data.network.ApiHeader
import com.example.androidproject.data.network.ApiHelper
import com.example.androidproject.data.network.AppApiHelper
import com.example.androidproject.data.preferences.AppPreferenceHelper
import com.example.androidproject.data.preferences.PreferenceHelper
import com.example.androidproject.di.ApiKeyInfo
import com.example.androidproject.di.PreferenceInfo
import com.example.androidproject.util.AppConstants
import com.example.androidproject.util.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.Gson


@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application


    @Provides
    @ApiKeyInfo
    internal fun provideApiKey(): String = ApiEndPoint.SERVER_URL

    @Provides
    @PreferenceInfo
    internal fun provideprefFileName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePrefHelper(appPreferenceHelper: AppPreferenceHelper): PreferenceHelper = appPreferenceHelper

    @Provides
    internal fun provideProtectedApiHeader(@ApiKeyInfo apiKey: String, preferenceHelper: PreferenceHelper)
            : ApiHeader.ProtectedApiHeader = ApiHeader.ProtectedApiHeader(
            authToken = "jwt xyz")

    @SuppressLint("HardwareIds")
    @Provides
    internal fun providePublicApiHeader(application: Application): ApiHeader.PublicApiHeader {
        return ApiHeader.PublicApiHeader(if (CommonUtil.isArabic()) "ar" else "en",
                Settings.Secure.getString(application.contentResolver,
                        Settings.Secure.ANDROID_ID),
                "Android",
                BuildConfig.VERSION_NAME,
            "v1",
                "application/json")
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
        return gsonBuilder.create()
    }


    @Provides
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper


    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    internal fun provideSchedulerProvider(): SchedulerProvider = SchedulerProvider()

}