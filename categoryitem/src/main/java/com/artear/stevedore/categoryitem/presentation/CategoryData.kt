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

import com.artear.stevedore.stevedoreitems.presentation.model.ArtearObject
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearStyle
import com.artear.stevedore.stevedoreitems.repository.model.link.Link
import com.artear.stevedore.stevedoreitems.repository.model.media.Media

data class CategoryData<T : ArtearStyle>(
        val imageUrl: String,
        val title: String,
        val description: String,
        val link: Link,
        val style: T) : ArtearObject<T>()