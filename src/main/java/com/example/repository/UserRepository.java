package com.example.repository;

import com.example.models.User;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.scheduling.annotation.Scheduled;
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

    private static Logger logger = LoggerFactory.getLogger(UserRepository.class.getName());

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

    @Scheduled(cron = "0,30 * * * * *")
    public void cron() {
        logger.info(">>> cron");
        List<User> list = hibernateTemplate.loadAll(User.class);
        logger.info("There are {} user in database",list.size());
        logger.info("<<< cron");
    }

}
