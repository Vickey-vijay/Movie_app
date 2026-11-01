package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: HomeMultipleVideoEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HomeMultipleVideoEntry {
    private String moduleCoverUrl;
    private int moduleId;
    private String moduleName;
    private int type;
    private List<RecommandVideosEntity> videoList;

    public final String getModuleCoverUrl() {
        return this.moduleCoverUrl;
    }

    public final int getModuleId() {
        return this.moduleId;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final int getType() {
        return this.type;
    }

    public final List<RecommandVideosEntity> getVideoList() {
        return this.videoList;
    }

    public final void setModuleCoverUrl(String str) {
        this.moduleCoverUrl = str;
    }

    public final void setModuleId(int i10) {
        this.moduleId = i10;
    }

    public final void setModuleName(String str) {
        this.moduleName = str;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    public final void setVideoList(List<RecommandVideosEntity> list) {
        this.videoList = list;
    }
}
