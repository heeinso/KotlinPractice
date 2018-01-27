package kr.ac.kaist.kotlinpractice.view.main.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*
import kr.ac.kaist.kotlinpractice.R
import kr.ac.kaist.kotlinpractice.view.main.home.presenter.HomeContract
import kr.ac.kaist.kotlinpractice.view.main.home.presenter.HomePresenter

/**
 * Created by stevehan on 2018. 1. 27..
 */
class HomeFragment : Fragment(), HomeContract.View {

    private val homePresenter: HomePresenter by lazy {
        HomePresenter(this@HomeFragment)
    }

    override fun showImage(imageName: String) {
        imageView.setImageResource(resources.getIdentifier(imageName, "drawable", context.packageName))
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?
        = inflater?.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homePresenter.loadImage()
    }
}

