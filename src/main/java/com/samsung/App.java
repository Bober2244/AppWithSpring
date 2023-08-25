package com.samsung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.h2.tools.Console;
import java.sql.SQLException;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        try {
            Console.main(args);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}