package me.modorigoon.springgraphqlexample.domain.service

import me.modorigoon.springgraphqlexample.domain.Newsfeed
import me.modorigoon.springgraphqlexample.domain.repository.NewsfeedRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Service
class NewsfeedServiceImpl(val newsfeedRepository: NewsfeedRepository): NewsfeedService {

    override fun saveNewsfeed(newsfeed: Newsfeed): Mono<Newsfeed> {
        return newsfeedRepository.save(newsfeed)
    }

    override fun getNewsfeedById(id: String): Mono<Newsfeed?> {
        return newsfeedRepository.findById(id)
    }

    override fun getNewsfeeds(): Flux<Newsfeed> {
        return newsfeedRepository.findAll()
    }
}
