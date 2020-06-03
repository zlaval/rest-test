package com.zlrx.container.resttest

import spark.kotlin.ignite


fun main() {
    val http = ignite()
    println("Server is up. Port 4567")
    http.get("/") {
        "OK"
    }

}