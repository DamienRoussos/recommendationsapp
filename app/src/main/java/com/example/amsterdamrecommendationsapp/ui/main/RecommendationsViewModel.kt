package com.example.amsterdamrecommendationsapp.ui.main

import androidx.lifecycle.ViewModel
import com.example.amsterdamrecommendationsapp.data.AmsterdamData
import com.example.amsterdamrecommendationsapp.model.Recommendation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RecommendationsViewModel : ViewModel() {
    private val _uiState =
        MutableStateFlow(
            RecommendationsUiState(
                restaurantsList = AmsterdamData.loadRestaurants(),
                musicVenuesList = AmsterdamData.loadMusicVenues(),
                clubsList = AmsterdamData.loadClubs(),
                museumsList = AmsterdamData.loadMuseums(),
                coffeeShopsList = AmsterdamData.loadCoffeeShops(),
            ),
        )
    val recommendationsState: StateFlow<RecommendationsUiState> = _uiState
}

data class RecommendationsUiState(
    val restaurantsList: List<Recommendation>,
    val musicVenuesList: List<Recommendation>,
    val clubsList: List<Recommendation>,
    val museumsList: List<Recommendation>,
    val coffeeShopsList: List<Recommendation>,
)
