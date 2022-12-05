package com.hanbitkang.feature.favorite.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.hanbitkang.core.designsystem.MpNavigationDestination
import com.hanbitkang.feature.favorite.FavoriteScreen

object FavoriteDestination : MpNavigationDestination {
    override val route = "favorite_route"
    override val destination = "favorite_destination"
}

fun NavGraphBuilder.favoriteGraph() {
    composable(route = FavoriteDestination.route) {
        FavoriteScreen()
    }
}