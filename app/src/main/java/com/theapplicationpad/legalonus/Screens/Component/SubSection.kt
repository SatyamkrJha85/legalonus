package com.theapplicationpad.legalonus.Screens.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubSection(modifier: Modifier = Modifier, title: String, icon: Int, onclick: () -> Unit) {

        Column(
            modifier = modifier.fillMaxWidth().padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = modifier
                .clip(RoundedCornerShape(5.dp))
                .clickable {
                    onclick()
                }
                .size(width = 230.dp, height = 200.dp)
                .border(1.dp, Color.Gray, RoundedCornerShape(5.dp)), Alignment.Center) {
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    modifier = modifier.padding(5.dp)
                )
            }
            Spacer(modifier = modifier.padding(top = 5.dp))
            Text(text = title, fontSize = 10.sp, fontWeight = FontWeight.SemiBold)
        }


    }

