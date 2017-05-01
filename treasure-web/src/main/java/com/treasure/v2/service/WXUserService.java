package com.treasure.v2.service;

import com.treasure.v2.dao.TbkWeixinUserDAO;
import com.treasure.v2.model.TbkWeixinUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 微信用户
 * Created by crow on 2017/5/1.
 */

@Service
public class WXUserService {
    private Logger logger = LoggerFactory.getLogger(WXUserService.class);

    @Autowired
    private TbkWeixinUserDAO tbkWeixinUserDAO;

    /**
     * 录入微信用户资料
     * @param user
     * @return
     */
    public boolean recordWXUser(TbkWeixinUser user) {
        Date _now = new Date();

        if (user.getNickName() == null) {
            return false;
        }

        if (tbkWeixinUserDAO.selectByPrimaryKey(user.getNickName()) == null) {
            user.setUpdateTime(_now);
            user.setCreateTime(_now);
            try {
                tbkWeixinUserDAO.insertSelective(user);
                return true;
            } catch (Exception e) {
                logger.info("[微信 {} 录入失败]", user.getNickName());
                return false;
            }
        }

        return false;
    }
}
