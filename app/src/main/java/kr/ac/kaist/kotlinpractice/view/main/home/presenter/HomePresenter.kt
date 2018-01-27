package kr.ac.kaist.kotlinpractice.view.main.home.presenter

import android.os.AsyncTask
import kr.ac.kaist.kotlinpractice.util.random

/**
 * Created by stevehan on 2018. 1. 27..
 */
class HomePresenter(val view: HomeContract.View) : HomeContract.Presenter {
    override fun loadImage() {
        ImageAsyncTask(view).execute()
    }

    class ImageAsyncTask(val view: HomeContract.View): AsyncTask<Unit, Unit, String>() {
        override fun doInBackground(vararg p0: Unit?): String {
            Thread.sleep(1000)

            return String.format("sample_%02d", (1..10).random())
        }

        override fun onPreExecute() {
            super.onPreExecute()

            view.showProgress()
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)

            view.hideProgress()
            result?.let {
                view.showImage(it)
            }
        }

    }

}