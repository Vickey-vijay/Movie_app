package com.yk.e.object;

/* JADX INFO: loaded from: classes9.dex */
public class PreCacheParams {
    private String AdsID = "";
    private String FeeTypeID = "";
    private String width = "";
    private String height = "";
    private String videoUrl = "";
    private String m3u8Url = "";
    private String imgUrl = "";
    private String fileAlias = "";

    public String getAdsID() {
        return this.AdsID;
    }

    public String getFeeTypeID() {
        return this.FeeTypeID;
    }

    public String getFileAlias() {
        return this.fileAlias;
    }

    public String getHeight() {
        return this.height;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getM3u8Url() {
        return this.m3u8Url;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public String getWidth() {
        return this.width;
    }

    public void setAdsID(String str) {
        this.AdsID = str;
    }

    public void setFeeTypeID(String str) {
        this.FeeTypeID = str;
    }

    public void setFileAlias(String str) {
        this.fileAlias = str;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public void setM3u8Url(String str) {
        this.m3u8Url = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public void setWidth(String str) {
        this.width = str;
    }

    public String toString() {
        return "PreCacheParams{AdsID='" + this.AdsID + "', FeeTypeID='" + this.FeeTypeID + "', width='" + this.width + "', height='" + this.height + "', videoUrl='" + this.videoUrl + "', m3u8Url='" + this.m3u8Url + "', imgUrl='" + this.imgUrl + "', fileAlias='" + this.fileAlias + "'}";
    }
}
