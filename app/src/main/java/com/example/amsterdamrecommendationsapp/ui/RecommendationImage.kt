package com.example.amsterdamrecommendationsapp.ui

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.example.amsterdamrecommendationsapp.model.Recommendation
import com.example.amsterdamrecommendationsapp.ui.parameterprovider.RecommendationModelParameterProvider
import com.example.amsterdamrecommendationsapp.ui.theme.AmsterdamRecommendationsAppTheme

@Composable
fun RecommendationImage(recommendation: Recommendation) {
    Image(
        painter = painterResource(id = recommendation.image),
        contentDescription = recommendation.name,
    )
}

@Preview(showBackground = true)
@Composable
fun RecommendationImagePreview(
    @PreviewParameter(
        RecommendationModelParameterProvider::class,
    )
    model: Recommendation,
) {
    AmsterdamRecommendationsAppTheme {
        RecommendationImage(recommendation = model)
    }
}
