package com.example.amsterdamrecommendationsapp.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.amsterdamrecommendationsapp.model.Recommendation
import com.example.amsterdamrecommendationsapp.ui.theme.AmsterdamRecommendationsAppTheme

@Composable
fun RecommendationCardList(recommendations: List<Recommendation>) {
    LazyColumn {
        items(
            recommendations,
            key = { recommendation: Recommendation -> recommendation.id },
        ) { recommendation ->
            RecommendationCard(recommendation)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendatioCardListPreview() {
    AmsterdamRecommendationsAppTheme {
        RecommendationsAppScreen()
    }
}
