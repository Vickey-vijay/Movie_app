package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import ck.p;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class HtmlVideoFile {
    private int height;
    private String url = "";
    private int width;

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setUrl(String str) {
        p.j(str, "<set-?>");
        this.url = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }
}
