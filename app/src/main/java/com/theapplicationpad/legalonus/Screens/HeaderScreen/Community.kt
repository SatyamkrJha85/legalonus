package com.theapplicationpad.legalonus.Screens.HeaderScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Community(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            // Header with emoji
            Text(
                text = "📚 Welcome to the Authors Page!",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Introduction paragraph
            Text(
                text = "Our authors are the brilliant minds behind the insightful legal content that enriches our platform. Each article, analysis, and commentary they contribute reflects their profound expertise and dedication to the legal field.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Authors description with emoji
            Text(
                text = "🧑‍⚖️ Diverse Panel of Experts",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "Our diverse panel of authors consists of accomplished legal professionals, scholars, practitioners, and thought leaders. They bring their unique perspectives, years of experience, and in-depth knowledge to create content that informs, educates, and empowers our community.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Content creation focus
            Text(
                text = "🔍 Insightful Legal Content",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "From discussions on groundbreaking case law to interpretations of complex regulations, our authors delve into the heart of legal matters, offering you valuable insights that go beyond the surface.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Text(
                text = "With a commitment to accuracy and relevance, they ensure that you receive the most up-to-date and accurate legal information available.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Call to explore authors profiles with link
            Text(
                text = "📝 Explore Our Authors",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "Explore the profiles of our distinguished authors below, and discover the individuals who are shaping the discourse around legal issues. Feel free to connect with them, follow their contributions, and engage in meaningful discussions that contribute to your legal learning journey.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Appreciation message
            Text(
                text = "💼 Thank You",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "We extend our heartfelt appreciation to our authors for their invaluable contributions and to you, our readers, for making Legalonus a trusted source of legal knowledge. Thank you for being part of our vibrant legal community.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Signature section with link
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Ayush Chandra - Founder",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(bottom = 12.dp)
                )
                Text(
                    text = "🌐 https://legalonus.com/legalonus-authors-community/?swcfpc=1",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color(0xFF1E88E5)
                    )
                )
            }

        }
    }
}
