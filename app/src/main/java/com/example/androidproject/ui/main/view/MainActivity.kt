package com.example.androidproject.ui.main.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidproject.R
import com.example.androidproject.data.network.model.ResultData
import com.example.androidproject.ui.base.view.BaseActivity
import com.example.androidproject.ui.main.adapter.ArticlesItemsAdapter
import com.example.androidproject.ui.main.interactor.IMainInteractor
import com.example.androidproject.ui.main.presenter.IMainPresenter
import com.example.androidproject.util.extension.removeFragment
import com.google.gson.Gson
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : BaseActivity(), IMainView, HasSupportFragmentInjector, View.OnClickListener {

    @Inject
    internal lateinit var presenter: IMainPresenter<IMainView, IMainInteractor>

    @Inject
    internal lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var mGson: Gson

    companion object {
        fun getStartIntent(context: Context): Intent {
            val intent = Intent(context, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onAttach(this)
        setupClickListeners()
        presenter.getArticles()
    }

    override fun onFragmentAttached(tag: String?) {
    }

    override fun onFragmentDetached(tag: String) {
        supportFragmentManager.removeFragment(tag)
    }

    fun setupClickListeners() {
        mainCTB.setIconStartOnClickListener(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentDispatchingAndroidInjector


    override fun onClick(view: View) {
        when (view.id) {
            R.id.iconStartIV -> {
                onBackPressed()
            }
        }
    }

    override fun showArticleList(articles: List<ResultData>?) {
        articles?.let {
            val articleAdapter = ArticlesItemsAdapter(it.toMutableList())
            articleRecycler.layoutManager = LinearLayoutManager(this)
            articleRecycler.adapter = articleAdapter
        }
    }
}