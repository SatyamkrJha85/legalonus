package com.theapplicationpad.legalonus.Navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.theapplicationpad.legalonus.Retrofit.FetchLIstViewModel
import com.theapplicationpad.legalonus.Screens.BottomBar
import com.theapplicationpad.legalonus.Screens.GeminiIntegrate.ChatViewModel
import com.theapplicationpad.legalonus.Screens.GeminiIntegrate.MessageModel
import com.theapplicationpad.legalonus.Screens.HomeScreen
import com.theapplicationpad.legalonus.Screens.SplashScreen
import com.theapplicationpad.legalonus.Screens.WebViewScreen


@Composable
fun NavGraph(modifier: Modifier = Modifier,chatViewModel: ChatViewModel,deepLinkUrl: String?,fetchLIstViewModel: FetchLIstViewModel) {
    val navcontroller = rememberNavController()

    // Determine the start destination based on the availability of the deep link URL


    NavHost(navController = navcontroller, startDestination = Routes.Splash.route) {
        composable(Routes.Splash.route){
            SplashScreen(navController = navcontroller, deepLinkUrl = deepLinkUrl)
        }

        val startDestination = if (deepLinkUrl != null) {
            Routes.NewsScreen.route
        } else {
            Routes.BottomBar.route
        }

        composable(Routes.BottomBar.route){
            BottomBar(chatViewModel = chatViewModel, lIstViewModel = fetchLIstViewModel)
        }
        composable(Routes.NewsScreen.route) { backStackEntry ->
                WebViewScreen(url = deepLinkUrl.toString())
        }

    }
}
