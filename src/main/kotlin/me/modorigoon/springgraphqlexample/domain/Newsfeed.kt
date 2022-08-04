package me.modorigoon.springgraphqlexample.domain

import java.time.LocalDateTime


data class Newsfeed(val id: String, val author: String, val content: String, val createdAt: LocalDateTime?) {
    constructor(id: String, author: String, content: String): this(id, author, content, null)
}
