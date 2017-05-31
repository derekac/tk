package com.treasure.v2.service.impl;

import com.treasure.v2.dao.TxrTbItemInfoDAO;
import com.treasure.v2.model.TxrTbItemInfo;
import com.treasure.v2.service.TxrTbItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by crow on 2017/5/31.
 */
public class TxrTbItemServiceImpl implements TxrTbItemService{
  private Logger logger = LoggerFactory.getLogger(TxrTbItemServiceImpl.class);

  @Autowired
  private TxrTbItemInfoDAO txrTbItemInfoDAO;

  @Override
  public TxrTbItemInfo getByItemId(Long itemId) {
    TxrTbItemInfo info = new TxrTbItemInfo();

    try {
      info = txrTbItemInfoDAO.selectByItemId(itemId);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }

    return info;
  }

  @Override
  public void addSelective(TxrTbItemInfo record) {
    try {
      txrTbItemInfoDAO.insertSelective(record);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }
  }
}
