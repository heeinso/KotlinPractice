package kr.ac.kaist.kotlinpractice.data.source.image

/**
 * Created by stevehan on 2018. 1. 27..
 */
object ImageRepository : ImageDataSource {
    private val imageLocalData: ImageLocalData by lazy {
        ImageLocalData()
    }

    override fun loadImageFileName(fileName: (String) -> Unit) {
        imageLocalData.loadImageFileName(fileName)
    }
}