package com.treasure.v2.vo;

import com.treasure.v2.util.RegexUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * Created by derek on 4/22/17.
 */
public class PerfectItem {
    private Integer perfectId;
    private Long    itemId;

    private String title;

    private String imgUrl;

    private String itemUrl;

    private String catName;

    private String tbkUrl;

    private Double price;

    private Long volume;


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

    private String wirelessShare;

    private String shortUrl;
    private String preferPrice;


    private Double getCouponsPrice() {
        if (StringUtils.isNotEmpty(getCouponsSummary())) {
            String v1 = RegexUtils.regexString(getCouponsSummary(), "满(\\d+)元");
            String v3 = RegexUtils.regexString(getCouponsSummary(), "(\\d+)元无条件券");
            if (StringUtils.isNumeric(v1)) {
                return Double.parseDouble(v3);
            }
            if (StringUtils.isNumeric(v3)) {
                return Double.parseDouble(v3);
            }
        }
        return null;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getPreferPrice() {
        return preferPrice;
    }

    public void setPreferPrice(String preferPrice) {
        this.preferPrice = preferPrice;
    }

    public String getWirelessShare() {
        return wirelessShare;
    }

    public void setWirelessShare(String wirelessShare) {
        this.wirelessShare = wirelessShare;
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
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public Integer getPerfectId() {
        return perfectId;
    }

    public void setPerfectId(Integer perfectId) {
        this.perfectId = perfectId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getTbkUrl() {
        return tbkUrl;
    }

    public void setTbkUrl(String tbkUrl) {
        this.tbkUrl = tbkUrl;
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

    public String getTaobaoNick() {
        return taobaoNick;
    }

    public void setTaobaoNick(String taobaoNick) {
        this.taobaoNick = taobaoNick;
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
        this.shopName = shopName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCouponsId() {
        return couponsId;
    }

    public void setCouponsId(String couponsId) {
        this.couponsId = couponsId;
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
        this.couponsSummary = couponsSummary;
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
        this.couponsUrl = couponsUrl;
    }

    public String getItemAdUrl() {
        return itemAdUrl;
    }

    public void setItemAdUrl(String itemAdUrl) {
        this.itemAdUrl = itemAdUrl;
    }
}
