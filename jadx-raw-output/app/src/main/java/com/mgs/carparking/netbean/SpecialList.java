package com.mgs.carparking.netbean;

import java.io.Serializable;

/* JADX INFO: compiled from: SpecialList.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SpecialList implements Serializable {
    private String content;
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41509id;
    private String name;
    private int vod_num;
    private int weight;

    public final String getContent() {
        return this.content;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f41509id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getVod_num() {
        return this.vod_num;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f41509id = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setVod_num(int i10) {
        this.vod_num = i10;
    }

    public final void setWeight(int i10) {
        this.weight = i10;
    }
}
