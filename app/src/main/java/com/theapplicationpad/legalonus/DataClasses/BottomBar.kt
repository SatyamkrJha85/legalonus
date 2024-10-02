package com.theapplicationpad.legalonus.DataClasses

data class BottomNavItem(
    val title: String,
    val route: String,
    val icon: Int,
    val secondicon: Int = 0
)