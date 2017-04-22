package com.treasure.v2;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by derek on 16/4/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:/spring/spring-profile.xml"})
@ActiveProfiles(profiles = "development")
public class BaseTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private TestDAO testDAO;

}
