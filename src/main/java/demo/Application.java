package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by raiko_000 on 22.03.2017.
 */


// $ mvn -N io.takari:maven:wrapper
// ./mvnw spring-boot:run
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
