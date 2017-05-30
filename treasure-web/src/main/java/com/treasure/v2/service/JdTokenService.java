package com.treasure.v2.service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by crow on 2017/5/30.
 */

public interface JdTokenService {
  void login(HttpServletRequest request, HttpServletResponse response);

  String token(String code);
}
