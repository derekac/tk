package com.treasure.v2.service.impl;

import com.treasure.v2.dao.TxrTbItemRateDAO;
import com.treasure.v2.model.TxrTbItemRate;
import com.treasure.v2.service.TxrTbRateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by crow on 2017/5/31.
 */

@Service
public class TxrTbRateServiceImpl implements TxrTbRateService{
  private Logger logger = LoggerFactory.getLogger(TxrTbRateServiceImpl.class);

  @Autowired
  private TxrTbItemRateDAO txrTbItemRateDAO;

  @Override
  public TxrTbItemRate getByItemId(Long itemId) {
    TxrTbItemRate rate = new TxrTbItemRate();

    try {
      rate = txrTbItemRateDAO.selectByItemId(itemId);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }

    return rate;
  }

  @Override
  public void addSelective(TxrTbItemRate record) {
    try {
      txrTbItemRateDAO.insertSelective(record);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }
  }
}
