package com.theapplicationpad.legalonus.Screens.HeaderScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FounderView(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            // Add a header text with emoji and style
            Text(
                text = "🚀 Founder’s View",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Quoted text section with indentation
            Text(
                text = "“Hey there, I’m Ayush Chandra and I’m thrilled to welcome you to my digital home! Having a legal background, I’ve been fortunate to dive deep into the world of the legal system. It all began with my insatiable curiosity and love for the different laws of the nations.”",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontStyle = FontStyle.Italic,
                    fontSize = 18.sp,
                    color = Color.Gray
                ),
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFE3F2FD))
                    .padding(12.dp)
            )

            // Add an emoji to introduce the body section
            Text(
                text = "⚖️ My Legal Journey",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "Throughout my academic career, I’ve had the privilege of working with the District Legal Services Authority, with some of the High Court advocates, and I’ve learned a lot from the senior advocate of the Supreme Court, where I honed my skills in litigation and how to interlink and play with laws in providing legal help.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // Adding space between sections
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "🌟 Valuable Experiences",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "These opportunities have allowed me to connect with brilliant minds and visionaries, shaping me into the person I am today. One of the most rewarding aspects of my journey has been this website, through which I can provide you with legal prospects.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "You’ll find a diverse range of content here, from thought-provoking articles on legal topics to explanatory videos. I aim to provide you with valuable insights, practical tips, and maybe even a sprinkle of inspiration to make your mark in the legal world. 🌱",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "🐾 When I’m not absorbed in developing my legal values, I enjoy reading books with legal themes. By the way, I’m a dog lover too!",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // Contact Section with Icon
            Text(
                text = "✉️ Get in Touch",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 12.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 12.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Email Icon",
                    tint = Color(0xFF757575),
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "info@legalonus.com\nayush.chandra@legalonus.com",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontSize = 16.sp,
                        color = Color(0xFF757575)
                    )
                )
            }

            // Final inspirational message with emoji
            Text(
                text = "Let’s engage in meaningful conversations and make a positive impact together. Thank you again for stopping by, and I hope you find valuable content and inspiration during your visit. Remember to explore, learn, and embrace the journey ahead! 🌍✨",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(bottom = 12.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFounderView() {
    FounderView()
}
