package com.example

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.serde.annotation.Serdeable
import jakarta.validation.constraints.Size

@Serdeable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class CreateUserRequest(
    @JsonProperty("first_name")
    @field:Size(message = "first_name must be at least 5 characters", min = 5)
    val firstName: String,

    @JsonProperty("last_name")
    @field:Size(message = "last_name must be at least 5 characters", min = 5)
    val lastName: String,

    val email: String? = null,
    val phone: String? = null
)
