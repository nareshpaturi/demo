package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import jakarta.validation.Valid

@Controller("/demo")
class DemoController {

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }

    @Post(uri="/users", consumes=["application/json"], produces=["application/json"])
    fun create(@Body @Valid createUserRequest: CreateUserRequest): HttpStatus {
        println("User created: ${createUserRequest.firstName} ${createUserRequest.lastName}")
        return HttpStatus.CREATED
    }
}