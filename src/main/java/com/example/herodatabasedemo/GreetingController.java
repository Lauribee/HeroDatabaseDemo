package com.example.herodatabasedemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    public GreetingRepository greetingRepository;
    public GreetingController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/")
    public ResponseEntity<Greeting> getGreeting() {
        Greeting greeting = new Greeting("Hej fra Intellij");
        greetingRepository.save(greeting);
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
