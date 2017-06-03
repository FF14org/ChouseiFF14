package com.ff14.chousei

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class ChouseiApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ChouseiApplication::class.java, *args)
        }
    }
}
