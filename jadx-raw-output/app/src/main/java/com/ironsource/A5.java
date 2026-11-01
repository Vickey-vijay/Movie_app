package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class A5 implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f25929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A9 f25930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3657q1 f25931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IronSourceError f25932d;

    public A5(InterstitialAdRequest interstitialAdRequest, A9 a10, InterfaceC3657q1 interfaceC3657q1, IronSourceError ironSourceError) {
        ck.p.j(interstitialAdRequest, "adRequest");
        ck.p.j(a10, "adLoadTaskListener");
        ck.p.j(interfaceC3657q1, "analytics");
        ck.p.j(ironSourceError, "error");
        this.f25929a = interstitialAdRequest;
        this.f25930b = a10;
        this.f25931c = interfaceC3657q1;
        this.f25932d = ironSourceError;
    }

    public final IronSourceError a() {
        return this.f25932d;
    }

    @Override // com.ironsource.Cb
    public void start() {
        C3762w5 c3762w5 = new C3762w5(this.f25931c, this.f25929a.getAdId$mediationsdk_release(), this.f25929a.getProviderName$mediationsdk_release());
        c3762w5.a();
        c3762w5.a(this.f25932d);
        this.f25930b.b(this.f25932d);
    }
}
