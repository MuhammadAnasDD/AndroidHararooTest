package com.example.androidproject.ui.custom


import android.content.Context
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.example.androidproject.R
import com.example.androidproject.util.extension.gone
import com.example.androidproject.util.extension.toPx
import com.example.androidproject.util.extension.visible
import kotlinx.android.synthetic.main.custom_toolbar.view.*


class CustomToolbar(context: Context, attrs: AttributeSet?) : Toolbar(context, attrs) {
    var iconEndVisibility = View.GONE

    init {
        View.inflate(getContext(), R.layout.custom_toolbar, this)
        setContentInsetsRelative(0, 0)
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomToolbar, 0, 0)
        val darkBlue = ContextCompat.getColor(context, R.color.darkBlue)
        val white = ContextCompat.getColor(context, R.color.white)
        val iconStart = typedArray.getResourceId(R.styleable.CustomToolbar_ct_icon_start, 0)
        val iconEnd = typedArray.getResourceId(R.styleable.CustomToolbar_ct_icon_end, 0)
        val iconMid = typedArray.getResourceId(R.styleable.CustomToolbar_ct_icon_mid, 0)
        val iconPadding = typedArray.getDimension(R.styleable.CustomToolbar_ct_icon_padding, (16f).toPx().toFloat())
        val title = typedArray.getString(R.styleable.CustomToolbar_ct_title)
        val endTitle: String? = typedArray.getString(R.styleable.CustomToolbar_ct_end_title)
        val textColor = typedArray.getColor(R.styleable.CustomToolbar_ct_text_color, darkBlue)
        val backgroundColor = typedArray.getColor(R.styleable.CustomToolbar_ct_background_color, white)
        val endTextColor = typedArray.getColor(R.styleable.CustomToolbar_ct_end_text_color, darkBlue)
        val iconStartTint = typedArray.getColor(R.styleable.CustomToolbar_ct_icon_start_tint, 0)
        val iconEndTint = typedArray.getColor(R.styleable.CustomToolbar_ct_icon_end_tint, 0)
        val iconMidTint = typedArray.getColor(R.styleable.CustomToolbar_ct_icon_mid_tint, 0)
        toolbarTitleTV.text = title
        toolbarTextEndView.text = endTitle
        toolbarTitleTV.setTextColor(textColor)
       // containerCL.backgroundColor = backgroundColor
        toolbarTextEndView.setTextColor(endTextColor)

        if (iconStart != 0) {
            iconStartIV.setImageResource(iconStart)
            iconStartIV.visibility = View.VISIBLE
        } else {
            iconStartIV.visibility = INVISIBLE
        }

        if (iconEnd != 0) {
            iconEndIV.setImageResource(iconEnd)
            iconEndIV.visibility = View.VISIBLE
            iconEndVisibility = View.VISIBLE
        } else {
            iconEndIV.visibility = View.INVISIBLE
            iconEndVisibility = View.INVISIBLE
        }

        if (iconMid != 0) {
            iconMidIV.setImageResource(iconMid)
            iconMidIV.visibility = View.VISIBLE
        } else {
            iconMidIV.visibility = View.GONE
        }

        if (endTitle == null) {
            toolbarTextEndView.visibility = View.GONE
        } else {
            iconEndIV.visibility = View.INVISIBLE
            toolbarTextEndView.visibility = View.VISIBLE
        }

       // iconStartIV.setPadding(iconPadding())
        //iconEndIV.setPadding(iconPadding.toInt())

        if (iconStartTint != 0)
            iconStartIV.setColorFilter(iconStartTint, PorterDuff.Mode.SRC_IN)
        if (iconEndTint != 0)
            iconEndIV.setColorFilter(iconEndTint, PorterDuff.Mode.SRC_IN)

        if (iconMidTint != 0)
            iconMidIV.setColorFilter(iconEndTint, PorterDuff.Mode.SRC_IN)

        typedArray.recycle()
    }


    fun hideEndTitle(){
        toolbarTextEndView.gone()
    }

    fun showEndTitle(){
        toolbarTextEndView.visible()
    }

    fun setToolbarBackgroundColor(@ColorRes backgroundColor: Int) {
        containerCL.setBackgroundResource(backgroundColor)
    }

    fun setToolbarEndTextColor(@ColorRes textColor: Int) {
        toolbarTextEndView.setTextColor(ContextCompat.getColor(context, textColor))
    }

    fun setTitle(title: String) {
        toolbarTitleTV.text = title
    }

    fun getTitle(title: String) = toolbarTitleTV.text.toString()
    fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
        iconEndIV.visibility = View.INVISIBLE
    }


    fun hideProgressBar() {
        progressBar.visibility = View.GONE
        iconEndIV.visibility = iconEndVisibility
    }

    fun setTextColor(textColor: Int) {
        toolbarTitleTV.setTextColor(textColor)
    }


    fun setIconStartImageResource(res: Int) {
        iconStartIV.setImageResource(res)
    }

    fun setIconStartImageDrawable(drawable: Drawable) {
        iconStartIV.setImageDrawable(drawable)
    }

    fun getIconStartImageDrawable() = iconStartIV.drawable

    fun setIconEndImageResource(res: Int) {
        iconEndIV.setImageResource(res)
    }

    fun setIconMidImageResource(res: Int) {
        iconMidIV.setImageResource(res)
    }

    fun setIconMidImageDrawable(drawable: Drawable) {
        iconMidIV.setImageDrawable(drawable)
    }

    fun getIconMidImageDrawable() = iconMidIV.drawable

    fun setIconEndImageDrawable(drawable: Drawable) {
        iconEndIV.setImageDrawable(drawable)
    }

    fun getIconEndImageDrawable() = iconEndIV.drawable


    fun setIconsTintColor(color: Int, allIcons: Boolean) {
        iconStartIV.setColorFilter(ContextCompat.getColor(context, color), android.graphics.PorterDuff.Mode.SRC_IN)
        if (allIcons) {
            iconEndIV.setColorFilter(ContextCompat.getColor(context, color), android.graphics.PorterDuff.Mode.SRC_IN)
            iconMidIV.setColorFilter(ContextCompat.getColor(context, color), android.graphics.PorterDuff.Mode.SRC_IN)
        }
    }

    fun removeIconStartTint() {
        iconStartIV.colorFilter = null
    }

    fun removeIconEndTint(bothIcons: Boolean) {
        if (bothIcons) {
            iconMidIV.colorFilter = null
        }
        iconEndIV.colorFilter = null
    }

    fun removeIconMidTint() {
        iconMidIV.colorFilter = null
    }

    fun setIconStartOnClickListener(listener: OnClickListener) = iconStartIV.setOnClickListener(listener)

    fun setIconMidOnClickListener(listener: OnClickListener) = iconMidIV.setOnClickListener(listener)

    fun setIconEndOnClickListener(listener: OnClickListener) = iconEndIV.setOnClickListener(listener)


    fun setTextEndOnClickListener(listener: OnClickListener) = toolbarTextEndView.setOnClickListener(listener)

    fun hideEndIcon() {
        iconEndIV.gone()
    }

    fun showEndIcon() {
        iconEndIV.visible()
    }

    fun hideMidIcon() {
        iconMidIV.gone()
    }

    fun showMidIcon() {
        iconMidIV.visible()
    }
}