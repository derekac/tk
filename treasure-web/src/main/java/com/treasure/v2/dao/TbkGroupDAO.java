package com.treasure.v2.dao;

import com.treasure.v2.model.TbkGroup;

import java.util.List;

public interface TbkGroupDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(TbkGroup record);

    void insertSelective(TbkGroup record);

    TbkGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbkGroup record);

    int updateByPrimaryKey(TbkGroup record);

    List<TbkGroup> selectAllGroup();
}