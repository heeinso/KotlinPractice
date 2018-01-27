package kr.ac.kaist.kotlinpractice.data.source.image

import kr.ac.kaist.kotlinpractice.data.ImageData

/**
 * Created by stevehan on 2018. 1. 27..
 */
interface ImageDataSource {
    fun loadImageList(imageDataList: (List<ImageData>) -> Unit, size: Int)
}