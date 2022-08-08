package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSecurity()
        configureHTTP()
        configureMonitoring()
        configureTemplating()
        configureAdministration()
        configureSockets()
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}