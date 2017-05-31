package com.treasure.v2.service;

import com.treasure.v2.model.TbkItemInfoApi;

import java.util.List;

/**
 * Created by crow on 2017/5/30.
 */
public interface TbkItemInfoApiService {

  /**
   * 获得未解析的数据
   * @return
   */
  List<TbkItemInfoApi> getNotAnalysis();
}
