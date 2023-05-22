package com.example.androidproject.ui.base.interactor

import com.example.androidproject.data.network.ApiHelper
import com.example.androidproject.data.preferences.PreferenceHelper

open class BaseInteractorImpl() : IInteractor {

    protected lateinit var preferenceHelper: PreferenceHelper
    protected lateinit var apiHelper: ApiHelper


    constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : this() {
        this.preferenceHelper = preferenceHelper
        this.apiHelper = apiHelper
    }
}