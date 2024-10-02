package com.theapplicationpad.legalonus.Screens

import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.model.content.CircleShape
import com.theapplicationpad.legalonus.DataClasses.drawerItems
import com.theapplicationpad.legalonus.Navigations.Routes
import com.theapplicationpad.legalonus.R
import com.theapplicationpad.legalonus.Retrofit.FetchLIstViewModel
import com.theapplicationpad.legalonus.Screens.Component.MyBottomBar
import com.theapplicationpad.legalonus.Screens.Component.NavigationDrawer
import com.theapplicationpad.legalonus.Screens.Component.TopHeader
import com.theapplicationpad.legalonus.Screens.GeminiIntegrate.ChatViewModel
import com.theapplicationpad.legalonus.Screens.HeaderScreen.AboutUs
import com.theapplicationpad.legalonus.Screens.HeaderScreen.Community
import com.theapplicationpad.legalonus.Screens.HeaderScreen.EditorialBoard
import com.theapplicationpad.legalonus.Screens.HeaderScreen.ForLegalOnusLawJournal
import com.theapplicationpad.legalonus.Screens.HeaderScreen.FounderView
import com.theapplicationpad.legalonus.Screens.HeaderScreen.LawGeneral
import com.theapplicationpad.legalonus.Screens.HeaderScreen.LegalCoverage
import com.theapplicationpad.legalonus.Screens.HeaderScreen.LegalOnusWebsite
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBar(modifier: Modifier = Modifier,chatViewModel: ChatViewModel,lIstViewModel: FetchLIstViewModel) {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed) // Drawer state
    val snackbarHostState = remember { SnackbarHostState() } // Snackbar state for snackbars
    val coroutineScope = rememberCoroutineScope() // For launching coroutines

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            NavigationDrawer(
                items = drawerItems,
                drawerState = drawerState,
                coroutineScope = coroutineScope,
                onItemClicked = { item ->


                    navController.navigate(item.route)
                }
            )
        },
        gesturesEnabled = false, // Disable the gestures for opening/closing drawer

    ) {
        Scaffold(
            snackbarHost = { SnackbarHost(snackbarHostState) },
            containerColor = Color.Transparent,
            bottomBar = { MyBottomBar(navController) },
            topBar = {
                TopHeader(
                    onMenuClicked = {
                        // Open the drawer when the menu button is clicked
                        coroutineScope.launch {
                            drawerState.open()
                        }

                    }
                )
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = Routes.Home.route,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(Routes.Home.route) {
                    HomeScreen(navHostController = navController, fetchLIstViewModel = lIstViewModel)
                }
                composable(Routes.Ai.route) {
                    Aiscreen(viewModel = chatViewModel)
                }
                composable(Routes.LLJ.route) {
                    LLJ()
                }
                composable(Routes.NewsScreen.route) { backStackEntry ->
                    val url = backStackEntry.arguments?.getString("url")?.let { Uri.decode(it) }
                    url?.let {
                        WebViewScreen(it)
                    }
                }

                composable(Routes.LegalCoverage.route) {
                    LegalCoverage(navController = navController)
                }
                composable(Routes.LegalOnusWebsite.route) {
                   LegalOnusWebsite()
                }

                composable(Routes.ForLegalOnusLawJournal.route) {
                   ForLegalOnusLawJournal()
                }

                composable(Routes.Editorialboard.route) {
                    EditorialBoard()
                }
                composable(Routes.TheFounder.route) {
                    FounderView()
                }

                composable(Routes.OurCommunity.route) {
                    Community()
                }

                composable(Routes.AboutUS.route) {
                    AboutUs()
                }

                composable(Routes.LegalOnusLawJournal.route) {
                    LawGeneral()
                }


            }
        }
    }
    
}





