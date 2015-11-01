package com.example.repository;

import com.example.AbstractTest;
import com.example.models.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Semih Okan Pehlivan.
 */
public class HibernateCrudTest extends AbstractTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void getUser() {
        User user = userRepository.getUserById(6);
        Assert.assertThat("deneme", CoreMatchers.containsString(user.getName()));
    }

}
