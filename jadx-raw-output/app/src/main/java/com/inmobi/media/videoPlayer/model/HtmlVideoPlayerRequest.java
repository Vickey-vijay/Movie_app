package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import ck.p;
import java.util.List;
import nj.s;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class HtmlVideoPlayerRequest {
    private boolean isCache;
    private List<HtmlVideoFile> videoFiles = s.k();
    private long loadTimeout = 3000;
    private HtmlVideoPlayerConfig config = new HtmlVideoPlayerConfig();
    private List<HtmlOmidTracker> omidTrackers = s.k();

    public final HtmlVideoPlayerConfig getConfig() {
        return this.config;
    }

    public final long getLoadTimeout() {
        return this.loadTimeout;
    }

    public final List<HtmlOmidTracker> getOmidTrackers() {
        return this.omidTrackers;
    }

    public final List<HtmlVideoFile> getVideoFiles() {
        return this.videoFiles;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z10) {
        this.isCache = z10;
    }

    public final void setConfig(HtmlVideoPlayerConfig htmlVideoPlayerConfig) {
        p.j(htmlVideoPlayerConfig, "<set-?>");
        this.config = htmlVideoPlayerConfig;
    }

    public final void setLoadTimeout(long j10) {
        this.loadTimeout = j10;
    }

    public final void setOmidTrackers(List<HtmlOmidTracker> list) {
        p.j(list, "<set-?>");
        this.omidTrackers = list;
    }

    public final void setVideoFiles(List<HtmlVideoFile> list) {
        p.j(list, "<set-?>");
        this.videoFiles = list;
    }
}
