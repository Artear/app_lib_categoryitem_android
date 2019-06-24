/*
 * Copyright 2019 Artear S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.artear.stevedore.categoryitem.presentation

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.artear.stevedore.stevedoreitems.presentation.contract.ArtearViewHolder
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearSection
import com.artear.stevedore.stevedoreitems.repository.model.box.BoxStyle
import kotlinx.android.synthetic.main.category_view_holder.view.*


class CategoryViewHolder(itemView: View, private var listener: CategoryOnClickListener? = null) :
        RecyclerView.ViewHolder(itemView), ArtearViewHolder<CategoryData<BoxStyle>> {

    override fun bind(model: CategoryData<BoxStyle>, artearSection: ArtearSection) {
        itemView.apply {
            categoryTitle.text = model.title
            model.style.background?.let {
                categoryTitle.setTextColor(Color.parseColor(it.color.light))
            }
            //TODO margin
        }

        itemView.setOnClickListener {
            listener?.run {
                model.link.let { link ->
                    onCategoryClick(link)
                }
            }
        }

    }

}