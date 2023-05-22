package com.example.androidproject.util.extension

import com.example.androidproject.R
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

internal fun FragmentManager.removeFragment(tag: String,
                                            slideIn: Int = R.anim.slide_left,
                                            slideOut: Int = R.anim.slide_right) {
    this.beginTransaction()
            .disallowAddToBackStack()
            .setCustomAnimations(slideIn, slideOut)
            .remove(this.findFragmentByTag(tag)!!)
            .commitNow()
}

internal fun FragmentManager.addFragment(containerViewId: Int,
                                         fragment: Fragment,
                                         tag: String,
                                         slideIn: Int = R.anim.slide_left,
                                         slideOut: Int = R.anim.slide_right) {
    this.beginTransaction().disallowAddToBackStack()
            .setCustomAnimations(slideIn, slideOut)
            .add(containerViewId, fragment, tag)
            .commit()
}

internal fun FragmentManager.replaceFragment(containerViewId: Int,
                                             fragment: Fragment,
                                             tag: String,
                                             slideIn: Int = R.anim.slide_left,
                                             slideOut: Int = R.anim.slide_right) {
    this.beginTransaction()
            .setCustomAnimations(slideIn, slideOut, slideIn, slideOut)
            .replace(containerViewId, fragment, tag)
            .addToBackStack(tag)
            .commitAllowingStateLoss()
}

internal fun FragmentManager.replaceFragmentWithoutBackStack(containerViewId: Int,
                                                             fragment: Fragment,
                                                             tag: String,
                                                             slideIn: Int = R.anim.slide_left,
                                                             slideOut: Int = R.anim.slide_right) {
    this.beginTransaction()
            .setCustomAnimations(slideIn, slideOut, slideIn, slideOut)
            .replace(containerViewId, fragment, tag)
            .commitAllowingStateLoss()
}

