package com.treasure.v2.dao;

import com.treasure.v2.model.TxrTbShopInfo;

public interface TxrTbShopInfoDAO {
    int deleteByPrimaryKey(Long id);

    void insert(TxrTbShopInfo record);

    void insertSelective(TxrTbShopInfo record);

    TxrTbShopInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TxrTbShopInfo record);

    int updateByPrimaryKeyWithBLOBs(TxrTbShopInfo record);

    int updateByPrimaryKeyWithoutBLOBs(TxrTbShopInfo record);

    TxrTbShopInfo selectByShopId(Long shopID);

    TxrTbShopInfo selectByShopName(String shopName);
}