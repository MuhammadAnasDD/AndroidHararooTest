package com.example.androidproject.ui.base.view

import android.app.ProgressDialog
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import dagger.android.AndroidInjection


abstract class BaseActivity : AppCompatActivity(), IView, BaseFragment.CallBack {

    private var progressDialog: ProgressDialog? = null


    init {
        // enable support for vector drawable on Lollipop
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // before super.onCreate to avoid crashes on configuration changes (e.g. language, permissions...etc)
        performDI()
        super.onCreate(savedInstanceState)
    }

    /**
     * Hides progress indicator, this method is overridden throughout the app to hide custom loaders
     * and perform appropriate logic when hiding the progress indicator
     */
    override fun hideProgress() {
        progressDialog?.let { if (it.isShowing) it.cancel() }
    }


    override fun showProgress() {

    }


    private fun canDrawOverlays(): Boolean {
        return if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            true
        } else {
            if (Build.VERSION.SDK_INT == Build.VERSION_CODES.M)
                Settings.canDrawOverlays(this)
            else true
        }
    }

    /**
     * Performs injection
     */
    private fun performDI() = AndroidInjection.inject(this)




    public override fun onStart() {
        super.onStart()
    }

    public override fun onStop() {
        super.onStop()
    }


    override fun onPause() {
        super.onPause()
        window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
    }

    override fun onResume() {
        window.clearFlags(WindowManager.LayoutParams.FLAG_SECURE)
        super.onResume()
    }
}