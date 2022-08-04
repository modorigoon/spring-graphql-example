package me.modorigoon.springgraphqlexample.application.graphql

import me.modorigoon.springgraphqlexample.application.response.NewsfeedResponse
import me.modorigoon.springgraphqlexample.domain.service.NewsfeedService
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Flux


@Controller
class NewsfeedGraphQLController(val newsfeedService: NewsfeedService) {

    @SchemaMapping(typeName = "Query", field = "newsfeeds")
    fun newsfeeds(): Flux<NewsfeedResponse> {
        return newsfeedService.getNewsfeeds().map { NewsfeedResponse(it.id, it.author, it.content) }
    }
}
