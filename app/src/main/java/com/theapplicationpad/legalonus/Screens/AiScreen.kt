package com.theapplicationpad.legalonus.Screens

import androidx.compose.foundation.Image
import androidx.compose.material3.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theapplicationpad.legalonus.R
import com.theapplicationpad.legalonus.Screens.GeminiIntegrate.ChatViewModel
import com.theapplicationpad.legalonus.Screens.GeminiIntegrate.MessageModel
import com.theapplicationpad.legalonus.ui.theme.ColorModelMessage
import com.theapplicationpad.legalonus.ui.theme.ColorUserMessage
import com.theapplicationpad.legalonus.ui.theme.LightGray
import com.theapplicationpad.legalonus.ui.theme.Purple80


@Composable
fun Aiscreen(modifier: Modifier = Modifier,viewModel: ChatViewModel) {
    Box( // Box allows us to layer the background and content
        modifier = modifier
            .fillMaxSize()
    ) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.bg), // Replace with your image resource ID
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxSize() // Fill the whole screen with the image
        )
        Column(
            modifier = modifier

        ) {
            MessageList(
                modifier = Modifier.weight(1f),
                messageList = viewModel.messageList
            )
            MessageInput(
                onMessageSend = {
                    viewModel.sendMessage(it)
                }
            )
        }
    }
}


@Composable
fun MessageList(modifier: Modifier = Modifier,messageList : List<MessageModel>) {
    if(messageList.isEmpty()){
        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier.size(60.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Icon",
                tint = Color.Black,
            )
            Text(text = "Ask me anything", fontSize = 22.sp, fontFamily = FontFamily(
                Font(R.font.aclonica)
            ),)
        }
    }else{
        LazyColumn(
            modifier = modifier,
            reverseLayout = true
        ) {

            items(messageList.reversed()){
                MessageRow(messageModel = it)
            }
        }
    }


}

@Composable
fun MessageRow(messageModel: MessageModel) {
    val isModel = messageModel.role=="model"

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {

            Box(
                modifier = Modifier
                    .align(if (isModel) Alignment.BottomStart else Alignment.BottomEnd)
                    .padding(
                        start = if (isModel) 8.dp else 70.dp,
                        end = if (isModel) 70.dp else 8.dp,
//                        top = 8.dp,
//                        bottom = 8.dp
                    )
                    .clip(RoundedCornerShape(20.dp))
                    .background(if (isModel) LightGray else ColorUserMessage)
                    .padding(16.dp)
            ) {

                SelectionContainer {
                    Text(
                        text = messageModel.message,
                        fontWeight = FontWeight.W500,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black
                    )
                }


            }

        }


    }


}



@Composable
fun MessageInput(onMessageSend : (String)-> Unit) {

    var message by remember {
        mutableStateOf("")
    }

    Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedTextField(
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .weight(1f)
            ,
            value = message,
            onValueChange = {
                message = it
            },
            placeholder = {
                Text(text = "Ask Your Query")
            }
        )
        IconButton(onClick = {
            if(message.isNotEmpty()){
                onMessageSend(message)
                message = ""
            }

        }) {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Send"
            )
        }
    }
}

