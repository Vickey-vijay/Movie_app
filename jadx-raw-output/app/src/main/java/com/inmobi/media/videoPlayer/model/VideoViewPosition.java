package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class VideoViewPosition {
    private int height;
    private String orientation;
    private int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f25582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f25583y;

    public final int getHeight() {
        return this.height;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.f25582x;
    }

    public final int getY() {
        return this.f25583y;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setOrientation(String str) {
        this.orientation = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public final void setX(int i10) {
        this.f25582x = i10;
    }

    public final void setY(int i10) {
        this.f25583y = i10;
    }
}
