package com.example.testjson.model

data class MyModelListItem(
    val _links: Links,
    val author: Int,
    val categories: List<Int>,
    val class_list: List<String>,
    val comment_status: String,
    val content: Content,
    val date: String,
    val date_gmt: String,
    val excerpt: Excerpt,
    val featured_media: Int,
    val format: String,
    val guid: Guid,
    val id: Int,
    val link: String,
    val meta: Meta,
    val modified: String,
    val modified_gmt: String,
    val ping_status: String,
    val slug: String,
    val status: String,
    val sticky: Boolean,
    val tags: List<Int>,
    val template: String,
    val title: Title,
    val type: String,
    val yoast_head: String,
    val yoast_head_json: YoastHeadJson
)
