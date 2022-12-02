package com.hanbitkang.mypokemon.navigation

import com.hanbitkang.core_navigation.MpNavigationDestination

data class TopLevelDestination(
    override val route: String,
    override val destination: String,
    val selectedIconId: Int,
    val unselectedIconId: Int,
    val iconTextId: Int
) : MpNavigationDestination