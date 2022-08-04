package me.modorigoon.springgraphqlexample.infra.h2

import org.springframework.data.r2dbc.repository.R2dbcRepository


interface NewsfeedR2dbcRepository: R2dbcRepository<NewsfeedEntity, String>
