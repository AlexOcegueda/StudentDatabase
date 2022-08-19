package firstproject.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this tells springboot this is the starting point
@SpringBootApplication
public class ApiApp {

    public static void main(String[] args) {
        // this is setting this class as your starting point
        SpringApplication.run(ApiApp.class, args);


    }
}
