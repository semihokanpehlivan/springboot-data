package com.example;

import com.example.models.User;
import com.example.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Semih Okan Pehlivan.
 */
@SpringBootApplication
@EnableScheduling
public class HibernateMainApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(HibernateMainApplication.class);
        ConfigurableApplicationContext context = springApplication.run(args);
        UserRepository userRepository = context.getBean("user-repo", UserRepository.class);
        userRepository.addUser(new User("SOP"));

        for (User u : userRepository.findUserByName("Okan")) {
            System.out.println(u.getId());
            System.out.println(u.getName());
        }


    }

}
