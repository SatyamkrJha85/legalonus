package com.theapplicationpad.legalonus.Retrofit.Model

data class Links(
    val about: List<About>,
    val author: List<Author>,
    val collection: List<Collection>,
    val curies: List<Cury>,
    val replies: List<Reply>,
    val self: List<Self>,
    val version-history: List<VersionHistory>,
    val wp:attachment: List<WpAttachment>,
    val wp:featuredmedia: List<WpFeaturedmedia>,
    val wp:term: List<WpTerm>
)