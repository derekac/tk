package com.treasure.v2.service.impl;

import com.treasure.v2.dao.TbkItemInfoApiDAO;
import com.treasure.v2.model.TbkItemInfoApi;
import com.treasure.v2.service.TbkItemInfoApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crow on 2017/5/30.
 */
public class TbkItemInfoApiServiceImpl implements TbkItemInfoApiService {
  private Logger logger = LoggerFactory.getLogger(TbkItemInfoApiServiceImpl.class);

  @Autowired
  private TbkItemInfoApiDAO tbkItemInfoApiDAO;

  @Override
  public List<TbkItemInfoApi> getNotAnalysis() {
    List<TbkItemInfoApi> itemInfoApiList = new ArrayList<TbkItemInfoApi>();

    try {
      itemInfoApiList = tbkItemInfoApiDAO.selectNotAnalysis();
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }
    return itemInfoApiList;
  }
}