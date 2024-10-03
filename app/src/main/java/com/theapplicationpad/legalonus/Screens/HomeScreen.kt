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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
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
import com.theapplicationpad.legalonus.Screens.Component.HomeHeaderItems
import com.theapplicationpad.legalonus.Screens.Component.MainScreen
import com.theapplicationpad.legalonus.Screens.Component.SubSection
import com.theapplicationpad.legalonus.ui.theme.LogoColor

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier,navHostController: NavHostController,fetchLIstViewModel: FetchLIstViewModel) {

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(LogoColor)
    
    PostResult(fetchLIstViewModel = fetchLIstViewModel)
//    LazyColumn(modifier = modifier
//        .background(
//            brush = Brush.verticalGradient(
//                colors = listOf(
//                    Color(0xFFFFFFFF),  // First color
//                    Color(0xFFA4CEE9),  // Second color
//                    Color(0xFF39B1F8)    // Third color
//                )
//            )
//        )
//        .fillMaxSize()) {

//        item {
//            CategorySectionLayout(onMovieClicked = { link ->
//                // Encode the URL
//                val encodedUrl = Uri.encode(link)
//
//                navHostController.navigate(Routes.NewsScreen.createRoute(encodedUrl))
//            })
//        }
//        item {
//            MainScreen()
//        }


//        item {
//
//            Column(
//                modifier = Modifier
//                    .padding(16.dp)
//                    .border(1.dp, Color.Black, RoundedCornerShape(12.dp))
//                    .clip(shape = RoundedCornerShape(12.dp))
//                    .fillMaxWidth()
//                    .background(Color(0xFFB3E5FC))
//                    .padding(16.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {
//                LazyVerticalGrid(
//                    columns = GridCells.Fixed(2), // Define how many rows you want
//                    modifier = Modifier
//                        .padding(10.dp)
//                        .fillMaxWidth()
//                        .height(400.dp), // Set fixed height to avoid infinite constraints,
//                ) {
//                    items(HeaderItems) { item ->
//                        SubSection(
//                            title = item.name,
//                            icon = item.icon,
//                            onclick = {
//                                // Encode the URL
//                                val encodedUrl = Uri.encode(item.link)
//
//                                navHostController.navigate(Routes.NewsScreen.createRoute(encodedUrl))
//                            }
//                        )
//                    }
//                }
//            }
//        }

 //   }
}


@Composable
fun PostResult(modifier: Modifier = Modifier,fetchLIstViewModel: FetchLIstViewModel) {
    
    val response = fetchLIstViewModel.result.observeAsState()
    
    when(val result = response.value){
        is PostFetchResponse.Error -> {
            Text(text = result.error)
        }
        PostFetchResponse.Loading -> {
            CircularProgressIndicator()
        }
        is PostFetchResponse.Success -> {

//            LazyColumn {
//                item {
                    ArticleList(result.data)

          //      }
        //    }
        }
        null -> {
            
        }
    }
}

@Composable
fun ArticleList(articleList: MyModelList) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        Log.d("Start","Start")
        items(articleList) { article ->

            ArticleItem(article = article)
        }
    }
}

@Composable
fun ArticleItem(article: MyModelListItem) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {

        // Title
        Text(text = article.title.rendered, style = MaterialTheme.typography.headlineMedium)
//        Text(text = article.author.toString(), style = MaterialTheme.typography.headlineMedium)
        Text(text = article.date, style = MaterialTheme.typography.headlineMedium)
      //  Text(text = article.content.rendered, style = MaterialTheme.typography.headlineMedium)



        // Author
//        Text(text = "Author ID: ${article.author}", style = MaterialTheme.typography.labelSmall)
//
//        // Date
//        Text(text = "Published on: ${article.date}", style = MaterialTheme.typography.bodyMedium)
//
//        // Meta data (as an example of showing one meta field)
//        Text(text = "Reading Time: ${article.meta._editorskit_reading_time} mins", style = MaterialTheme.typography.bodyMedium)
//
//        Spacer(modifier = Modifier.height(8.dp))

        Divider()
    }
}

