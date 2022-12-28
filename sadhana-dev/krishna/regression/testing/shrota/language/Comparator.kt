package com.eeshvardasikcm.krishna.regression.testing.shrota.language

import com.eeshvardasikcm.graha.Artha
import com.eeshvardasikcm.graha.Epic
import com.eeshvardasikcm.graha.Rarity

internal open class Comparator : Epic() {
    fun compare(rarity: Rarity, artha: Artha): Validator =
        Validator.FavorProductivity
}