package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: RankVideoEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RankVideoEntry {
    private String content;
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41502id;
    private String name;
    private String user_num;
    private List<RecommandVideosEntity> vod_list;

    public final String getContent() {
        return this.content;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f41502id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUser_num() {
        return this.user_num;
    }

    public final List<RecommandVideosEntity> getVod_list() {
        return this.vod_list;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f41502id = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUser_num(String str) {
        this.user_num = str;
    }

    public final void setVod_list(List<RecommandVideosEntity> list) {
        this.vod_list = list;
    }
}
