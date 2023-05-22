package com.example.androidproject.data.network


import com.example.androidproject.data.network.model.ArticleResponse
import com.google.gson.Gson
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single
import javax.inject.Inject


class AppApiHelper @Inject constructor(private val apiHeader: ApiHeader) : ApiHelper {

    @Inject
    lateinit var mGson: Gson
    override fun getArticles(): Single<ArticleResponse> =
        Rx2AndroidNetworking.get(ApiEndPoint.ENDPOINT_GET_ARTICLE)
            .addHeaders(apiHeader.publicApiHeader)
            .addHeaders(apiHeader.protectedApiHeader)
            .build()
            .getObjectSingle(ArticleResponse::class.java)

}