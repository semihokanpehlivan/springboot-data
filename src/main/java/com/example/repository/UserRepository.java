package com.example.repository;

import com.example.models.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Semih Okan Pehlivan.
 */
@Repository("user-repo")
@Transactional
public class UserRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    HibernateTemplate hibernateTemplate;

    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public List<User> findUserByName(String name) {
        List list = hibernateTemplate.find("from User u where u.name=?", name);
        return list;
    }

    public User getUserById(long id) {
        User user = hibernateTemplate.get(User.class,id);
        return user;
    }

}
