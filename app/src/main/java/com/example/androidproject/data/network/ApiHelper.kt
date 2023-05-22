package com.example.androidproject.data.network

import com.example.androidproject.data.network.model.ArticleResponse
import io.reactivex.Single

interface ApiHelper {

    fun getArticles(): Single<ArticleResponse>

}