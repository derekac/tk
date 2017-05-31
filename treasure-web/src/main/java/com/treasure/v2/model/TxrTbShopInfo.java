package com.treasure.v2.model;

import java.util.Date;

public class TxrTbShopInfo {
    private Long id;

    private Long shopId;

    private String shopName;

    private String shopPromtionType;

    private Integer creditLevel;

    private Long fansCount;

    private String type;

    private Double descriptionScore;

    private Double serviceScore;

    private Double courierScore;

    private Long userNumId;

    private Date starts;

    private Long weitaoId;

    private Date updateTime;

    private Date createTime;

    private String shopPic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopPromtionType() {
        return shopPromtionType;
    }

    public void setShopPromtionType(String shopPromtionType) {
        this.shopPromtionType = shopPromtionType == null ? null : shopPromtionType.trim();
    }

    public Integer getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(Integer creditLevel) {
        this.creditLevel = creditLevel;
    }

    public Long getFansCount() {
        return fansCount;
    }

    public void setFansCount(Long fansCount) {
        this.fansCount = fansCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getDescriptionScore() {
        return descriptionScore;
    }

    public void setDescriptionScore(Double descriptionScore) {
        this.descriptionScore = descriptionScore;
    }

    public Double getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Double serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Double getCourierScore() {
        return courierScore;
    }

    public void setCourierScore(Double courierScore) {
        this.courierScore = courierScore;
    }

    public Long getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Long userNumId) {
        this.userNumId = userNumId;
    }

    public Date getStarts() {
        return starts;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public Long getWeitaoId() {
        return weitaoId;
    }

    public void setWeitaoId(Long weitaoId) {
        this.weitaoId = weitaoId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getShopPic() {
        return shopPic;
    }

    public void setShopPic(String shopPic) {
        this.shopPic = shopPic == null ? null : shopPic.trim();
    }
}