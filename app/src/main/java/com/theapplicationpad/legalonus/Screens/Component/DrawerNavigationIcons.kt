package com.theapplicationpad.legalonus.Screens.Component

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.theapplicationpad.legalonus.ui.theme.WhiteWc

@Composable
fun DrawerNavigationIcons(modifier: Modifier = Modifier,icon:Int,link:String) {
    val context = LocalContext.current // Get the current context

    Box(modifier = modifier
        .padding(10.dp)
        .clip(CircleShape)
        .size(40.dp)
        .background(WhiteWc)
        .padding(4.dp)
        .clickable {
// Create an intent to open the URL in a browser
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            context.startActivity(intent) // Start the intent
        }

        .clip(CircleShape), Alignment.Center){
        Image(painter = painterResource(id = icon), contentDescription = null)
    }
}