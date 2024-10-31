package com.example.amsterdamrecommendationsapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recommendation(
    val id: Int,
    val name: String,
    @StringRes val description: Int,
    @DrawableRes val image: Int,
    val address: String,
    val phoneNumber: String,
    val websiteUrl: String,
    val openingHours: String,
)
