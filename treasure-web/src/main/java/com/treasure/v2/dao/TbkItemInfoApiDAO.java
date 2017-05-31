package com.treasure.v2.dao;

import com.treasure.v2.model.TbkItemInfoApi;

import java.util.List;

public interface TbkItemInfoApiDAO {
    int deleteByPrimaryKey(Long numId);

    void insert(TbkItemInfoApi record);

    void insertSelective(TbkItemInfoApi record);

    TbkItemInfoApi selectByPrimaryKey(Long numId);

    int updateByPrimaryKeySelective(TbkItemInfoApi record);

    int updateByPrimaryKey(TbkItemInfoApi record);

    List<TbkItemInfoApi> selectNotAnalysis();
}