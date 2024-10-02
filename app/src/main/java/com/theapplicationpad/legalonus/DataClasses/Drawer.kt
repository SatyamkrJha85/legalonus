package com.theapplicationpad.legalonus.DataClasses

import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.Cached
import androidx.compose.material.icons.filled.Commute
import androidx.compose.material.icons.filled.Contacts
import androidx.compose.material.icons.filled.Foundation
import androidx.compose.material.icons.filled.Groups2
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Leaderboard
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Webhook
import androidx.compose.ui.graphics.vector.ImageVector
import com.theapplicationpad.legalonus.Navigations.Routes
import com.theapplicationpad.legalonus.R

data class DrawerItem(
    val icon: ImageVector, // Icon resource ID
    val title: String,          // Title of the item
    val route: String            // URL or route link
)

val drawerItems = listOf(
    DrawerItem(icon = Icons.Filled.Person, title = "Login", route = ""),
    DrawerItem(icon = Icons.Filled.Cached, title = "Legal Coverage", route = Routes.LegalCoverage.route),
    DrawerItem(icon = Icons.Filled.Leaderboard, title = "Editorial Board", route = Routes.Editorialboard.route),
    DrawerItem(icon = Icons.Filled.Foundation, title = "Founder’s View", route = Routes.TheFounder.route),
    DrawerItem(icon = Icons.Filled.Commute, title = "LegalOnus Community", route = Routes.OurCommunity.route),
    DrawerItem(icon = Icons.Filled.Groups2, title = "About Us", route = Routes.AboutUS.route),
    DrawerItem(icon = Icons.Filled.Webhook, title = "LegalOnus Law Journal", route = Routes.LegalOnusLawJournal.route),
)
