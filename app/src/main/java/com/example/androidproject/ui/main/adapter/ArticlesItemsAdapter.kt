package com.example.androidproject.ui.main.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidproject.R
import com.example.androidproject.data.network.model.ResultData
import com.example.androidproject.util.extension.loadImageWithPlaceholder
import kotlinx.android.synthetic.main.article_item_row.view.*

class ArticlesItemsAdapter(val mItems: MutableList<ResultData>) : RecyclerView.Adapter<ArticlesItemsAdapter.ItemVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemVH = ItemVH(LayoutInflater.from(parent.context)
            .inflate(R.layout.article_item_row, parent, false))

    override fun getItemCount(): Int = mItems.size

    override fun onBindViewHolder(holder: ItemVH, position: Int) {
        return holder.onBind(mItems[position])
    }

    inner class ItemVH(view: View) : RecyclerView.ViewHolder(view) {

        fun onBind(data: ResultData) {

            data.title?.let {
                itemView.articleTitle.text = it
            }

            data.abstract?.let {
                itemView.articleDescription.text = it
            }

            data.byline?.let {
                itemView.articleAuthor.text = it
            }

            data.published_date?.let {
                itemView.articlePublishDate.text = it
            }

            data.url?.let {
                itemView.articleIV.loadImageWithPlaceholder(it,R.drawable.shape_gray_circle)
            }

            itemView.setOnClickListener{

            }
        }
    }
}