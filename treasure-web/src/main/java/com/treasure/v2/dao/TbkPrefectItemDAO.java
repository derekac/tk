package com.treasure.v2.dao;

import com.treasure.v2.model.TbkPrefectItem;

import java.util.List;
import java.util.Map;

public interface TbkPrefectItemDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(TbkPrefectItem record);

    void insertSelective(TbkPrefectItem record);

    TbkPrefectItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbkPrefectItem record);

    int updateByPrimaryKey(TbkPrefectItem record);

    List<TbkPrefectItem> selectItemsByParams(Map<String,String> params);

    int getItemByParamsTotal(Map<String,String> params);

}