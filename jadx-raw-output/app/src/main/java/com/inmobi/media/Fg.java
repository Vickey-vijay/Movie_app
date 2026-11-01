package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class Fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f22650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f22651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22653f;

    public Fg(VideoExperience videoExperience, boolean z10, AdConfig.VideoPlayerProgressConfig videoPlayerProgressConfig) {
        ck.p.j(videoExperience, "videoExperience");
        ck.p.j(videoPlayerProgressConfig, "progressConfig");
        Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.f22648a = showProgress != null ? showProgress.booleanValue() : videoPlayerProgressConfig.getShowProgress();
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.f22649b = !(loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : z10);
        int[] color = videoExperience.getProgress().getColor();
        this.f22650c = color == null ? nj.b0.N0(videoPlayerProgressConfig.getForegroundColor()) : color;
        this.f22651d = nj.b0.N0(videoPlayerProgressConfig.getBackgroundColor());
        Integer height = videoExperience.getProgress().getHeight();
        this.f22652e = height != null ? height.intValue() : videoPlayerProgressConfig.getHeight();
        this.f22653f = videoPlayerProgressConfig.getProgressPolling();
    }
}
