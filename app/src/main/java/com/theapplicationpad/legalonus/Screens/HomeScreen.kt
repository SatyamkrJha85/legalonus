package com.theapplicationpad.legalonus.Screens

import android.net.Uri
import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.testjson.model.ItemElement
import com.example.testjson.model.MyModelList
import com.example.testjson.model.MyModelListItem
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.theapplicationpad.legalonus.DataClasses.HeaderItems
import com.theapplicationpad.legalonus.Navigations.Routes
import com.theapplicationpad.legalonus.Retrofit.FetchLIstViewModel
import com.theapplicationpad.legalonus.Retrofit.PostFetchResponse
import com.theapplicationpad.legalonus.Screens.Component.CategorySectionLayout
import com.theapplicationpad.legalonus.Screens.Component.CategoryTabRow
import com.theapplicationpad.legalonus.Screens.Component.HomeHeaderItems
import com.theapplicationpad.legalonus.Screens.Component.MainScreen
import com.theapplicationpad.legalonus.Screens.Component.SubSection
import com.theapplicationpad.legalonus.ui.theme.LogoColor
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier,navHostController: NavHostController,fetchLIstViewModel: FetchLIstViewModel) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(LogoColor)
    
   // PostResult(fetchLIstViewModel = fetchLIstViewModel)
    ArticleList(viewModel = fetchLIstViewModel,navHostController)

}



@OptIn(ExperimentalFoundationApi::class)
@Composable

fun ArticleList(viewModel: FetchLIstViewModel,navHostController: NavHostController) {
    // Remember the selected category ID, starting with the first category
    var selectedCategory = remember { mutableStateOf(categories[0].id) }

    // Fetch articles for the initial category when the composable is first launched
    LaunchedEffect(Unit) {
        viewModel.postList(selectedCategory.value)
    }

    // Set up pager state and coroutine scope
    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f,
        pageCount = { categories.size }
    )
    val coroutineScope = rememberCoroutineScope()
    val response = viewModel.result.observeAsState()

    Column {
        // CategoryTabRow now displays category names
        CategoryTabRow(
            pagerState = pagerState,
            categories = categories.map { it.name }, // Show names in the tab
            onTabSelected = { page ->
                coroutineScope.launch {
                    pagerState.animateScrollToPage(page)
                    selectedCategory.value = categories[page].id // Update selected category ID
                    viewModel.postList(selectedCategory.value)  // Fetch data for selected category
                }
            }
        )

        HorizontalPager(state = pagerState) { page ->
            when (val result = response.value) {
                is PostFetchResponse.Error -> {
                    Text(text = result.error)
                }
                PostFetchResponse.Loading -> {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CircularProgressIndicator()
                    }
                }
                is PostFetchResponse.Success -> {
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(result.data) { article ->
                            ArticleItem(article = article,navHostController)
                        }
                    }
                }
                null -> {
                    // Handle null state if needed
                }
            }
        }
    }
}

@Composable
fun ArticleItem(article: MyModelListItem,navHostController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {


                // Title
                Text(
                    text = article.title.rendered,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(vertical = 4.dp)
                )

                Text(
                    text = article.id.toString(),
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(vertical = 4.dp)
                )

                // Date
                Text(
                    text = "Published on: ${article.date}",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                // Excerpt
                Text(
                    text = article.excerpt.rendered,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(vertical = 8.dp),
                    maxLines = 3
                )

                // Divider for separation
                Divider(color = Color.LightGray, modifier = Modifier.padding(vertical = 8.dp))

                // Read more or go to article link
                ClickableText(
                    text = androidx.compose.ui.text.AnnotatedString("Read Full Article"),
                    style = MaterialTheme.typography.labelLarge.copy(
                        color = MaterialTheme.colorScheme.primary,
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.align(Alignment.End),
                    onClick = {
                        navHostController.navigate(Routes.ArticleDetails.route + "/${article.id}")

                    }
                )
            }
        }
    }
}



data class Category(val name: String, val id: String)

// List of categories with custom names and IDs


val categories = listOf(
    Category(name = "Criminal Law", id = "21"),
    Category(name = "Civil Law", id = "22"),
    Category(name = "Health Law", id = "23"),
    Category(name = "Sports", id = "24"),
    Category(name = "Technology", id = "25"),
    Category(name = "Entertainment", id = "26")
)



