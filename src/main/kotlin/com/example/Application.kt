package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args:Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)
@Suppress("unused")
fun Application.module() {
    routing {
        get ("/"){
            call.respondText("Hello,World!")
        }
    }
}
/*
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
*/