package com.treasure.v2.service.impl;

import com.treasure.v2.dao.TxrTbShopInfoDAO;
import com.treasure.v2.model.TxrTbShopInfo;
import com.treasure.v2.service.TxrTbShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by crow on 2017/5/30.
 */

@Service
public class TxrTbShopServiceImpl implements TxrTbShopService{
  private Logger logger = LoggerFactory.getLogger(TxrTbShopServiceImpl.class);

  @Autowired
  private TxrTbShopInfoDAO txrTbShopInfoDAO;

  @Override
  public TxrTbShopInfo getByShopId(Long shopId) {
    TxrTbShopInfo info = new TxrTbShopInfo();

    try {
      info = txrTbShopInfoDAO.selectByShopId(shopId);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }

    return info;
  }

  @Override
  public void addSelective(TxrTbShopInfo record) {
    try {
      txrTbShopInfoDAO.insertSelective(record);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }
  }
}
