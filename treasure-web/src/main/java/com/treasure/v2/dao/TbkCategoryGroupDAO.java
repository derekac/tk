package com.treasure.v2.dao;

import com.treasure.v2.model.TbkCategoryGroup;

import java.util.List;

public interface TbkCategoryGroupDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(TbkCategoryGroup record);

    void insertSelective(TbkCategoryGroup record);

    TbkCategoryGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbkCategoryGroup record);

    int updateByPrimaryKey(TbkCategoryGroup record);

    List<TbkCategoryGroup> selectAllCategoryGroup();

    List<TbkCategoryGroup> selectParams(TbkCategoryGroup params);

    List<TbkCategoryGroup> selectRankingByWeight();
}