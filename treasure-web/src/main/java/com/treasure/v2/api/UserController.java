package com.treasure.v2.api;

import com.alibaba.fastjson.JSONObject;
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
public class UserController {

    @Autowired
    private PerfectItemService perfectItemService;

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    @ResponseBody
    public Object login() {
        return null;
    }

}
