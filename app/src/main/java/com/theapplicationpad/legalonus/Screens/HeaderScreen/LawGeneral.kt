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
fun LawGeneral(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            // Title with emoji
            Text(
                text = "📜 Welcome to the LEGALONUS LAW JOURNAL (LLJ)",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Introduction paragraph
            Text(
                text = "Your premier destination for insightful and scholarly legal discourse. We are delighted to have you join us as we embark on this journey to explore, analyze, and contribute to the evolving landscape of legal studies.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // About Us with emoji
            Text(
                text = "🔍 About Us",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "LegalOnus was established in 2021, and the LegalOnus Law Journal began in 2024. The journal is published monthly and is available exclusively in English. As an online publication, we strive to make cutting-edge legal research accessible to a global audience. The journal is published by LegalOnus Publishing. For more information about our publisher, click here.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Our Mission with emoji
            Text(
                text = "🎯 Our Mission",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "At LLJ, our mission is to provide a platform where legal professionals, scholars, and students can share their research, ideas, and perspectives on a broad array of legal issues. We are committed to fostering a community that values rigorous scholarship, diverse viewpoints, and meaningful dialogue.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // What We Offer with emoji
            Text(
                text = "📚 What We Offer",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "• Scholarly Articles: Our journal features peer-reviewed articles that offer in-depth analysis and innovative perspectives on contemporary legal issues.\n" +
                        "• Research & Reviews: We publish critical reviews of recent legal developments, case studies, and legislative changes.\n" +
                        "• Expert Contributions: LLJ showcases contributions from leading experts in the field, ensuring that our readers have access to cutting-edge legal research and insights.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Join the Conversation with emoji
            Text(
                text = "💬 Join the Conversation",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "LLJ is more than just a journal; it is a community. We encourage you to participate in the dialogue by submitting your work, providing feedback, and engaging with the articles and authors featured in our journal. Together, we can contribute to the growth and development of the legal field.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Stay Connected with emoji
            Text(
                text = "🌐 Stay Connected",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "Stay updated with our latest publications, news, and events by visiting our website regularly.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // Contact Information
            Text(
                text = "✉️ For any inquiries, submissions, or feedback, please contact us at:",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // Email addresses
            Column(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Text(
                    text = "1. journal@legalonus.com",
                    style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp)
                )
                Text(
                    text = "2. info@legalonus.com",
                    style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Closing remarks
            Text(
                text = "Thank you for visiting the LEGALONUS LAW JOURNAL. We look forward to your contributions and to building a vibrant, informed, and engaged legal community.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // The LegalOnus Team
            Text(
                text = "The LegalOnus Team",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(top = 8.dp)
            )

            // Additional Information
            Spacer(modifier = Modifier.height(10.dp))

            // Journal URL
            Text(
                text = "🔗 LEGALONUS LAW JOURNAL (LLJ): https://legalonus.com/legalonus-law-journal/",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 4.dp)
            )

            // Email and Address
            Text(
                text = "✉️ journal@legalonus.com\n" +
                        "✉️ info@legalonus.com\n" +
                        "🏢 Address: 94/57, NAWAIYA GANESH GANJ,\n" +
                        "RAJENDRANAGAR,\n" +
                        "LUCKNOW- 226004",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 4.dp)
            )

            // Sitemap URLs
            Text(
                text = "🔗 Sitemap: https://legalonus.com/sitemap_index.xml",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}
