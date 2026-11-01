package com.mgs.carparking.netbean;

import java.io.Serializable;

/* JADX INFO: compiled from: ShortVideoListEntry.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ShortVideoListEntry implements Serializable {
    private String click_count;
    private int collection;
    private String describe;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41508id;
    private String name;
    private String pic_url;
    private String play_url;
    private String vod_douban_score;
    private int vod_id;
    private String vod_pic;

    public final String getClick_count() {
        return this.click_count;
    }

    public final int getCollection() {
        return this.collection;
    }

    public final String getDescribe() {
        return this.describe;
    }

    public final int getId() {
        return this.f41508id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPic_url() {
        return this.pic_url;
    }

    public final String getPlay_url() {
        return this.play_url;
    }

    public final String getVod_douban_score() {
        return this.vod_douban_score;
    }

    public final int getVod_id() {
        return this.vod_id;
    }

    public final String getVod_pic() {
        return this.vod_pic;
    }

    public final void setClick_count(String str) {
        this.click_count = str;
    }

    public final void setCollection(int i10) {
        this.collection = i10;
    }

    public final void setDescribe(String str) {
        this.describe = str;
    }

    public final void setId(int i10) {
        this.f41508id = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPic_url(String str) {
        this.pic_url = str;
    }

    public final void setPlay_url(String str) {
        this.play_url = str;
    }

    public final void setVod_douban_score(String str) {
        this.vod_douban_score = str;
    }

    public final void setVod_id(int i10) {
        this.vod_id = i10;
    }

    public final void setVod_pic(String str) {
        this.vod_pic = str;
    }
}
