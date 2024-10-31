package com.example.amsterdamrecommendationsapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.example.amsterdamrecommendationsapp.model.Recommendation
import com.example.amsterdamrecommendationsapp.ui.parameterprovider.RecommendationModelParameterProvider
import com.example.amsterdamrecommendationsapp.ui.theme.AmsterdamRecommendationsAppTheme

@Composable
fun RecommendationCard(recommendation: Recommendation) {
    Column {
        RecommendationImage(recommendation)
        RecommendationDetails(recommendation)
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendationCardPreview(
    @PreviewParameter(
        RecommendationModelParameterProvider::class
    )
    model: Recommendation,
) {
    AmsterdamRecommendationsAppTheme {  }
    RecommendationCard(recommendation = model)
}
