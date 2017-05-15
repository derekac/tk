package com.treasure.v2.model;

import java.util.Date;

public class TbkUseCouponLog {
    private Integer id;

    private String userType;

    private Integer userId;

    private String form;

    private Integer prefectId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form == null ? null : form.trim();
    }

    public Integer getPrefectId() {
        return prefectId;
    }

    public void setPrefectId(Integer prefectId) {
        this.prefectId = prefectId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}