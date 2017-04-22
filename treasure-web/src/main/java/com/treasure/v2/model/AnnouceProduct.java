package com.treasure.v2.model;

/**
 * Created by jason on 16/4/11.
 */
public class AnnouceProduct {

    private int id; // 产品id
    private String img_url; // 产品图片
    private String name; // 产品名称
    private String timer; // 倒计时

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }
}
