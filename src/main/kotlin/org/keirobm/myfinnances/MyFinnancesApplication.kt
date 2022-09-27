package org.keirobm.myfinnances

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFinnancesApplication

fun main(args: Array<String>) {
    runApplication<MyFinnancesApplication>(*args)
}
