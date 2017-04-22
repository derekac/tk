package com.treasure.v2.model;

import java.io.Serializable;

public class ActivityDetailVo extends ActivityDetail implements Serializable {


    private String nick;
    private String avatar;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}