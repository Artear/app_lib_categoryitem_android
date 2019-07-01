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

import com.artear.domain.coroutine.DataShaper
import com.artear.stevedore.categoryitem.repository.BoxDataCategory
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearItem
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearItemDecoration
import com.artear.stevedore.stevedoreitems.repository.model.box.Box

class CategoryShaper : DataShaper<Box, ArtearItem> {

    override suspend fun transform(input: Box): ArtearItem? {

        val boxDataCategory = (input.data as BoxDataCategory)
        val imageUrl = boxDataCategory.media.getImage()

        return imageUrl?.let {
            val data = CategoryData(imageUrl,
                    boxDataCategory.title,
                    boxDataCategory.description,
                    boxDataCategory.link,
                    input.style
            )
            ArtearItem(data, ArtearItemDecoration())
        }
    }


}