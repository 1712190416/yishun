package com.xue.pojo.po;

import java.io.Serializable;

public class Production implements Serializable {
    private Integer id;

    private String account;

    private String explain;

    private String imglist;

    private String taglist;

    private String launchTime;

    private String cameraArea;

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

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getImglist() {
        return imglist;
    }

    public void setImglist(String imglist) {
        this.imglist = imglist == null ? null : imglist.trim();
    }

    public String getTaglist() {
        return taglist;
    }

    public void setTaglist(String taglist) {
        this.taglist = taglist == null ? null : taglist.trim();
    }

    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime == null ? null : launchTime.trim();
    }

    public String getCameraArea() {
        return cameraArea;
    }

    public void setCameraArea(String cameraArea) {
        this.cameraArea = cameraArea == null ? null : cameraArea.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", explain=").append(explain);
        sb.append(", imglist=").append(imglist);
        sb.append(", taglist=").append(taglist);
        sb.append(", launchTime=").append(launchTime);
        sb.append(", cameraArea=").append(cameraArea);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}