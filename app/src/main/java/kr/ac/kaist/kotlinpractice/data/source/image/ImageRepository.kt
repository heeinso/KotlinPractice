package kr.ac.kaist.kotlinpractice.data.source.image

import kr.ac.kaist.kotlinpractice.data.ImageData

/**
 * Created by stevehan on 2018. 1. 27..
 */
object ImageRepository : ImageDataSource {
    private val imageLocalData: ImageLocalData by lazy {
        ImageLocalData()
    }

    override fun loadImageList(imageDataList: (List<ImageData>) -> Unit, size: Int) {
        imageLocalData.loadImageList(imageDataList, size)
    }


}