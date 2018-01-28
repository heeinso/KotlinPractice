package kr.ac.kaist.kotlinpractice.view.main.home.presenter

interface HomeContract {

    interface View {

        fun hideProgress()
        fun showProgress()
    }

    interface Presenter {

        fun loadImage()
    }
}