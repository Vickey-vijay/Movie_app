package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: VideoMoreEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoMoreEntry {
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41516id;
    private String name;
    private List<RecommandVideosEntity> vod_list;

    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f41516id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<RecommandVideosEntity> getVod_list() {
        return this.vod_list;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f41516id = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setVod_list(List<RecommandVideosEntity> list) {
        this.vod_list = list;
    }
}
