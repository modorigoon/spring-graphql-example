package me.modorigoon.springgraphqlexample.infra.h2

import me.modorigoon.springgraphqlexample.domain.Newsfeed
import me.modorigoon.springgraphqlexample.domain.repository.NewsfeedRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.LocalDateTime


@Primary
@Repository
class H2NewsfeedRepository(val newsfeedR2dbcRepository: NewsfeedR2dbcRepository): NewsfeedRepository {

    override fun findById(id: String): Mono<Newsfeed?> {
        return newsfeedR2dbcRepository.findById(id).map { it.toNewsfeed() }
    }

    override fun findAll(): Flux<Newsfeed> {
        return newsfeedR2dbcRepository.findAll().map { it.toNewsfeed() }
    }

    override fun save(newsfeed: Newsfeed): Mono<Newsfeed> {
        return newsfeedR2dbcRepository.save(
            NewsfeedEntity(newsfeed.id, newsfeed.author, newsfeed.content, LocalDateTime.now())
        ).map { it.toNewsfeed() }
    }
}
