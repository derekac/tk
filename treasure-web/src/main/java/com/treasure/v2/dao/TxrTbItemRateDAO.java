package com.treasure.v2.dao;

import com.treasure.v2.model.TxrTbItemRate;

public interface TxrTbItemRateDAO {
    int deleteByPrimaryKey(Integer id);

    void insert(TxrTbItemRate record);

    void insertSelective(TxrTbItemRate record);

    TxrTbItemRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TxrTbItemRate record);

    int updateByPrimaryKeyWithBLOBs(TxrTbItemRate record);

    int updateByPrimaryKeyWithoutBLOBs(TxrTbItemRate record);

    TxrTbItemRate selectByItemId(Long ItemId);
}