package com.treasure.v2.service;

import com.alibaba.fastjson.JSON;
import com.treasure.v2.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by derek on 16/4/12.
 */
public class HomeServiceTest extends BaseTest {

    @Autowired
    private HomeService homeService;

    @Test
    public void testGetRegisterNumber() throws Exception {
        System.out.println(homeService.getRegisterNumber());
    }

    @Test
    public void testGetBannerItem() throws Exception {
        System.out.println(JSON.toJSONString(homeService.getBannerActivity()));
    }

    @Test
    public void testGetItemByPaging() throws Exception {
        System.out.println(JSON.toJSONString(homeService.getItemByPaging(1,1)));
    }

    @Test
    public void testGetClosestActivityVo() throws Exception {
        System.out.println(JSON.toJSONString(homeService.getClosestActivityVo(2)));
    }

    @Test
    public void testGetActivityVoByPaging() throws Exception {
        System.out.println(JSON.toJSONString(homeService.getActivityVoByPaging(1,3)));
    }

    @Test
    public void testGetHomeData() throws Exception {

    }
}