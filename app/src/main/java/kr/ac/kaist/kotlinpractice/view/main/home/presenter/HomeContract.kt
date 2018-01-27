package kr.ac.kaist.kotlinpractice.view.main.home.presenter

/**
 * Created by stevehan on 2018. 1. 27..
 */
interface HomeContract {

    interface View {

        fun showImage(imageName: String)
        fun hideProgress()
        fun showProgress()
    }

    interface Presenter {

        fun loadImage()
    }
}
