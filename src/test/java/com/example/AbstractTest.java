package com.example;

import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Semih Okan Pehlivan.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HibernateMainApplication.class)
public class AbstractTest {

    protected Logger logger = LoggerFactory.getLogger(AbstractTest.class.getName());

}
