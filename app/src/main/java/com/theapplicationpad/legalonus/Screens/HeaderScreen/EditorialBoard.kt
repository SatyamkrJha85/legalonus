package com.theapplicationpad.legalonus.Screens.HeaderScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun EditorialBoard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        // Title
        Text(
            text = "Editorial Board",
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Subtitle
        Text(
            text = "Welcome to the Editorial Board page of the LegalOnus Law Journal (LLJ). Our esteemed Editorial Board is composed of accomplished legal scholars, practitioners, and experts who ensure the quality and integrity of the research published in LLJ.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Section 1 - Role of the Editorial Board
        IconTextRow(
            text = "Role of the Editorial Board",
            icon = Icons.Default.Assignment,
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            padding = 8.dp
        )

        Text(
            text = "The Editorial Board plays a vital role in shaping the direction of the LegalOnus Law Journal (LLJ). Our board members are responsible for:",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Responsibilities List
        BulletPointList(
            items = listOf(
                "Peer Review Oversight: Managing the peer review process to maintain the highest standards of scholarship.",
                "Content Selection: Carefully reviewing submissions to ensure relevance, originality, and academic rigour.",
                "Guidance and Mentorship: Providing constructive feedback to authors and supporting the development of legal scholarship.",
                "Thought Leadership: Contributing their expertise to highlight emerging legal trends, critical analyses, and pioneering research."
            ),
            icons = listOf(
                Icons.Default.Search,
                Icons.Default.Book,
                Icons.Default.People,
                Icons.Default.Lightbulb
            )
        )

        // Section 2 - Meet Our Editorial Board Members
        IconTextRow(
            text = "Meet Our Editorial Board Members",
            icon = Icons.Default.People,
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            padding = 8.dp
        )

        ClickableText(
            text = AnnotatedString("https://legalonus.com/editorial-board/?swcfpc=1"),
            style = MaterialTheme.typography.bodyMedium.copy(color = Color.Blue),
            onClick = { /* handle link click */ },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Section 3 - Join Our Editorial Board
        IconTextRow(
            text = "Join Our Editorial Board",
            icon = Icons.Default.Star,
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            padding = 8.dp
        )

        Text(
            text = "We are always seeking distinguished legal scholars and professionals who are interested in contributing to our mission. If you are interested in joining our Editorial Board, don't hesitate to get in touch with us at info@legalonus.com.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Section 4 - Acknowledgment
        IconTextRow(
            text = "Acknowledgment",
            icon = Icons.Default.ThumbUp,
            style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
            padding = 8.dp
        )

        Text(
            text = "We are grateful to our Editorial Board members for their invaluable contributions to maintaining the excellence and academic integrity of the LegalOnus Law Journal.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}

//@Composable
//fun IconTextRow(
//    text: String,
//    icon: ImageVector,
//    style: TextStyle = MaterialTheme.typography.body1,
//    padding: Dp = 8.dp
//) {
//    Row(modifier = Modifier.padding(vertical = padding)) {
//        Icon(imageVector = icon, contentDescription = null, tint = Color.Gray)
//        Spacer(modifier = Modifier.width(8.dp))
//        Text(text = text, style = style)
//    }
//}

@Composable
fun BulletPointList(items: List<String>, icons: List<ImageVector>) {
    Column(modifier = Modifier.padding(start = 16.dp)) {
        items.forEachIndexed { index, item ->
            Row(modifier = Modifier.padding(bottom = 8.dp)) {
                Icon(
                    imageVector = icons[index],
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = item, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}
