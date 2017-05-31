package com.treasure.v2.model;

import java.util.Date;

public class TxrTbItemRate {
    private Integer id;

    private Long itemId;

    private Integer count;

    private String lastNick;

    private Integer lastStar;

    private String lastNickHeadPic;

    private Date updateTime;

    private Date createTime;

    private String lastFeedback;

    private String lastRatePicList;

    private String lastSubInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLastNick() {
        return lastNick;
    }

    public void setLastNick(String lastNick) {
        this.lastNick = lastNick == null ? null : lastNick.trim();
    }

    public Integer getLastStar() {
        return lastStar;
    }

    public void setLastStar(Integer lastStar) {
        this.lastStar = lastStar;
    }

    public String getLastNickHeadPic() {
        return lastNickHeadPic;
    }

    public void setLastNickHeadPic(String lastNickHeadPic) {
        this.lastNickHeadPic = lastNickHeadPic == null ? null : lastNickHeadPic.trim();
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

    public String getLastFeedback() {
        return lastFeedback;
    }

    public void setLastFeedback(String lastFeedback) {
        this.lastFeedback = lastFeedback == null ? null : lastFeedback.trim();
    }

    public String getLastRatePicList() {
        return lastRatePicList;
    }

    public void setLastRatePicList(String lastRatePicList) {
        this.lastRatePicList = lastRatePicList == null ? null : lastRatePicList.trim();
    }

    public String getLastSubInfo() {
        return lastSubInfo;
    }

    public void setLastSubInfo(String lastSubInfo) {
        this.lastSubInfo = lastSubInfo == null ? null : lastSubInfo.trim();
    }
}