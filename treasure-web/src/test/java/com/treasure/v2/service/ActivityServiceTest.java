package com.treasure.v2.service;

import com.treasure.v2.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by derek on 16/4/17.
 */
public class ActivityServiceTest extends BaseTest {


    @Autowired
    private ActivityService activityService;

    @Test
    public void testGetActivityInfoById() throws Exception {
        activityService.getActivityInfoById(1);
    }
}