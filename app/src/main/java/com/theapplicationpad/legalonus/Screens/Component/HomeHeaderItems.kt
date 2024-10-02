package com.theapplicationpad.legalonus.Screens.Component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.theapplicationpad.legalonus.R
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import com.google.accompanist.pager.PagerState


@Composable
fun HomeHeaderItems(modifier: Modifier = Modifier, title: String, icon: Int, onclick: () -> Unit) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier
            .clip(CircleShape)
            .clickable {
                onclick()
            }
            .size(50.dp)
            .border(1.dp, Color.Gray, CircleShape), Alignment.Center) {
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




@OptIn(ExperimentalPagerApi::class, ExperimentalFoundationApi::class)
@Composable
fun MainScreen() {
    val pagerState = rememberPagerState(pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier

            .padding(16.dp)
            .border(1.dp, Color.Black, RoundedCornerShape(12.dp))
            .clip(shape = RoundedCornerShape(12.dp))
            .fillMaxWidth()
           // .background(Color(0xFFB3E5FC))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Horizontal Pager
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) { page ->
            if (page == 0) {
                // First page with 4 items
                ImageGrid(
                    items = listOf(
                        ImageItem("Legal Coverage", R.drawable.header1),
                        ImageItem("Submit Your Article", R.drawable.header2),
                        ImageItem("Editorial Board", R.drawable.header3),
                        ImageItem("The Founder", R.drawable.header4)
                    )
                )
            } else {
                // Second page with 2 items
                ImageGrid(
                    items = listOf(
                        ImageItem("Legal Coverage", R.drawable.header5),
                        ImageItem("Submit Your Article", R.drawable.header6)
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Pager Indicator (Dots)
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            repeat(2) { index ->
                val color = if (pagerState.currentPage == index) Color.Black else Color.Gray
                Box(
                    modifier = Modifier
                        .padding(2.dp)
                        .size(10.dp)
                        .clip(CircleShape)
                        .background(color)
                        .padding(horizontal = 4.dp)
                )
            }
        }
    }
}

// Data class for holding image and title information
data class ImageItem(val title: String, val imageRes: Int)

@Composable
fun ImageGrid(items: List<ImageItem>) {
    // Grid of items (2x2 for first page, 2x1 for second page)
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Create rows for the grid
        for (i in items.indices step 2) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Two items per row
                ImageBox(item = items[i])
                if (i + 1 < items.size) {
                    ImageBox(item = items[i + 1])
                }
            }
        }
    }
}

@Composable
fun ImageBox(item: ImageItem) {
    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .padding(2.dp)
                //.clip(RoundedCornerShape(22.dp))
                .size(width = 130.dp, height = 110.dp)
                .background(Color.White, shape = RoundedCornerShape(12.dp))
                ,
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.title,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = item.title,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            ),
            color = Color.Black
        )
    }
}
