package com.treasure.v2.service.impl;

import com.treasure.v2.dao.TbkItemInfoApiDAO;
import com.treasure.v2.model.TbkItemInfoApi;
import com.treasure.v2.service.TbkItemInfoApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crow on 2017/5/30.
 */

@Service
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

  @Override
  public void hadAnalysis(Long numId) {
    TbkItemInfoApi params = new TbkItemInfoApi();
    params.setNumId(numId);
    params.setIsAnalysis(1);

    try {
      tbkItemInfoApiDAO.updateByPrimaryKeySelective(params);
      logger.info("已经分析 numId", numId);
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }
  }
}
