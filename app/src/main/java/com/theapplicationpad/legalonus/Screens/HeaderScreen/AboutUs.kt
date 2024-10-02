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
fun AboutUs(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        item {
            // Title with emoji
            Text(
                text = "⚖️ Welcome to LEGALONUS",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Introductory paragraph
            Text(
                text = "Where legal expertise meets unwavering commitment to justice. Our mission is to provide exceptional legal services that empower individuals and businesses to navigate the complexities of the legal system with confidence.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Our Story with emoji
            Text(
                text = "📖 Our Story",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "Founded in 2021, Legalonus emerged from a passion for upholding the principles of justice and ensuring that everyone has access to fair representation. Our journey began when our founder, Ayush, a seasoned legal professional with a view to uplift the legal knowledge in society, envisioned a platform that would serve as a beacon of integrity and advocacy.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Our Approach with emoji
            Text(
                text = "🎯 Our Approach",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "At Legalonus, we believe that every legal matter is unique, deserving of personalized attention and tailored strategies. Our team is committed to understanding your individual needs and objectives. Through meticulous research, diligent preparation, and fearless advocacy, we strive to achieve the best possible outcomes for our readers.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Our Expertise with emoji
            Text(
                text = "🔍 Our Expertise",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "With a diverse range of practice areas, Legalonus offers comprehensive legal solutions that address your specific concerns regarding any legal topics, terminology, or concepts. Whether you're facing conceptual problems or legal research matters, our experienced authors bring deep insights and a wealth of knowledge to every problem.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Our Commitment with emoji
            Text(
                text = "🤝 Our Commitment",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "We understand that legal challenges can be overwhelming, which is why we are dedicated to providing clear guidance, open communication, and compassionate support throughout your journey. We see our role not only as legal representatives but also as allies, helping you make informed decisions that shape your future.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Contact Us section with emoji
            Text(
                text = "📧 Get in Touch",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1E88E5)
                ),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "Whether you’re seeking legal advice, representation, or simply have questions, we’re here to help. Reach out to Legalonus today at info@legalonus.com.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // Centering the contact email for better visibility
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "🌐 Contact: info@legalonus.com",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color(0xFF1E88E5)
                    ),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}
