package org.keirobm.myfinnances.application

import javafx.application.Application
import javafx.application.Platform
import javafx.stage.Stage
import org.keirobm.myfinnances.MyFinnancesApplication
import org.springframework.beans.factory.config.AutowireCapableBeanFactory
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ConfigurableApplicationContext

class MyFinnancesFxApplication : Application() {
    private lateinit var applicationContext: ConfigurableApplicationContext

    override fun init() {
        applicationContext = SpringApplicationBuilder(MyFinnancesApplication::class.java)
            .run(*parameters.raw.toTypedArray())

        // Add this class as a Bean to be injectable
        applicationContext.autowireCapableBeanFactory.autowireBeanProperties(
            this, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, true
        )
    }

    override fun start(stage: Stage) {

    }

    override fun stop() {
        applicationContext.close()
        Platform.exit()
    }

}