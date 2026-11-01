package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: loaded from: classes8.dex */
public class T7 extends AbstractC3309xg {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f23552m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T7(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, InterfaceC3028m9 interfaceC3028m9) {
        super(viewabilityConfig, b10, interfaceC3028m9);
        ck.p.j(C3126q7.f25145k, "visibilityChecker");
        this.f23552m = 1000;
    }

    @Override // com.inmobi.media.Sn
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f25726l;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.f23552m;
    }
}
