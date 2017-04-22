package com.treasure.v2.model;

import java.util.Date;

public class UserProfile {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 用户昵称
     */
    private String nick;

    /**
     * 用户登录用户名
     */
    private String userName;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 用户余额 按照分来计算
     */
    private Integer banlance;

    /**
     * 用户头像相对路径
     */
    private String avatar;

    /**
     * 用户手机号码
     */
    private Long telphone;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 数据插入时间
     */
    private Date addTime;

    /**
     * 数据更新时间
     */
    private Date updTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getBanlance() {
        return banlance;
    }

    public void setBanlance(Integer banlance) {
        this.banlance = banlance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Long getTelphone() {
        return telphone;
    }

    public void setTelphone(Long telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}