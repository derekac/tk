package com.treasure.v2.model;

/**
 * Created by jason on 16/4/11.
 */
public class Banner {

    private String img_url; // 图片地址
    private String link_url; // 跳转地址

    public String getImg_url() {
        return img_url;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }
}
