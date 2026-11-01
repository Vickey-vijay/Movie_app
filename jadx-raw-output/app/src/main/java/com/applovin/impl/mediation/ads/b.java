package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.f8;
import com.applovin.impl.g8;

/* JADX INFO: loaded from: classes10.dex */
public class b implements g8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d3 f8132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g8 f8133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f8 f8134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0040a f8135e;

    public void a() {
        this.f8133c.b();
    }

    private void a(long j10) {
        if (this.f8132b.v0().compareAndSet(false, true)) {
            this.f8131a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8131a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f8131a.X().processViewabilityAdImpressionPostback(this.f8132b, j10, this.f8135e);
        }
    }

    public d3 b() {
        return this.f8132b;
    }

    public void c() {
        this.f8131a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8131a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f8132b.u0().compareAndSet(false, true)) {
            this.f8131a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8131a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f8132b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f8131a.f().a(this.f8132b);
            }
            this.f8131a.X().processRawAdImpression(this.f8132b, this.f8135e);
        }
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f8134d.a(this.f8132b));
    }

    public b(d3 d3Var, ViewGroup viewGroup, a.InterfaceC0040a interfaceC0040a, com.applovin.impl.sdk.k kVar) {
        this.f8131a = kVar;
        this.f8132b = d3Var;
        this.f8135e = interfaceC0040a;
        this.f8134d = new f8(viewGroup, kVar);
        g8 g8Var = new g8(viewGroup, kVar, this);
        this.f8133c = g8Var;
        g8Var.a(d3Var);
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }
}
