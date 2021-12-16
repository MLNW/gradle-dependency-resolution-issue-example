package example.service_a

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

fun main(args: Array<String>) {
    runApplication<SpringBootStarter>(*args)
}

@SpringBootApplication
class SpringBootStarter
