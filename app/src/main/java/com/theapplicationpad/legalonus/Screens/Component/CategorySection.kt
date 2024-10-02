package com.theapplicationpad.legalonus.Screens.Component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.layout.lerp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.theapplicationpad.legalonus.DataClasses.CategoryItems
import com.theapplicationpad.legalonus.DataClasses.CategorySection
import com.theapplicationpad.legalonus.ui.theme.LogoColor
import kotlin.math.absoluteValue

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategorySectionLayout(onMovieClicked: (String) -> Unit) {

    val pagerState = rememberPagerState(pageCount = { CategoryItems.size })

    HorizontalPager(
        state = pagerState,
        contentPadding = PaddingValues(horizontal = 52.dp), // Padding for multi-page view
        pageSpacing = 2.dp  // Add some space between pages
    ) { page ->
        Column(
            modifier = Modifier
                .padding(top = 20.dp)
                .wrapContentHeight()
                .graphicsLayer {
                    val pageOffset = pagerState.getOffsetFractionForPage(page).absoluteValue
                    lerp(
                        start = ScaleFactor(1f, 0.85f),
                        stop = ScaleFactor(1f, 1f),
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale.scaleX
                        scaleY = scale.scaleY
                    }
                }
                .clickable {
                    onMovieClicked(CategoryItems[page].link) // Pass the link
                },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.clip(RoundedCornerShape(16.dp)),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(
                    painter = painterResource(id = CategoryItems[page].img),
                    contentDescription = "Movie Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth(fraction = 0.85f)
                        .height(340.dp)
                )

                Box(modifier = Modifier
                    .fillMaxWidth(fraction = 0.85f)
                    .wrapContentHeight()
                    .graphicsLayer {
                        val pageOffset = pagerState.getOffsetFractionForPage(page).absoluteValue
                        val transalation = pageOffset.coerceIn(0f, 1f)
                        translationY = transalation * 200
                    }
                    .background(
                        LogoColor
                    )
                    .padding(vertical = 16.dp), contentAlignment = Alignment.Center) {

                    Text(
                        text = "Read Now",
                        style = MaterialTheme.typography.titleSmall.copy(
                            color = White,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "${pagerState.currentPage} ) ${CategoryItems[page].name}",
                style = MaterialTheme.typography.titleMedium,
                color = Black,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))


        }
    }


}
