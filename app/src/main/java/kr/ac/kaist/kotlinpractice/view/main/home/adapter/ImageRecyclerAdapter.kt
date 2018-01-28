package kr.ac.kaist.kotlinpractice.view.main.home.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kr.ac.kaist.kotlinpractice.data.ImageData
import kr.ac.kaist.kotlinpractice.view.main.home.adapter.holder.ImageViewHolder
import kr.ac.kaist.kotlinpractice.view.main.home.adapter.model.ImageRecyclerModel

/**
 * Created by stevehan on 2018. 1. 27..
 */
class ImageRecyclerAdapter(private val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>(), ImageRecyclerModel {

    private val list = mutableListOf<ImageData>()

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as? ImageViewHolder)?.onBind(list[position])
    }

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ImageViewHolder(context, parent)
    }

    override fun addItem(imageData: ImageData) {
        list.add(imageData)
    }

    override fun notifyDataSetChange() {
        notifyDataSetChanged()
    }
}