package com.treasure.v2.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.treasure.v2.dao.TbkJdUserDAO;
import com.treasure.v2.model.TbkJdUser;
import com.treasure.v2.service.JdUserService;
import freemarker.template.utility.DateUtil;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by crow on 2017/5/30.
 */
@Service
public class JdUserServiceImpl implements JdUserService{
  @Autowired
  private TbkJdUserDAO jdUserDAO;

  @Override
  public TbkJdUser processJdUser(String jdUser) {
    TbkJdUser user = new TbkJdUser();
    JSONObject json = JSON.parseObject(jdUser);
    user.setTokenType(json.getString("token_type"));
    user.setUserNick(json.getString("user_nick"));
    user.setUid(Long.valueOf(json.getString("uid")));
    user.setAccessToken(json.getString("access_token"));
    user.setTime(json.getDate("time"));
    user.setExpiressIn(DateTime.now().plusSeconds(json.getInteger("expires_in")).toDate());

    if(jdUserDAO.selectByPrimaryKey(user.getUid()) == null) {
      jdUserDAO.insertSelective(user);
    } else {
      jdUserDAO.updateByPrimaryKeySelective(user);
    }

    return user;
  }
}
