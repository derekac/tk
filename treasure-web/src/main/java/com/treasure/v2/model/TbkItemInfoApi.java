package com.treasure.v2.model;

public class TbkItemInfoApi {
    private Long numId;

    private String apiStack;

    private String itemInfoModel;

    private String skuModel;

    private String seller;

    private String guaranteeInfo;

    private String props;

    private String descInfo;

    private String rateInfo;

    private String extras;

    private String layoutData;

    private String trackParams;

    private Integer isAnalysis;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getApiStack() {
        return apiStack;
    }

    public void setApiStack(String apiStack) {
        this.apiStack = apiStack == null ? null : apiStack.trim();
    }

    public String getItemInfoModel() {
        return itemInfoModel;
    }

    public void setItemInfoModel(String itemInfoModel) {
        this.itemInfoModel = itemInfoModel == null ? null : itemInfoModel.trim();
    }

    public String getSkuModel() {
        return skuModel;
    }

    public void setSkuModel(String skuModel) {
        this.skuModel = skuModel == null ? null : skuModel.trim();
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
    }

    public String getGuaranteeInfo() {
        return guaranteeInfo;
    }

    public void setGuaranteeInfo(String guaranteeInfo) {
        this.guaranteeInfo = guaranteeInfo == null ? null : guaranteeInfo.trim();
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props == null ? null : props.trim();
    }

    public String getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo == null ? null : descInfo.trim();
    }

    public String getRateInfo() {
        return rateInfo;
    }

    public void setRateInfo(String rateInfo) {
        this.rateInfo = rateInfo == null ? null : rateInfo.trim();
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras == null ? null : extras.trim();
    }

    public String getLayoutData() {
        return layoutData;
    }

    public void setLayoutData(String layoutData) {
        this.layoutData = layoutData == null ? null : layoutData.trim();
    }

    public String getTrackParams() {
        return trackParams;
    }

    public void setTrackParams(String trackParams) {
        this.trackParams = trackParams == null ? null : trackParams.trim();
    }

    public Integer getIsAnalysis() {
        return isAnalysis;
    }

    public void setIsAnalysis(Integer isAnalysis) {
        this.isAnalysis = isAnalysis;
    }
}