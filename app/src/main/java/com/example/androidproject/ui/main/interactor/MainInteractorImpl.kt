package com.example.androidproject.ui.main.interactor

import com.example.androidproject.data.network.ApiHelper
import com.example.androidproject.data.network.model.ArticleResponse
import com.example.androidproject.data.preferences.PreferenceHelper
import com.example.androidproject.ui.base.interactor.BaseInteractorImpl
import io.reactivex.Single
import javax.inject.Inject

class MainInteractorImpl @Inject internal constructor(preferenceHelper: PreferenceHelper, apiHelper: ApiHelper) : BaseInteractorImpl(preferenceHelper = preferenceHelper, apiHelper = apiHelper), IMainInteractor {
    override fun getArticleResponse(): Single<ArticleResponse> {
        return apiHelper.getArticles()
    }
}