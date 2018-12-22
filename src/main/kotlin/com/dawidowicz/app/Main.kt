package com.dawidowicz.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
open class Main

fun main(args: Array<String>) {
    SpringApplication.run(Main::class.java)
}

@RestController
open class HelloWorldRestController {

    @GetMapping("/**", "/", "**", "*", "/*")
    fun helloWorld(): String {
        return "Hello World!"
    }
}
