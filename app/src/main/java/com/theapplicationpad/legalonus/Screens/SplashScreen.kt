package com.theapplicationpad.legalonus.Screens

import android.util.Log
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.theapplicationpad.legalonus.Navigations.Routes
import com.theapplicationpad.legalonus.R
import com.theapplicationpad.legalonus.ui.theme.LogoColor
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(modifier: Modifier = Modifier, navController: NavController, deepLinkUrl: String?) {

    var startAnimation by remember { mutableStateOf(false) }

    // Trigger the animation when the Composable enters the composition
    LaunchedEffect(Unit) {
        Log.d("Start","StarttheApp")
        startAnimation = true
        delay(3000) // Delay for 2 seconds
        // Check if deepLinkUrl is null
        if (deepLinkUrl != null) {
            navController.navigate(Routes.NewsScreen.route + "?url=$deepLinkUrl") {
                popUpTo(0) // Removes the splash from the back stack
            }
        } else {
            navController.navigate(Routes.BottomBar.route) {
                popUpTo(0) // Removes the splash from the back stack
            }
        }

        Log.d("Start","EndtheApp")

    }

    val offsetX by animateDpAsState(
        targetValue = if (startAnimation) 0.dp else (-200).dp, // Start off-screen to the left
        animationSpec = tween(durationMillis = 1000) // Duration of the animation
    )

    // Content
    val textColor = if (isSystemInDarkTheme()) Color.White else Color.Black // Adapt to theme

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Spacer(modifier = Modifier.height(15.dp))

        Box(modifier = Modifier.offset(x = offsetX)) {
            Text(
                text = "Welcome to",
                color = textColor,
                fontSize = 45.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.aclonica)),
            )
        }

        Box(modifier = Modifier.offset(y = offsetX)) {  // Adjust this if needed
            Text(
                text = "Legalonus",
                color = LogoColor,
                fontSize = 45.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(Font(R.font.aclonica)),
            )
        }

        Box(modifier = Modifier.offset(y = offsetX)) {  // Adjust this if needed

            Spacer(modifier = Modifier.height(15.dp))


        }
        Spacer(modifier = Modifier.height(15.dp))

        Row (
            modifier=modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Image(painter = painterResource(id = R.drawable.logo), contentDescription =null,modifier=modifier.size(180.dp) )
        }

        Row (
            modifier=modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Image(painter = painterResource(id = R.drawable.blacklady), contentDescription =null,modifier.size(200.dp) )
        }



    }
}


