package com.theapplicationpad.legalonus.Screens.Component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.theapplicationpad.legalonus.DataClasses.BottomNavItem
import com.theapplicationpad.legalonus.Navigations.Routes
import com.theapplicationpad.legalonus.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBottomBar(navController: NavHostController) {

    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    val (selectedRoute, setSelectedRoute) = remember { mutableStateOf(Routes.Home.route) }

    // Define navigation items
    val homeItem = BottomNavItem("Home", Routes.Home.route, R.drawable.home)
    val aiitem = BottomNavItem("Chat", Routes.Ai.route, R.drawable.chatt)
    val lljitem = BottomNavItem("LLJ", Routes.LLJ.route, R.drawable.auction)


    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = CardDefaults.elevatedCardElevation(10.dp)
    ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()

                .padding(start = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // first side IconButton

            Column {

                IconButton(
                    onClick = {
                        if (currentRoute != homeItem.route) {
                            navController.navigate(homeItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                            }
                            setSelectedRoute(homeItem.route)
                        }
                    },

                    ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        androidx.compose.material3.Icon(
                            painter = painterResource(id = homeItem.icon),
                            contentDescription = homeItem.title,
                            modifier = Modifier.size(30.dp),

                            tint = if (selectedRoute == homeItem.route) Color.Black else Color.Gray,
                        )


                    }


                }

            }

            // second side IconButton
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){


                IconButton(
                    onClick = {
                        if (currentRoute != aiitem.route) {
                            navController.navigate(aiitem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                            }
                            setSelectedRoute(aiitem.route)
                        }
                    },
                ) {

                    androidx.compose.material3.Icon(
                        painter = painterResource(id = aiitem.icon),
                        modifier = Modifier.size(30.dp),

                        contentDescription = aiitem.title,
                        tint = if (selectedRoute == aiitem.route) Color.Black else Color.Gray,
                    )
                }

            }

            // Spacer for right side alignment

            // third side IconButton
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                IconButton(
                    onClick = {
                        if (currentRoute != lljitem.route) {
                            navController.navigate(lljitem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                            }
                            setSelectedRoute(lljitem.route)
                        }
                    },

                    ) {
                    androidx.compose.material3.Icon(
                        painter = painterResource(id = lljitem.icon),
                        contentDescription = lljitem.title,
                        modifier = Modifier.size(35.dp),
                        tint = if (selectedRoute == lljitem.route) Color.Black else Color.Gray,
                    )
                }


            }


        }
    }
}