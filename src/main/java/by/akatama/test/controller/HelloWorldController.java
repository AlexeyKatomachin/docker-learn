package by.akatama.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    String hello() {
        System.out.println("was call");
        return "Hello World, Spring Boot!";
    }
}
