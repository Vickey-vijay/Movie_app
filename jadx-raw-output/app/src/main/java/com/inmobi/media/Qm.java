package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class Qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fg f23413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O1 f23414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final In f23415e;

    public Qm(boolean z10, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        ck.p.j(videoExperience, "videoExperience");
        ck.p.j(nativeConfig, "nativeConfig");
        this.f23411a = z10;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.f23412b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.f23413c = new Fg(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.f23414d = new O1(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.f23415e = new In(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
