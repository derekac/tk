package com.treasure.v2.api;

import com.alibaba.fastjson.JSONObject;
import com.treasure.v2.model.TbkCategoryGroup;
import com.treasure.v2.service.TbkCategoryGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by crow on 2017/5/22.
 */
@Controller
@RequestMapping("/api")
public class CategoryController {

  @Autowired
  private TbkCategoryGroupService tbkCategoryGroupService;

  @RequestMapping(value = "/category/ranking", method = RequestMethod.GET)
  @ResponseBody
  private Object getRankdingByWeight() {
    List<TbkCategoryGroup> categoryGroupList = tbkCategoryGroupService.getRankingByWeight();
    JSONObject     res            = new JSONObject();
    res.put("category", categoryGroupList);
    return res;
  }
}
