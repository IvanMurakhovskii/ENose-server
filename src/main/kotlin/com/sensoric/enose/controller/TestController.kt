package com.sensoric.enose.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/")
    fun getTest(): String {
        return "test"
    }

}

