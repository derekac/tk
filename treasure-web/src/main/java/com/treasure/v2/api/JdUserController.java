package com.treasure.v2.api;

import com.alibaba.fastjson.JSONObject;
import com.treasure.v2.model.TbkJdUser;
import com.treasure.v2.service.JdTokenService;
import com.treasure.v2.service.JdUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by crow on 2017/5/30.
 */

@Controller
@RequestMapping("/jd")
public class JdUserController {

  private Logger logger = LoggerFactory.getLogger(JdUserController.class);

  @Autowired
  private JdTokenService tokenService;

  @Autowired
  private JdUserService jdUserService;

  @ResponseBody
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  private void login(HttpServletRequest request, HttpServletResponse response) {
    tokenService.login(request, response);
  }

  @ResponseBody
  @RequestMapping(value = "/token", method = RequestMethod.GET)
  private Object token(@RequestParam(required = false) String code,
                        @RequestParam(required = false) String error) {
    JSONObject res = new JSONObject();
    if (code != null) {
      String result = tokenService.token(code);
      TbkJdUser user = jdUserService.processJdUser(result);
      res.put("user", user);
    }

    if (error != null) {
      res.put("error", error);
    }

    return res;
  }
}
