package me.modorigoon.springgraphqlexample.domain.repository

import me.modorigoon.springgraphqlexample.domain.Newsfeed
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Repository
interface NewsfeedRepository {

    fun findById(id: String): Mono<Newsfeed?>

    fun findAll(): Flux<Newsfeed>

    fun save(newsfeed: Newsfeed): Mono<Newsfeed>
}
