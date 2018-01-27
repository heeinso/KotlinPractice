package kr.ac.kaist.kotlinpractice.data.source.image

import kr.ac.kaist.kotlinpractice.util.random

/**
 * Created by stevehan on 2018. 1. 27..
 */
class ImageLocalData : ImageDataSource {
    override fun loadImageFileName(fileName: (String) -> Unit) {
        fileName(String.format("sample_%02d", (1..10).random()))
    }
}