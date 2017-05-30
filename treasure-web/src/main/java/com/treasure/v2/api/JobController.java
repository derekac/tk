package com.treasure.v2.api;

import com.alibaba.fastjson.JSONObject;
import com.treasure.v2.job.CategroryNameJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by crow on 2017/5/30.
 */

@Controller
@RequestMapping("/api/job")
public class JobController {

  @Autowired
  private CategroryNameJob categroryNameJob;

  private static final ExecutorService threadPool = Executors.newFixedThreadPool(10);

  @ResponseBody
  @RequestMapping(value = "/catName", method = RequestMethod.GET)
  private Object jobCatName() {
    JSONObject res = new JSONObject();
    threadPool.execute(new Runnable() {
      @Override
      public void run() {
        categroryNameJob.updateCatNameWeight();
      }
    });

    res.put("msg", "在处理");

    return res;
  }
}
