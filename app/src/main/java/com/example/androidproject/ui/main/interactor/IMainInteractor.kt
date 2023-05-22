package com.example.androidproject.ui.main.interactor

import com.example.androidproject.data.network.model.ArticleResponse
import com.example.androidproject.ui.base.interactor.IInteractor
import io.reactivex.Single


interface IMainInteractor : IInteractor {
    fun getArticleResponse(): Single<ArticleResponse>
}
