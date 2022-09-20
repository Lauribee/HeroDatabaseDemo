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

    }

}
