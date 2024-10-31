package com.example.amsterdamrecommendationsapp.ui.parameterprovider

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.amsterdamrecommendationsapp.data.AmsterdamData
import com.example.amsterdamrecommendationsapp.model.Recommendation

class RecommendationModelParameterProvider : PreviewParameterProvider<Recommendation> {
    override val values: Sequence<Recommendation>
        get() = AmsterdamData.loadRestaurants().asSequence()
}
