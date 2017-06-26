package com.treasure.v2.service;

import com.treasure.v2.model.TxrTbShopInfo;

/**
 * Created by crow on 2017/5/30.
 */
public interface TxrTbShopService {

  TxrTbShopInfo getByShopId(Long shopId);

  TxrTbShopInfo getByShopName(String shopName);

  void addSelective(TxrTbShopInfo record);
}
