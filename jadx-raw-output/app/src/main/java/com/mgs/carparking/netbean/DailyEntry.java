package com.mgs.carparking.netbean;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: DailyEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DailyEntry implements Serializable {
    private List<VideoInfoModel> bannerList;
    private List<CategoryModel> categoryModels;
    private String title;
    private String type;
    private int type_id;
    private VideoInfoModel videoInfo;

    public final List<VideoInfoModel> getBannerList() {
        return this.bannerList;
    }

    public final List<CategoryModel> getCategoryModels() {
        return this.categoryModels;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int getType_id() {
        return this.type_id;
    }

    public final VideoInfoModel getVideoInfo() {
        return this.videoInfo;
    }

    public final void setBannerList(List<VideoInfoModel> list) {
        this.bannerList = list;
    }

    public final void setCategoryModels(List<CategoryModel> list) {
        this.categoryModels = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setType_id(int i10) {
        this.type_id = i10;
    }

    public final void setVideoInfo(VideoInfoModel videoInfoModel) {
        this.videoInfo = videoInfoModel;
    }
}
