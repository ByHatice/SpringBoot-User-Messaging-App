package se.iths.springbootusermessagingapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/api")
    public String friends(){
        return "Hello World!";
    }
}
