package com.example.amsterdamrecommendationsapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.amsterdamrecommendationsapp.ui.main.RecommendationsUiState
import com.example.amsterdamrecommendationsapp.ui.main.RecommendationsViewModel

@Composable
fun RecommendationsAppScreen() {
    val viewModel: RecommendationsViewModel = viewModel()
    val uiState: RecommendationsUiState by viewModel.recommendationsState.collectAsState()
}
