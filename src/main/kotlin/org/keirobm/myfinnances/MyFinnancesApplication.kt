package org.keirobm.myfinnances

import javafx.application.Application
import org.keirobm.myfinnances.application.MyFinnancesFxApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFinnancesApplication

fun main(args: Array<String>) {
//    runApplication<MyFinnancesApplication>(*args)
    Application.launch(MyFinnancesFxApplication::class.java, *args)
}
