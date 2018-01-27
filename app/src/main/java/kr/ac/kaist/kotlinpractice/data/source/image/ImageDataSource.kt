package kr.ac.kaist.kotlinpractice.data.source.image

/**
 * Created by stevehan on 2018. 1. 27..
 */
interface ImageDataSource {
    fun loadImageFileName(fileName: (String) -> Unit) {

    }
}