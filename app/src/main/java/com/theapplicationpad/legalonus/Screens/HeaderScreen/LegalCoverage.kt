package com.theapplicationpad.legalonus.Screens.HeaderScreen

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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.theapplicationpad.legalonus.Navigations.Routes


@Composable
fun LegalCoverage(modifier: Modifier = Modifier, navController: NavController) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(15.dp)
           ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = "Welcome to LegalOnus!",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "\uD83C\uDF10 Your Gateway to Legal Discourse",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = "At LegalOnus, we are committed to fostering a vibrant community where legal professionals, scholars, and enthusiasts converge to share insights and knowledge. We offer two distinct platforms for publication to accommodate a variety of voices and perspectives:\n\n" +
                        "1. LegalOnus Website: This platform invites you to contribute blogs and articles on a wide range of legal topics, from current trends to practical guides. Engage with peers, share your expertise, and spark meaningful discussions within our community.\n\n" +
                        "2. LegalOnus Law Journal (LLJ): For those looking to delve deeper into legal scholarship, LLJ serves as a prestigious outlet for original research and thought-provoking articles. This peer-reviewed journal aims to publish rigorous analyses and innovative perspectives on contemporary legal issues.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = "\uD83D\uDD8B Why Join Our Community?",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "1. Connect with Experts: Network with fellow legal minds, exchange ideas, and collaborate on impactful projects.\n" +
                        "2. Stay Informed: Access a wealth of resources that cover diverse legal topics, from emerging trends to critical case analyses.\n" +
                        "3. Enhance Your Knowledge: Contribute to and benefit from discussions that deepen your understanding of complex legal issues.\n" +
                        "4. Influence the Future of Law: Your insights can drive conversations around important legal challenges and innovations.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = "\uD83D\uDCAC Engage and Contribute",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "We encourage all legal practitioners, scholars, and students to engage with our content and contribute their perspectives. Your voice matters, and together we can create a rich tapestry of legal discourse that informs, inspires, and educates.\n\n" +
                        "\uD83C\uDF1F Join Us Today!\n" +
                        "Explore our blog and articles to discover the wealth of knowledge within the LegalOnus community. Let’s collaborate to advance legal understanding and make a meaningful impact together!",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Buttons Section
            Button(
                onClick = {
                    navController.navigate(Routes.LegalOnusWebsite.route)
                },
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 4.dp,
                    pressedElevation = 8.dp
                ),
                shape = MaterialTheme.shapes.medium
            ) {
                Text(text = "For LegalOnus Website", fontSize = 16.sp)
            }

            Button(
                onClick = {
                    navController.navigate(Routes.ForLegalOnusLawJournal.route)
                },
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 4.dp,
                    pressedElevation = 8.dp
                ),
                shape = MaterialTheme.shapes.medium
            ) {
                Text(text = "For LegalOnus Law Journal (LLJ)", fontSize = 16.sp)
            }


        }
    }
}


@Composable
fun LegalOnusWebsite(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(MaterialTheme.colorScheme.background)
    ) {
        item {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Title
            Text(
                text = "\uD83D\uDCE2 Call for Blogs: Share Your Legal Insights and Expertise!",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Description
            Text(
                text = "Are you passionate about the world of law and legal matters? Do you have a keen interest in exploring the intricacies of legal issues, sharing valuable insights, and contributing to the legal discourse? Look no further! We invite you to be a part of our esteemed legal community by contributing to the LegalOnus blog platform.",
                fontSize = 16.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Quote from the founder
            Text(
                text = "\uD83D\uDCE3 “Seize the opportunity to share your legal wisdom! Submit your blog post today and become a key contributor to the LegalOnus legal blogging community.”\n— Ayush Chandra (Founder)",
                fontSize = 16.sp,
                fontStyle = MaterialTheme.typography.bodySmall.fontStyle,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 16.dp),
                color = MaterialTheme.colorScheme.secondary
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Why Contribute Heading
            Text(
                text = "\uD83D\uDD8B\uFE0F Why Contribute to LegalOnus?",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // List of benefits
            Text(
                text = "•\t\uD83C\uDF1F Expert Visibility: Showcase your expertise and establish yourself as a thought leader in your area of legal specialization.\n" +
                        "•\t\uD83E\uDD1D Engage with Peers: Engage in meaningful discussions with fellow legal professionals and enthusiasts, fostering connections within the legal community.\n" +
                        "•\t\uD83D\uDCDA Educate and Inform: Contribute to the knowledge base of legal practitioners, students, and the general public by providing valuable, well-researched insights.\n" +
                        "•\t\uD83D\uDCA1 Spark Conversations: Your blog posts can spark meaningful conversations around legal trends, challenges, and solutions.",
                fontSize = 16.sp,
                lineHeight = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Topics Heading
            Text(
                text = "\uD83D\uDD8A\uFE0F Topics We’re Interested In",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // List of topics
            Text(
                text = "•\t✨ Recent Legal Developments: Analyze and discuss recent landmark judgments, legislative changes, and legal precedents.\n" +
                        "•\t⚖️ Legal How-Tos: Offer practical guides and step-by-step instructions on navigating legal processes and procedures.\n" +
                        "•\t\uD83D\uDDFA\uFE0F Legal Commentary: Share your perspective on contemporary legal issues, policy debates, and ethical dilemmas.\n" +
                        "•\t\uD83D\uDCDD Case Studies: Analyze real-world legal cases, showcasing the intricacies and outcomes of complex legal scenarios.\n" +
                        "•\t\uD83D\uDCCA Legal Research and Analysis: Present in-depth research, analysis, and interpretations of legal concepts and theories.",
                fontSize = 16.sp,
                lineHeight = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Submission Guidelines
            Text(
                text = "\uD83D\uDCA1 Submission Guidelines",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "•\tBlog posts should be original and not published elsewhere.\n" +
                        "•\tWord count: 800 – 1500 words.\n" +
                        "•\tMaintain a professional and authoritative tone.\n" +
                        "•\tCite legal sources and references appropriately.\n" +
                        "•\tInclude a brief author bio along with a high-resolution profile picture.",
                fontSize = 16.sp,
                lineHeight = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // How to Submit
            Text(
                text = "\uD83D\uDCE9 How to Submit",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Ready to contribute your legal expertise to our platform? Simply send your blog post draft and a brief author introduction to publication.house@legalonus.com. Our dedicated LegalOnus team will review your submission and provide feedback within 24 hours.",
                fontSize = 16.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Call to Action
            Text(
                text = "Join us in enriching the legal community with your insights and knowledge. Your contribution could influence legal discussions, provide guidance, and offer fresh perspectives. We can’t wait to read and share your valuable contributions on the LegalOnus blog!",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
        }
    }
}

@Composable
fun ForLegalOnusLawJournal(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        item {

            // Title
            Text(
                text = "LegalOnus Law Journal (LLJ)",
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Subtitle
            Text(
                text = "Prestigious Platform for Scholarly Legal Discourse",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Body Content
            Text(
                text = "We invite legal professionals, scholars, and students to contribute to the ongoing development of legal studies by submitting original research and thought-provoking articles.",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Section 1 - About LegalOnus Law Journal
            IconTextRow(
                text = "About LegalOnus Law Journal",
                icon = Icons.Default.Info,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                padding = 8.dp
            )

            Text(
                text = "Founded in 2021, LegalOnus is committed to advancing legal knowledge and research. The LegalOnus Law Journal, launched in 2024, is a monthly online publication available exclusively in English, aimed at a global audience. We publish peer-reviewed articles that provide cutting-edge insights into contemporary legal issues.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Section 2 - Why Submit to LLJ
            IconTextRow(
                text = "Why Submit to LLJ?",
                icon = Icons.Default.Star,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                padding = 8.dp
            )

            Text(
                text = "By submitting to LLJ, you become part of a growing community dedicated to fostering high-quality legal scholarship. We seek contributions that analyze, critique, and discuss various aspects of law, legal theory, and practice.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Focus Areas List
            BulletPointList(
                items = listOf(
                    "Scholarly Articles: Peer-reviewed, in-depth legal research.",
                    "Research & Reviews: Analytical pieces on recent legal developments.",
                    "Expert Contributions: Thought leadership from industry experts."
                )
            )

            // Section 3 - Submission Guidelines
            IconTextRow(
                text = "Submission Guidelines",
                icon = Icons.Default.Edit,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                padding = 8.dp
            )

            Text(
                text = "LLJ accepts submissions from legal professionals, academics, and students. We encourage articles that reflect originality, rigour, and a fresh perspective on important legal issues. Your submission will be subject to a peer-review process to ensure high-quality scholarship.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Section 4 - How to Submit
            IconTextRow(
                text = "How to Submit",
                icon = Icons.Default.Email,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                padding = 8.dp
            )

            Text(
                text = "To submit your article for consideration, please email your manuscript to journal@legalonus.com. Ensure that your submission follows our formatting guidelines, which can be found on our website.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Section 5 - Join the Conversation
            IconTextRow(
                text = "Join the Conversation",
                icon = Icons.Default.People,
                style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
                padding = 8.dp
            )

            Text(
                text = "By submitting to LegalOnus Law Journal, you are contributing to legal scholarship and joining a vibrant community of thinkers and professionals. Engage with our content, provide feedback, and help shape the future of legal discourse.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Call to Action
            Text(
                text = "For more details, visit our website or contact us at journal@legalonus.com",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.Blue),
                modifier = Modifier.padding(top = 16.dp)
            )

        }
    }
}

@Composable
fun IconTextRow(
    text: String,
    icon: ImageVector,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
    padding: Dp = 8.dp
) {
    Row(
        modifier = Modifier.padding(vertical = padding),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(imageVector = icon, contentDescription = null, tint = Color.Gray)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, style = style, fontSize = 18.sp)
    }
}

@Composable
fun BulletPointList(items: List<String>) {
    Column(modifier = Modifier.padding(start = 16.dp)) {
        items.forEach { item ->
            Row {
                Text(
                    text = "\u2022",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = item, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}