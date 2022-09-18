package FirstProject.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

// this tells springboot this is the starting point
@SpringBootApplication
public class ApiApp implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        // this is setting this class as your starting point
        SpringApplication.run(ApiApp.class, args);

    }

    /*
        Can use this to execute SQL statements
     */
    @Override
    public void run(String... args) throws Exception {

        String sql = "INSERT INTO students (name) Values (?)";

        int result = jdbcTemplate.update(sql, "Alex Ocegueda");

        if (result > 0) {
            System.out.println("A new row has been inserted");
        }

    }
}
