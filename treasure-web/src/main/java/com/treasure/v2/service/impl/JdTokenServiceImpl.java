package com.treasure.v2.service.impl;

import com.treasure.v2.service.JdTokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by crow on 2017/5/30.
 */

@Service
public class JdTokenServiceImpl implements JdTokenService {

  @Value("${jd.oauth.url}")
  private String oauthUrl;

  @Value("${jd.token.url}")
  private String tokenUrl;

  @Value("${jd.appkey}")
  private String appKey;

  @Value("${jd.appSecret}")
  private String appSecret;

  @Value("${jd.redirect.url}")
  private String redirectUrl;

  private Logger logger = LoggerFactory.getLogger(JdTokenServiceImpl.class);

  @Override
  public void login(HttpServletRequest request, HttpServletResponse response) {
    String url = oauthUrl + "?response_type=code&client_id=" + appKey + "&redirect_uri=" + redirectUrl;

    try {
      response.sendRedirect(url);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public String token(String code) {
    String url = tokenUrl + "?grant_type=authorization_code&client_id=" + appKey
            + "&client_secret=" + appSecret
            + "&scope=read&redirect_uri=" + redirectUrl
            + "&code=" + code;
    URL uri = null;
    try {
      uri = new URL(url);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    HttpURLConnection conn = null;
    try {
      conn = (HttpURLConnection) uri.openConnection();
    } catch (IOException e) {
      e.printStackTrace();
    }
    conn.setRequestProperty("Accept-Charset", "utf-8");
    conn.setRequestProperty("contentType", "utf-8");
    try {
      conn.setRequestMethod("POST");
    } catch (ProtocolException e) {
      e.printStackTrace();
    }
    try {
      conn.getResponseCode();
    } catch (IOException e) {
      e.printStackTrace();
    }
    InputStream is = null;
    try {
      is = conn.getInputStream();
    } catch (IOException e) {
      e.printStackTrace();
    }
    String jsonStr = null;
    try {
      jsonStr = inputStream2String(is);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return jsonStr;
  }


  private static String inputStream2String(InputStream is) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(is, "GBK"));
    StringBuffer buffer = new StringBuffer();
    String line = "";
    while ((line = in.readLine()) != null){
      buffer.append(line);
    }
    return buffer.toString();
  }
}
