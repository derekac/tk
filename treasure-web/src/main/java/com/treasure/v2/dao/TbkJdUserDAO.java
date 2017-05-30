package com.treasure.v2.dao;

import com.treasure.v2.model.TbkJdUser;

public interface TbkJdUserDAO {
    int deleteByPrimaryKey(Long uid);

    void insert(TbkJdUser record);

    void insertSelective(TbkJdUser record);

    TbkJdUser selectByPrimaryKey(Long uid);

    int updateByPrimaryKeySelective(TbkJdUser record);

    int updateByPrimaryKey(TbkJdUser record);
}