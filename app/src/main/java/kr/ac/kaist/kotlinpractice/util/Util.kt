package kr.ac.kaist.kotlinpractice.util

import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity
import java.util.*

/**
 * Created by stevehan on 2018. 1. 27..
 */
fun AppCompatActivity.replace(@IdRes frameId: Int, fragment: android.support.v4.app.Fragment, tag: String? = null) {
    supportFragmentManager.beginTransaction().replace(frameId, fragment, tag).commit()
}

fun ClosedRange<Int>.random() = Random().nextInt(endInclusive - start)