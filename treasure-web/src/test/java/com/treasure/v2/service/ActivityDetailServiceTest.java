package com.treasure.v2.service;

import com.alibaba.fastjson.JSON;
import com.treasure.v2.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by derek on 16/4/23.
 */
public class ActivityDetailServiceTest extends BaseTest {

    @Autowired
    private ActivityDetailService activityDetailService;

    @Test
    public void testGetActivityDetail() throws Exception {
        System.out.println(JSON.toJSONString(activityDetailService.getActivityDetail(1, Integer.MAX_VALUE, 10)));
    }


    @Test
    public void testGetActivityDetailByUid() throws Exception {
        System.out.println(JSON.toJSONString(activityDetailService.getActivityDetailByUid(1, 1)));
    }

}