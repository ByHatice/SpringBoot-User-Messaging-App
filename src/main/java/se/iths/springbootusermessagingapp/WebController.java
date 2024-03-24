package se.iths.springbootusermessagingapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/api")
    public String friends(){
        //var friend = friendRepository.findAll();
        return "Hello World!";
    }
}
