package com.treasure.v2.api;

import com.alibaba.fastjson.JSONObject;
import com.treasure.v2.model.TbkWeixinUser;
import com.treasure.v2.service.PerfectItemService;
import com.treasure.v2.service.WXUserService;
import com.treasure.v2.vo.PerfectItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by derek on 16/4/24.
 */
@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private PerfectItemService perfectItemService;

    @Autowired
    private WXUserService wxUserService;

    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    @ResponseBody
    public Object login() {
        return null;
    }


    @ResponseBody
    @RequestMapping(value = "/user/record", method = RequestMethod.POST)
    public Object recordUser(@RequestBody TbkWeixinUser user) {
        JSONObject     sr            = new JSONObject();
        if (user.getNickName() == null) {
            sr.put("msg", "用户名不存在, 参数传入出错");
            return sr;
        }

        boolean result = wxUserService.recordWXUser(user);

        if (result) {
            sr.put("success", "true");
        } else {
            sr.put("msg", "用户录入失败，或者已经存在");
        }

        return sr;
    }
}
