package com.example.androidproject.data.preferences


import android.content.Context
import android.content.SharedPreferences
import com.example.androidproject.di.PreferenceInfo

import com.google.gson.Gson
import javax.inject.Inject


class AppPreferenceHelper @Inject constructor(context: Context, @PreferenceInfo private val prefFileName: String, private val gson: Gson) :
    PreferenceHelper {

    companion object {

    }

    private val mPrefs: SharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    override fun clearPreferences() {
        // clear all of the preferences
    }
}


