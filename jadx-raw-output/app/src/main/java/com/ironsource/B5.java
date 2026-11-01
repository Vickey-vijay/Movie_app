package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class B5 implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RewardedAdRequest f26044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rd f26045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3657q1 f26046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IronSourceError f26047d;

    public B5(RewardedAdRequest rewardedAdRequest, Rd rd2, InterfaceC3657q1 interfaceC3657q1, IronSourceError ironSourceError) {
        ck.p.j(rewardedAdRequest, "adRequest");
        ck.p.j(rd2, "adLoadTaskListener");
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(ironSourceError, "error");
        this.f26044a = rewardedAdRequest;
        this.f26045b = rd2;
        this.f26046c = interfaceC3657q1;
        this.f26047d = ironSourceError;
    }

    public final IronSourceError a() {
        return this.f26047d;
    }

    @Override // com.ironsource.Cb
    public void start() {
        C3762w5 c3762w5 = new C3762w5(this.f26046c, this.f26044a.getAdId$mediationsdk_release(), this.f26044a.getProviderName$mediationsdk_release());
        c3762w5.a();
        c3762w5.a(this.f26047d);
        this.f26045b.b(this.f26047d);
    }
}
