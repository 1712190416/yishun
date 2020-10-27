package com.xue.pojo.vo;

import java.util.List;

public class ProductionShow {
    private Integer id;

    private String nickName;

    private String explain;

    private List<String> imglist;

    private String launchTime;

    private String cameraArea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public List<String> getImglist() {
        return imglist;
    }

    public void setImglist(List<String> imglist) {
        this.imglist = imglist;
    }

    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public String getCameraArea() {
        return cameraArea;
    }

    public void setCameraArea(String cameraArea) {
        this.cameraArea = cameraArea;
    }
}
