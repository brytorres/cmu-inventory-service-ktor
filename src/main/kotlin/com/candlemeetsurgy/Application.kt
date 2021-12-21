package com.candlemeetsurgy

//import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.candlemeetsurgy.plugins.*
import io.ktor.application.*
import routes.registerSupplierRoutes

//import io.ktor.features.*
//import io.ktor.serialization.*

//fun main() {
//    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
//        configureRouting()
//        configureSerialization()
//        configureHTTP()
//    }.start(wait = true)
//}

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
    configureHTTP()
    registerSupplierRoutes()
}