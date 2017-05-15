package com.treasure.v2.dao;

import com.treasure.v2.model.TbkUseCouponLog;

public interface TbkUseCouponLogDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(TbkUseCouponLog record);

    void insertSelective(TbkUseCouponLog record);

    TbkUseCouponLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbkUseCouponLog record);

    int updateByPrimaryKey(TbkUseCouponLog record);
}