package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: UploadVideoEntry.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UploadVideoEntry {
    private String headPhotoUrl;
    private String nickName;
    private int userId;
    private List<RecommandVideosEntity> videoList;

    public final String getHeadPhotoUrl() {
        return this.headPhotoUrl;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final List<RecommandVideosEntity> getVideoList() {
        return this.videoList;
    }

    public final void setHeadPhotoUrl(String str) {
        this.headPhotoUrl = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setUserId(int i10) {
        this.userId = i10;
    }

    public final void setVideoList(List<RecommandVideosEntity> list) {
        this.videoList = list;
    }
}
