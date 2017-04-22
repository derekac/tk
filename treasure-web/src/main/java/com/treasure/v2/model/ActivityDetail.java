package com.treasure.v2.model;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.Date;

public class ActivityDetail implements Serializable {
    private Integer id;

    /**
     * 活动ID
     */
    private Integer activityId;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     *
     */
    private String message;

    /**
     * 记录增加时间
     */
    private Date addTime;

    /**
     * 记录更新时间
     */
    private Date updTime;

    /**
     * 时间戳 毫秒
     */
    private Long time;

    /**
     * 格式化后的时间
     */
    private String timeFormat;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 购买夺宝码的个数
     */
    private Integer cnt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
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

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        if (time != null) {
            timeFormat = new DateTime(time).toString("yyyy-MM-dd HH:mm:ss.SSS");
        }
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }
}