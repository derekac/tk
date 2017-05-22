package com.treasure.v2.service;

import com.treasure.v2.dao.TbkCategoryGroupDAO;
import com.treasure.v2.model.TbkCategoryGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crow on 2017/5/22.
 */

@Service
public class TbkCategoryGroupService {
  private Logger logger = LoggerFactory.getLogger(TbkCategoryGroupService.class);

  @Autowired
  private TbkCategoryGroupDAO tbkCategoryGroupDAO;

  public List<TbkCategoryGroup> getRankingByWeight() {
    List<TbkCategoryGroup> categoryGroupList = new ArrayList<TbkCategoryGroup>();
    try {
      categoryGroupList = tbkCategoryGroupDAO.selectRankingByWeight();
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }

    return categoryGroupList;
  }
}
