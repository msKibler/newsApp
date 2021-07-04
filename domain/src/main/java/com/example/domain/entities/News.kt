package com.example.domain.entities


data class News(val author : String?, val title : String?, val description: String?,
                val url : String, val urlToImage : String?,
                val publishedAt : String?, val stringFilter : String?) {
}