package com.treasure.v2.dao;

import com.treasure.v2.model.TbkItemDetail;

public interface TbkItemDetailDAO {
    int deleteByPrimaryKey(Long itemId);

    void insert(TbkItemDetail record);

    void insertSelective(TbkItemDetail record);

    TbkItemDetail selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(TbkItemDetail record);

    int updateByPrimaryKeyWithBLOBs(TbkItemDetail record);

    int updateByPrimaryKeyWithoutBLOBs(TbkItemDetail record);
}