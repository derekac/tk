package com.treasure.v2.service;

import com.treasure.v2.model.TxrTbItemRate;

/**
 * Created by crow on 2017/5/31.
 */
public interface TxrTbRateService {
  TxrTbItemRate getByItemId(Long itemId);

  void addSelective(TxrTbItemRate record);
}
