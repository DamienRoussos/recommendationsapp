package com.example.amsterdamrecommendationsapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.example.amsterdamrecommendationsapp.model.Recommendation
import com.example.amsterdamrecommendationsapp.ui.parameterprovider.RecommendationModelParameterProvider
import com.example.amsterdamrecommendationsapp.ui.theme.AmsterdamRecommendationsAppTheme

@Composable
fun RecommendationDetails(recommendation: Recommendation) {
    Column {
        Text(
            text = recommendation.name,
        )
        Text(
            text = stringResource(id = recommendation.description),
        )
        Text(
            text = recommendation.openingHours,
        )
        Text(
            text = recommendation.address,
        )
        Text(
            text = recommendation.phoneNumber,
        )
        Text(
            text = recommendation.websiteUrl,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendationDetailsPreview(
    @PreviewParameter(
        RecommendationModelParameterProvider::class,
    )
    model: Recommendation,
) {
    AmsterdamRecommendationsAppTheme {
        RecommendationDetails(recommendation = model)
    }
}
