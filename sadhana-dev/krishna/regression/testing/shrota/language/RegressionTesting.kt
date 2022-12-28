package com.eeshvardasikcm.krishna.regression.testing.shrota.language

import com.eeshvardasikcm.graha.Artha
import com.eeshvardasikcm.graha.Efficiency
import com.eeshvardasikcm.graha.Rarity

internal class RegressionTesting(validator: Validator) : Efficiency() {
    init {
        val resultOfRegressTesting = validator
        val comparator: Comparator = Comparator()
        comparator.compare(artha = Artha(), rarity = Rarity())
    }
}