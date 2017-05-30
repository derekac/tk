package com.treasure.v2.job;

import com.treasure.v2.dao.TbkCategoryGroupDAO;
import com.treasure.v2.model.TbkCategoryGroup;
import com.treasure.v2.service.PerfectItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by crow on 2017/5/30.
 */
@Component
public class CategroryNameJob {

  private Logger logger = LoggerFactory.getLogger(CategroryNameJob.class);

  @Autowired
  private TbkCategoryGroupDAO tbkCategoryGroupDAO;

  @Autowired
  private PerfectItemService perfectItemService;


  // 每30分钟执行一次
  @Scheduled(cron = "0 0/30 * * * ?")
  public void updateCatNameWeight() {
    List<TbkCategoryGroup> list = perfectItemService.getCatNameWeight();

    Map<String, Integer> map = new HashMap<String, Integer>();
    for (TbkCategoryGroup item: list) {
      map.put(item.getCategoryName(), item.getWeight());
    }

    List<TbkCategoryGroup> old = tbkCategoryGroupDAO.selectAllCategoryGroup();

    Map<String, TbkCategoryGroup> oldMap = new HashMap<String, TbkCategoryGroup>();
    for (TbkCategoryGroup item: old) {
      oldMap.put(item.getCategoryName(), item);
    }

    // 插入新的数据
    for (TbkCategoryGroup item: list) {
      if (oldMap.get(item.getCategoryName()) == null) {
        TbkCategoryGroup params = new TbkCategoryGroup();
        params.setWeight(item.getWeight());
        params.setCategoryName(item.getCategoryName());

        try {
          tbkCategoryGroupDAO.insertSelective(params);
          logger.info("[类目] 插入新的类目： {}", params.getCategoryName());
        } catch (Exception e) {
          logger.error(e.getMessage(), e);
        }
      }
    }

    // 更新已经有的类目个数
    for (TbkCategoryGroup categoryGroup: old) {
      if (!categoryGroup.getWeight().equals(map.get(categoryGroup.getCategoryName()))) {
        TbkCategoryGroup params = new TbkCategoryGroup();
        params.setId(categoryGroup.getId());
        params.setWeight(map.get(categoryGroup.getCategoryName()));

        try {
          tbkCategoryGroupDAO.updateByPrimaryKeySelective(params);
          logger.info("[类目] 更新类目： {}， {}个数", categoryGroup.getCategoryName(), params.getWeight());
        } catch (Exception e) {
          logger.error(e.getMessage(), e);
        }
      }
    }
  }
}
