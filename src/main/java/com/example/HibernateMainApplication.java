package com.example;

import com.example.models.User;
import com.example.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Semih Okan Pehlivan.
 */
@SpringBootApplication
public class HibernateMainApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(HibernateMainApplication.class);
        ConfigurableApplicationContext context = springApplication.run(args);
        UserRepository userRepository = context.getBean("user-repo", UserRepository.class);
        userRepository.addUser(new User("Okan"));
    }

}
