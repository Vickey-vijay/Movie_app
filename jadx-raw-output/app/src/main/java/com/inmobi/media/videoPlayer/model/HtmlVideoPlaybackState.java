package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import ck.p;
import com.inmobi.media.EnumC2952j8;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class HtmlVideoPlaybackState {
    private float duration;
    private boolean isMuted;
    private Long latency;
    private String state;
    private float time;
    private String videoUrl;

    public final float getDuration() {
        return this.duration;
    }

    public final Long getLatency() {
        return this.latency;
    }

    public final String getState() {
        return this.state;
    }

    public final float getTime() {
        return this.time;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final void setDuration(float f10) {
        this.duration = f10;
    }

    public final void setLatency(Long l10) {
        this.latency = l10;
    }

    public final void setMuted(boolean z10) {
        this.isMuted = z10;
    }

    public final void setState(String str) {
        p.j(str, "<set-?>");
        this.state = str;
    }

    public final void setTime(float f10) {
        this.time = f10;
    }

    public final void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public HtmlVideoPlaybackState() {
        EnumC2952j8[] enumC2952j8Arr = EnumC2952j8.f24596a;
        this.state = "loading";
    }
}
