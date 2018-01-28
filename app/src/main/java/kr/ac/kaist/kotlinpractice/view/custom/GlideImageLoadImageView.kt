package kr.ac.kaist.kotlinpractice.view.custom

import android.content.Context
import android.support.annotation.DrawableRes
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet
import com.bumptech.glide.Glide
import kr.ac.kaist.kotlinpractice.R

/**
 * Created by stevehan on 2018. 1. 28..
 */
class GlideImageLoadImageView @JvmOverloads constructor(context: Context?, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : AppCompatImageView(context, attrs, defStyleAttr) {

    fun loadImage(url: String?, @DrawableRes loadingImageRes: Int = R.drawable.ic_bubble_chart_white_50dp) {
        this.setImageResource(loadingImageRes)
        Glide.with(context).load(url).into(this)
    }
}