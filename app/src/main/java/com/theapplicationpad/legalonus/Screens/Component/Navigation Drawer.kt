package com.theapplicationpad.legalonus.Screens.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
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
import com.theapplicationpad.legalonus.DataClasses.DrawerItem
import com.theapplicationpad.legalonus.R
import com.theapplicationpad.legalonus.ui.theme.LogoColor
import com.theapplicationpad.legalonus.ui.theme.WhiteWc
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawer(
    items: List<DrawerItem>,
    onItemClicked: (DrawerItem) -> Unit,
    modifier: Modifier = Modifier,
    drawerState: DrawerState,
    coroutineScope: CoroutineScope
) {
    // Detect system's dark mode
    val isDarkTheme = androidx.compose.foundation.isSystemInDarkTheme()

    // Set background color based on the theme
    val backgroundColor = if (isDarkTheme) Color.Black else LogoColor
    val textColor = if (isDarkTheme) Color.White else Color.Black

    Column(
        modifier = modifier
            .fillMaxHeight()  // Full height
            .fillMaxWidth(0.7f)  // Half of the screen width
            .background(backgroundColor) // Set background based on theme
       ) {
        Column (
            modifier.padding(start = 20.dp)
        ){
            Row (
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(text = "LegalOnus", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.SemiBold,fontFamily = FontFamily(
                    Font(R.font.aclonica)
                ),)


                IconButton(onClick = {
                    coroutineScope.launch {
                        drawerState.close() // Close the drawer when the clear button is clicked
                    }
                }) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.Clear, contentDescription =null, tint = Color.White )
                }
            }
            Text(text = "Aequitas Sequitur Legem", color = Color.White, fontWeight = FontWeight.Normal, fontSize = 13.sp,fontFamily = FontFamily(
                Font(R.font.aclonica)
            ),)



            Spacer(modifier = Modifier.padding(top = 5.dp))
            Divider()
        }
        items.forEach { item ->
            Column {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .clickable { onItemClicked(item) },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    androidx.compose.material3.Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        modifier = Modifier
                            .size(24.dp)
                        //.padding(end = 16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = item.title,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        fontFamily = FontFamily(
                            Font(R.font.aclonica)
                        ),
                    )

                }
                Divider()

            }

        }
        Column {
            Row (
                modifier= modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Text(text = "Connect With Us", color = Color.White, fontWeight = FontWeight.Normal, fontSize = 16.sp,fontFamily = FontFamily(
                    Font(R.font.aclonica)
                ),)
            }


            Row {
                DrawerNavigationIcons(icon = R.drawable.website , link = "https://legalonus.com/")
                DrawerNavigationIcons(icon = R.drawable.fb, link ="https://www.facebook.com/AcpuitasSequiturLegam/" )
                DrawerNavigationIcons(icon =R.drawable.insta , link = "https://www.instagram.com/legalonus/")
                DrawerNavigationIcons(icon = R.drawable.linkedin , link = "https://www.linkedin.com/company/legalonus.com/posts/?feedView=all&viewAsMember=true")

            }

            Row {
                DrawerNavigationIcons(icon = R.drawable.whatapp , link = "https://chat.whatsapp.com/DgjtklGZNy9CRAufqNUWLs")
                DrawerNavigationIcons(icon = R.drawable.telegram , link = "https://t.me/officiallegalonus")
                DrawerNavigationIcons(icon = R.drawable.youtube , link = "https://www.youtube.com/channel/UCQHbPNjxP7DCcIDYBGIsEqw")
                DrawerNavigationIcons(icon = R.drawable.wpchannel , link = "https://whatsapp.com/channel/0029Va9M6rU5K3zPlw0FP441")

            }
        }

    }
}
