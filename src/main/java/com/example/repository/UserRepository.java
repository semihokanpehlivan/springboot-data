package com.example.repository;

import com.example.models.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Semih Okan Pehlivan.
 */
@Repository("user-repo")
@Transactional
public class UserRepository {

    @Autowired
    SessionFactory sessionFactory;

    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }


}
