package me.modorigoon.springgraphqlexample.infra.h2

import me.modorigoon.springgraphqlexample.domain.Newsfeed
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime


@Table("newsfeed")
data class NewsfeedEntity(@Id val id: String, val author: String, val content: String, val createdAt: LocalDateTime) {

    fun toNewsfeed(): Newsfeed {
        return Newsfeed(id, author, content, createdAt)
    }
}
