package com.treasure.v2.dao;

import com.treasure.v2.model.TbkWeixinUser;

public interface TbkWeixinUserDAO {
    int deleteByPrimaryKey(String nickName);

    void insert(TbkWeixinUser record);

    void insertSelective(TbkWeixinUser record);

    TbkWeixinUser selectByPrimaryKey(String nickName);

    int updateByPrimaryKeySelective(TbkWeixinUser record);

    int updateByPrimaryKey(TbkWeixinUser record);
}