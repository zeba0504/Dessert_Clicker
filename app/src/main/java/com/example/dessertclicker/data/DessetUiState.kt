package com.example.dessertclicker.data
import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

data class DessetUiState(
    val currentDessertIndex: Int = 0,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId
)
