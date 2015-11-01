package com.example.repository;

import com.example.AbstractTest;
import com.example.models.User;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Semih Okan Pehlivan.
 */
@Transactional
public class UserRepositoryTest extends AbstractTest{

    @Autowired
    UserRepository userRepository;

    @Autowired
    DataSource dataSource;

    @Test
    public void addUserTest() {
        User user = new User("User");
        userRepository.addUser(user);

        Assert.assertNotNull(dataSource);
    }

}
