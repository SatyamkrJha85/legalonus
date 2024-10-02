package com.theapplicationpad.legalonus

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.theapplicationpad.legalonus.Navigations.NavGraph
import com.theapplicationpad.legalonus.Retrofit.FetchLIstViewModel
import com.theapplicationpad.legalonus.Screens.GeminiIntegrate.ChatViewModel
import com.theapplicationpad.legalonus.Screens.WebViewScreen
import com.theapplicationpad.legalonus.ui.theme.LegalonusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val chatViewModel = ViewModelProvider(this)[ChatViewModel::class.java]
        val intent = intent
        val deepLinkUrl = intent?.data?.toString() // Get deep link URL if available

        val viewModel = ViewModelProvider(this)[FetchLIstViewModel::class.java]
        setContent {
            LegalonusTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    innerPadding

                    Column (
                        modifier = Modifier.padding(innerPadding)
                    ){
                        NavGraph(chatViewModel = chatViewModel, deepLinkUrl = deepLinkUrl, fetchLIstViewModel = viewModel)
                        }

                    }
                }
            }
        }

    }




