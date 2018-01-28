package kr.ac.kaist.kotlinpractice.data.source.image

import kr.ac.kaist.kotlinpractice.data.ImageData

/**
 * Created by stevehan on 2018. 1. 27..
 */
object ImageRepository : ImageDataSource {
    private val IMAGE_REMOTE_DATA: ImageRemoteData by lazy {
        ImageRemoteData()
    }

    override fun loadImageList(imageDataList: (List<ImageData>) -> Unit, size: Int) {
        IMAGE_REMOTE_DATA.loadImageList(imageDataList, size)
    }


}