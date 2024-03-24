package ru.zaroslikov.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ru.zaroslikov.data.model.Rabbit

private const val BASE_URL = "http://192.168.31.136:8080"

private val rabbits = listOf(
    Rabbit("sex", "sexForever", "$BASE_URL/rabbits/1d5xWOWoKhU.jpg"),
    Rabbit("sex", "sexForever", "$BASE_URL/rabbits/2.jpg"),
    Rabbit("sex", "sexForever", "$BASE_URL/rabbits/2b10in0EjY0.jpg"),
    Rabbit("sex", "sexForever", "$BASE_URL/rabbits/2b_by_kyungnam234_dbzz0ve-fullview.jpg"),
    Rabbit("sex", "sexForever", "$BASE_URL/rabbits/2mLEehfQFaM.jpg")
)


fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(HttpStatusCode.OK, rabbits.random())
    }
}