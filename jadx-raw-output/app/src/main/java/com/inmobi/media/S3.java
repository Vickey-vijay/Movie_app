package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class S3 extends T7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f23486n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(AdConfig.ViewabilityConfig viewabilityConfig, InterfaceC3028m9 interfaceC3028m9) {
        super(viewabilityConfig, (byte) 1, interfaceC3028m9);
        ck.p.j(C3126q7.f25145k, "visibilityChecker");
        this.f23486n = 500;
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.Sn
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f25726l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.f23486n;
    }
}
