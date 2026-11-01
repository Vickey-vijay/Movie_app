package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.ironsource.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3732u9 implements InterfaceC3422d0<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3657q1 f31402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f31403b;

    public C3732u9(InterfaceC3657q1 interfaceC3657q1, Executor executor) {
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(executor, "callbackExecutor");
        this.f31402a = interfaceC3657q1;
        this.f31403b = executor;
    }

    @Override // com.ironsource.InterfaceC3422d0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(O9 o10, W1 w10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(w10, "auctionDataReporter");
        return new InterstitialAd(new C3766w9(o10, new C3404c0(new Bc()), w10, this.f31402a, null, null, null, null, C3749v9.f31457a, 240, null));
    }
}
