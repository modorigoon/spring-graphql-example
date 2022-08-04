package me.modorigoon.springgraphqlexample.domain.service

import me.modorigoon.springgraphqlexample.domain.Newsfeed
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


interface NewsfeedService {

    fun saveNewsfeed(newsfeed: Newsfeed): Mono<Newsfeed>

    fun getNewsfeedById(id: String): Mono<Newsfeed?>

    fun getNewsfeeds(): Flux<Newsfeed>
}
