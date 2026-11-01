package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class In {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3348z5 f22877c;

    public In(AdConfig.VideoPlayerViewabilityConfig videoPlayerViewabilityConfig) {
        ck.p.j(videoPlayerViewabilityConfig, "viewableConfig");
        this.f22875a = videoPlayerViewabilityConfig.getMinPercentageVisible();
        this.f22876b = videoPlayerViewabilityConfig.getPollingInterval();
        this.f22877c = AbstractC2916hl.a(videoPlayerViewabilityConfig.getMinDimensions());
    }
}
