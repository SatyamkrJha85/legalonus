package com.theapplicationpad.legalonus.DataClasses

import com.theapplicationpad.legalonus.R

data class Header(
    val name:String,
    val icon:Int,
    val link:String
)


val HeaderItems = listOf(
    Header(name = "Home Page", icon = R.drawable.house, link = "https://legalonus.com/?swcfpc=1"),
    Header(name = "Legal Coverage", icon = R.drawable.lawscale, link = "https://legalonus.com/category/legal-coverage/?swcfpc=1"),
    Header(name = "Submit Article", icon = R.drawable.articles, link = "https://legalonus.com/submit-your-article/?swcfpc=1"),
    Header(name = "Editorial Board", icon = R.drawable.drawingboard, link = "https://legalonus.com/editorial-board/?swcfpc=1"),
    Header(name = "Founder’s View", icon = R.drawable.founder, link = "https://legalonus.com/founders-view/?swcfpc=1"),
    Header(name = "Community", icon = R.drawable.community, link = "https://legalonus.com/legalonus-authors-community/?swcfpc=1"),
    Header(name = "About Us", icon = R.drawable.aboutus, link = "https://legalonus.com/about-us-2/?swcfpc=1"),

    )


data class CategorySection(
    val name:String,
    val img:Int,
    val link:String
)

val CategoryItems = listOf(
    CategorySection(name = "Criminal Law", img = R.drawable.cat1, link = "https://legalonus.com/category/criminal-law/?swcfpc=1"),
    CategorySection(name = "Constitutional Law", img = R.drawable.cat2, link = "https://legalonus.com/category/constitutional-law/?swcfpc=1"),
    CategorySection(name = "Environmental Law", img = R.drawable.cat3, link = "https://legalonus.com/category/environmental-law/?swcfpc=1"),
    CategorySection(name = "Consumer Protection", img = R.drawable.cat1, link = "https://legalonus.com/category/consumer-protection/?swcfpc=1"),
    CategorySection(name = "Family Law", img = R.drawable.cat1, link = "https://legalonus.com/category/family-law/?swcfpc=1"),
    CategorySection(name = "Business Law", img = R.drawable.cat1, link = "https://legalonus.com/category/business-law/?swcfpc=1"),
    CategorySection(name = "Intellectual Property", img = R.drawable.cat1, link = "https://legalonus.com/category/intellectual-property/?swcfpc=1"),
    CategorySection(name = "Current Affairs", img = R.drawable.cat1, link = "https://legalonus.com/category/current-affairs/?swcfpc=1"),
    CategorySection(name = "Legal Facts", img = R.drawable.cat1, link = "https://legalonus.com/category/legal-facts/?swcfpc=1"),
    CategorySection(name = "Legal News", img = R.drawable.cat1, link = "https://legalonus.com/category/legal-news/?swcfpc=1"),
    CategorySection(name = "Current Legal Issues", img = R.drawable.cat1, link = "https://legalonus.com/category/current-legal-issues/?swcfpc=1")
)