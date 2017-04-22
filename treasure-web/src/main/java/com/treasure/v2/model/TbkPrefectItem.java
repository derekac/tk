package com.treasure.v2.model;

import com.alibaba.fastjson.JSON;
import com.treasure.v2.vo.PerfectItem;

import java.util.Date;

public class TbkPrefectItem {
    private Integer id;

    private Long itemId;

    private String title;

    private String imgUrl;

    private String itemUrl;

    private String catName;

    private String tbkUrl;

    private Double price;

    private Long volume;

    private Double incomeRate;

    private Double commission;

    private String taobaoNick;

    private Long taobaoId;

    private String shopName;

    private String platform;

    private String couponsId;

    private Integer couponsTotal;

    private Integer couponsRemain;

    private String couponsSummary;

    private Date couponsStart;

    private Date couponsEnd;

    private String couponsUrl;

    private String itemAdUrl;

    private Date addTime;

    private Integer gid;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl == null ? null : itemUrl.trim();
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public String getTbkUrl() {
        return tbkUrl;
    }

    public void setTbkUrl(String tbkUrl) {
        this.tbkUrl = tbkUrl == null ? null : tbkUrl.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Double getIncomeRate() {
        return incomeRate;
    }

    public void setIncomeRate(Double incomeRate) {
        this.incomeRate = incomeRate;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getTaobaoNick() {
        return taobaoNick;
    }

    public void setTaobaoNick(String taobaoNick) {
        this.taobaoNick = taobaoNick == null ? null : taobaoNick.trim();
    }

    public Long getTaobaoId() {
        return taobaoId;
    }

    public void setTaobaoId(Long taobaoId) {
        this.taobaoId = taobaoId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getCouponsId() {
        return couponsId;
    }

    public void setCouponsId(String couponsId) {
        this.couponsId = couponsId == null ? null : couponsId.trim();
    }

    public Integer getCouponsTotal() {
        return couponsTotal;
    }

    public void setCouponsTotal(Integer couponsTotal) {
        this.couponsTotal = couponsTotal;
    }

    public Integer getCouponsRemain() {
        return couponsRemain;
    }

    public void setCouponsRemain(Integer couponsRemain) {
        this.couponsRemain = couponsRemain;
    }

    public String getCouponsSummary() {
        return couponsSummary;
    }

    public void setCouponsSummary(String couponsSummary) {
        this.couponsSummary = couponsSummary == null ? null : couponsSummary.trim();
    }

    public Date getCouponsStart() {
        return couponsStart;
    }

    public void setCouponsStart(Date couponsStart) {
        this.couponsStart = couponsStart;
    }

    public Date getCouponsEnd() {
        return couponsEnd;
    }

    public void setCouponsEnd(Date couponsEnd) {
        this.couponsEnd = couponsEnd;
    }

    public String getCouponsUrl() {
        return couponsUrl;
    }

    public void setCouponsUrl(String couponsUrl) {
        this.couponsUrl = couponsUrl == null ? null : couponsUrl.trim();
    }

    public String getItemAdUrl() {
        return itemAdUrl;
    }

    public void setItemAdUrl(String itemAdUrl) {
        this.itemAdUrl = itemAdUrl == null ? null : itemAdUrl.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public PerfectItem formatPerfectItem() {
        PerfectItem item = new PerfectItem();
        item = JSON.parseObject(JSON.toJSONString(this), PerfectItem.class);
        return item;
    }
}