package com.treasure.v2.api;

import com.alibaba.fastjson.JSONObject;
import com.treasure.v2.core.RestfulResponse;
import com.treasure.v2.model.Item;
import com.treasure.v2.service.PerfectItemService;
import com.treasure.v2.vo.PerfectItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by derek on 16/4/24.
 */
@Controller
@RequestMapping("api")
public class ItemController {

    @Autowired
    private PerfectItemService perfectItemService;

    @RequestMapping(value = "/item-get", method = RequestMethod.GET)
    @ResponseBody
    public Object getItem(@RequestParam(required = false) String query,
                          @RequestParam(required = false) Long gid,
                          @RequestParam(required = false) String sort,
                          @RequestParam(required = false) Integer startPrice,
                          @RequestParam(required = false) Integer endPrice,
                          @RequestParam(required = false, defaultValue = "0") Integer pageNo,
                          @RequestParam(required = false, defaultValue = "10") Integer pageSize
    ) {
        PerfectItemService.ItemGetParam param = new PerfectItemService.ItemGetParam();
        param.setQuery(query);
        param.setGid(gid);
        param.setSort(sort);
        param.setStartPrice(startPrice);
        param.setEndPrice(endPrice);
        param.setPageNo(pageNo);
        param.setPageSize(pageSize);
        List<PerfectItem> items = perfectItemService.getItem(param);
        Integer           total = perfectItemService.getItemCount(param);
        JSONObject        ret   = new JSONObject();
        ret.put("items", items);
        ret.put("total_results", total);
        return ret;
    }

}
