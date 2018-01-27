package kr.ac.kaist.kotlinpractice.data.source.image

import kr.ac.kaist.kotlinpractice.data.ImageData
import kr.ac.kaist.kotlinpractice.util.random

/**
 * Created by stevehan on 2018. 1. 27..
 */
class ImageLocalData : ImageDataSource {
    override fun loadImageList(imageDataList: (List<ImageData>) -> Unit, size: Int) {
        val list = mutableListOf<ImageData>()
        for (index in 1..size) {
            val name = String.format("sample_%02d", (1..10).random() + 1)
            list.add(ImageData(name, name))
        }
        imageDataList(list)
    }

}