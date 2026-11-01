package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class Kd implements InterfaceC3422d0<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3657q1 f26937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f26938b;

    public Kd(InterfaceC3657q1 interfaceC3657q1, Executor executor) {
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(executor, "callbackExecutor");
        this.f26937a = interfaceC3657q1;
        this.f26938b = executor;
    }

    @Override // com.ironsource.InterfaceC3422d0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(O9 o10, W1 w10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(w10, "auctionDataReporter");
        return new RewardedAd(new Nd(o10, new C3404c0(new Bc()), w10, this.f26937a, null, null, null, null, Ld.f27007a, 240, null));
    }
}
