package com.xue.pojo.po;

import java.io.Serializable;

public class AppointmentInfo implements Serializable {
    private Integer id;

    private String account;

    private String avatarUrl;

    private String cameraArea;

    private String explain;

    private Integer gender;

    private Integer getInvite;

    private String imgList;

    private String launchTime;

    private String nickName;

    private String price;

    private Integer readNumber;

    private String tagList;

    private String cameraTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getCameraArea() {
        return cameraArea;
    }

    public void setCameraArea(String cameraArea) {
        this.cameraArea = cameraArea == null ? null : cameraArea.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getGetInvite() {
        return getInvite;
    }

    public void setGetInvite(Integer getInvite) {
        this.getInvite = getInvite;
    }

    public String getImgList() {
        return imgList;
    }

    public void setImgList(String imgList) {
        this.imgList = imgList == null ? null : imgList.trim();
    }

    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime == null ? null : launchTime.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(Integer readNumber) {
        this.readNumber = readNumber;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList == null ? null : tagList.trim();
    }

    public String getCameraTime() {
        return cameraTime;
    }

    public void setCameraTime(String cameraTime) {
        this.cameraTime = cameraTime == null ? null : cameraTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", cameraArea=").append(cameraArea);
        sb.append(", explain=").append(explain);
        sb.append(", gender=").append(gender);
        sb.append(", getInvite=").append(getInvite);
        sb.append(", imgList=").append(imgList);
        sb.append(", launchTime=").append(launchTime);
        sb.append(", nickName=").append(nickName);
        sb.append(", price=").append(price);
        sb.append(", readNumber=").append(readNumber);
        sb.append(", tagList=").append(tagList);
        sb.append(", cameraTime=").append(cameraTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}