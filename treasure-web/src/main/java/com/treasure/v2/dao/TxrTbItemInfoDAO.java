package com.treasure.v2.dao;

import com.treasure.v2.model.TxrTbItemInfo;

public interface TxrTbItemInfoDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(TxrTbItemInfo record);

    void insertSelective(TxrTbItemInfo record);

    TxrTbItemInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TxrTbItemInfo record);

    int updateByPrimaryKeyWithBLOBs(TxrTbItemInfo record);

    int updateByPrimaryKeyWithoutBLOBs(TxrTbItemInfo record);

    TxrTbItemInfo selectByItemId(Long itemId);
}