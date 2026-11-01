package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: ShortVideoEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ShortVideoEntry {
    private String clickNum;
    private String score;
    private String videoCoverUrl;
    private int videoId;
    private List<ShortVideoListEntry> videoList;

    public final String getClickNum() {
        return this.clickNum;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getVideoCoverUrl() {
        return this.videoCoverUrl;
    }

    public final int getVideoId() {
        return this.videoId;
    }

    public final List<ShortVideoListEntry> getVideoList() {
        return this.videoList;
    }

    public final void setClickNum(String str) {
        this.clickNum = str;
    }

    public final void setScore(String str) {
        this.score = str;
    }

    public final void setVideoCoverUrl(String str) {
        this.videoCoverUrl = str;
    }

    public final void setVideoId(int i10) {
        this.videoId = i10;
    }

    public final void setVideoList(List<ShortVideoListEntry> list) {
        this.videoList = list;
    }
}
