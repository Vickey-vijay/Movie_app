package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.flow.c0;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f14869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f14870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f14871c;

    public t(y yVar, c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f14871c = yVar;
        this.f14869a = c0Var;
        this.f14870b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14871c.a(this.f14869a, this.f14870b);
    }
}
