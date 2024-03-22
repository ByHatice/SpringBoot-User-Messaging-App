package se.iths.springbootusermessagingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.iths.springbootusermessagingapp.user.User;
import se.iths.springbootusermessagingapp.user.UserRepository;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    public class WebController {
        private final UserRepository userRepository;

        public WebController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @GetMapping("/api")
        public List<User> users(){
            var user = new User();
            user.setUserName("Kalle");
            userRepository.save(user);
            return userRepository.findAll();
        }
    }
}
