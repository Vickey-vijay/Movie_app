package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: SpecialDetailEntry.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SpecialDetailEntry {
    private int favoriteNum;
    private int isFavorited;
    private String moduleCoverUrl;
    private String moduleDesc;
    private String moduleName;
    private String projectCoverUrl;
    private String projectDesc;
    private String projectTitle;
    private List<RecommandVideosEntity> videoList;

    public final int getFavoriteNum() {
        return this.favoriteNum;
    }

    public final String getModuleCoverUrl() {
        return this.moduleCoverUrl;
    }

    public final String getModuleDesc() {
        return this.moduleDesc;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final String getProjectCoverUrl() {
        return this.projectCoverUrl;
    }

    public final String getProjectDesc() {
        return this.projectDesc;
    }

    public final String getProjectTitle() {
        return this.projectTitle;
    }

    public final List<RecommandVideosEntity> getVideoList() {
        return this.videoList;
    }

    public final int isFavorited() {
        return this.isFavorited;
    }

    public final void setFavoriteNum(int i10) {
        this.favoriteNum = i10;
    }

    public final void setFavorited(int i10) {
        this.isFavorited = i10;
    }

    public final void setModuleCoverUrl(String str) {
        this.moduleCoverUrl = str;
    }

    public final void setModuleDesc(String str) {
        this.moduleDesc = str;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }

    public final void setProjectCoverUrl(String str) {
        this.projectCoverUrl = str;
    }

    public final void setProjectDesc(String str) {
        this.projectDesc = str;
    }

    public final void setProjectTitle(String str) {
        this.projectTitle = str;
    }

    public final void setVideoList(List<RecommandVideosEntity> list) {
        this.videoList = list;
    }
}
