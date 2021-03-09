package com.sensoric.enose

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EnoseApplication

fun main(args: Array<String>) {
    runApplication<EnoseApplication>(*args)
}
