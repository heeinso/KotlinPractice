package kr.ac.kaist.kotlinpractice.view.main.home.presenter

import android.os.AsyncTask
import kr.ac.kaist.kotlinpractice.data.source.image.ImageRepository
import kr.ac.kaist.kotlinpractice.view.main.home.adapter.model.ImageRecyclerModel

/**
 * Created by stevehan on 2018. 1. 27..
 */
class HomePresenter(val view: HomeContract.View,
                    private val imageRepository: ImageRepository,
                    private val imageRecyclerModel: ImageRecyclerModel) : HomeContract.Presenter {

    var isLoading = false

    override fun loadImage() {
        ImageAsyncTask(this, view, imageRepository, imageRecyclerModel).execute()
    }

    class ImageAsyncTask(val homePresenter: HomePresenter,
                         val view: HomeContract.View,
                         private val imageRepository: ImageRepository,
                         private val imageRecyclerModel: ImageRecyclerModel) : AsyncTask<Unit, Unit, Unit>() {

        override fun doInBackground(vararg params: Unit?) {
            imageRepository.loadImageList({
                it.forEach {
                    imageRecyclerModel.addItem(it)
                }
            }, 10)
        }

        override fun onPreExecute() {
            super.onPreExecute()

            homePresenter.isLoading = true

            view.showProgress()
        }

        override fun onPostExecute(result: Unit?) {
            super.onPostExecute(result)

            imageRecyclerModel.notifyDataSetChange()

            view.hideProgress()

            homePresenter.isLoading = false

        }
    }
}