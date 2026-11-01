package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class E2 implements D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3657q1 f26431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f26432b;

    public E2(InterfaceC3657q1 interfaceC3657q1, Executor executor) {
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(executor, "callbackExecutor");
        this.f26431a = interfaceC3657q1;
        this.f26432b = executor;
    }

    @Override // com.ironsource.D2
    public BannerAdView a(O9 o10, C3555k8 c3555k8, W1 w10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(c3555k8, "adContainer");
        ck.p.j(w10, "auctionDataReporter");
        return new BannerAdView(new P2(o10, c3555k8, w10, this.f26431a, null, null, null, null, 240, null));
    }
}
