package com.example.androidproject.util.extension

import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy


internal fun ImageView.loadImageWithPlaceholder(url: String,@DrawableRes drawableId: Int) {
    Glide.with(this.context)
            .asBitmap()
            .placeholder(drawableId)
            .centerCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .load(url)
            .into(this)
}

