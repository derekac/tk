package com.treasure.v2.service;

import com.treasure.v2.model.TxrTbItemInfo;

/**
 * Created by crow on 2017/5/31.
 */
public interface TxrTbItemService {
  TxrTbItemInfo getByItemId(Long itemId);

  void addSelective(TxrTbItemInfo record);
}
