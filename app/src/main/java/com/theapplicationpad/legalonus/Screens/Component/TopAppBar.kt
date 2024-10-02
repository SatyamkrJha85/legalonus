package com.theapplicationpad.legalonus.Screens.Component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theapplicationpad.legalonus.R
import com.theapplicationpad.legalonus.ui.theme.LogoColor
import com.theapplicationpad.legalonus.ui.theme.WhiteWc

@Composable
fun TopHeader(modifier: Modifier = Modifier, onMenuClicked: () -> Unit) {
    Row(
        modifier = modifier
            .background(LogoColor)
            .fillMaxWidth()
            .padding(top = 5.dp, start = 15.dp, end = 15.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(Color.White)
                .border(
                    2.dp,
                    Color.Red, CircleShape
                ), Alignment.Center
        ) {
            androidx.compose.material3.Icon(
                painter = painterResource(id = R.drawable.logo), contentDescription = null,
                modifier = modifier.size(40.dp)
            )

        }

        Spacer(modifier = Modifier.width(20.dp))

        Column {
            Text(
                text = "Welcome to", color = Color.White,
                fontFamily = FontFamily(
                    Font(R.font.aclonica)
                ),
            )
            Text(
                text = "Legalonus",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily(
                    Font(R.font.aclonica)
                ),
            )

        }

        Spacer(modifier = Modifier.width(90.dp))

        androidx.compose.material3.Icon(
            imageVector = Icons.Filled.Menu,
            tint = Color.White,
            contentDescription = null,
            modifier = modifier
                .size(30.dp)
                .clickable {
                    onMenuClicked()
                })


    }
}