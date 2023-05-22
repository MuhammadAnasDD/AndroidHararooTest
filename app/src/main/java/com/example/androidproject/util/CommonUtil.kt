package com.example.androidproject.util

import java.util.*

object CommonUtil {

    /**
     * @return a flag that indicates if the user's device language is Arabic
     */
    fun isArabic() = Locale.getDefault().language == "ar"

}