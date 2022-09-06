package com.example.herodatabasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class HeroDatabaseDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroDatabaseDemoApplication.class, args);
        String url = "jdbc:mysql://20.223.219.8:3306/mysql";
        String username = "root";
        String password = "mypassword";

        System.out.println("Super Power Cow");

        try (
                Connection con = DriverManager.getConnection(url, username, password)){
            System.out.println("Cow Wins");
        } catch (SQLException e) {
            throw new IllegalStateException("Cow loose", e);
        }
    }

}
