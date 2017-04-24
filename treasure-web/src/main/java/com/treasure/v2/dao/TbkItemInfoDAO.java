package com.treasure.v2.dao;

import com.treasure.v2.model.TbkItemInfo;

public interface TbkItemInfoDAO {
    int deleteByPrimaryKey(Long numId);

    void insert(TbkItemInfo record);

    void insertSelective(TbkItemInfo record);

    TbkItemInfo selectByPrimaryKey(Long numId);

    int updateByPrimaryKeySelective(TbkItemInfo record);

    int updateByPrimaryKeyWithBLOBs(TbkItemInfo record);

    int updateByPrimaryKeyWithoutBLOBs(TbkItemInfo record);
}