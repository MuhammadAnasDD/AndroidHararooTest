package com.example.androidproject.data.network.model


data class ArticleResponse(
    val status: Any?,
    val results: List<ResultData>?
)

data class ResultData(
    val url: String?,
    val title: String?,
    val abstract: String?,
    val byline: String?,
    val published_date: String?
)