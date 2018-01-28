package kr.ac.kaist.kotlinpractice.view.main.home.adapter.model

import kr.ac.kaist.kotlinpractice.data.ImageData

/**
 * Created by stevehan on 2018. 1. 27..
 */
interface ImageRecyclerModel {
    fun addItem(imageData: ImageData)

    fun getItemCount(): Int

    fun notifyDataSetChange()
}