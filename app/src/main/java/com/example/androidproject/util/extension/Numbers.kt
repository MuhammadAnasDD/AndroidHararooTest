package com.example.androidproject.util.extension

import android.content.res.Resources
import com.example.androidproject.util.CommonUtil

fun Int.toDp(): Float {
    val densityDpi = Resources.getSystem().displayMetrics.densityDpi.toFloat()
    return this / (densityDpi / 160f)
}

fun Int.toPx(): Int {
    val density = Resources.getSystem().displayMetrics.density
    return Math.round(this * density)
}

fun Float.toDp(): Float {
    val densityDpi = Resources.getSystem().displayMetrics.densityDpi.toFloat()
    return this / (densityDpi / 160f)
}

fun Float.toPx(): Int {
    val density = Resources.getSystem().displayMetrics.density
    return Math.round(this * density)
}

fun Number.roundTo(numFractionDigits: Int): Double {
    if (CommonUtil.isArabic()) {
        if (numFractionDigits == 2) {
            return (Math.round(toDouble() / 10.0) * 10).toDouble()
        }
    }
    return String.format("%1.${numFractionDigits}f", toDouble()).toDouble()
}