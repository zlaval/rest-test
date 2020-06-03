package com.zlrx.container.resttest

import com.google.gson.Gson
import spark.ResponseTransformer
import spark.kotlin.ignite


fun main() {

    val http = ignite()
    println("Server is up. Port 4567")
    http.get("/") {
        "OK"
    }

    http.post("/", "application/json") {
        response.header("Content-Type", "application/json")
        request.body()
    }

}

class JsonTransformer : ResponseTransformer {
    private val gson = Gson()
    override fun render(model: Any?): String {
        return gson.toJson(model)
    }
}