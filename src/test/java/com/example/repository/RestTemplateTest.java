package com.example.repository;

import com.example.AbstractTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpHeaders;

/**
 * @author Semih Okan Pehlivan.
 */
public class RestTemplateTest extends AbstractTest{

    public TestRestTemplate testRestTemplate = new TestRestTemplate();

    @Test
    public void testRequest() {
        HttpHeaders headers = testRestTemplate.getForEntity("https://www.google.com.tr", String.class).getHeaders();
        Assert.assertNotNull(headers);
    }

}
