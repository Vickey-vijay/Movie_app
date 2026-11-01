package com.mgs.carparking.netbean;

import java.io.Serializable;

/* JADX INFO: compiled from: VideoInfoModel.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class VideoInfoModel implements Serializable {
    private String author;
    private String author_description;
    private String author_icon;
    private String category;
    private String cover;
    private String date;
    private String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41515id;
    private String play_url;
    private String title;

    public final String getAuthor() {
        return this.author;
    }

    public final String getAuthor_description() {
        return this.author_description;
    }

    public final String getAuthor_icon() {
        return this.author_icon;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f41515id;
    }

    public final String getPlay_url() {
        return this.play_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setAuthor_description(String str) {
        this.author_description = str;
    }

    public final void setAuthor_icon(String str) {
        this.author_icon = str;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setCover(String str) {
        this.cover = str;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setId(int i10) {
        this.f41515id = i10;
    }

    public final void setPlay_url(String str) {
        this.play_url = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
