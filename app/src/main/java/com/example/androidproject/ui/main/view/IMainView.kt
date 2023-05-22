package com.example.androidproject.ui.main.view

import com.example.androidproject.data.network.model.ResultData
import com.example.androidproject.ui.base.view.IView

interface IMainView : IView {

    fun showArticleList(articles: List<ResultData>?)
}