package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.mraid.e f18673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f18674b;

    public f0(i0 i0Var, com.fyber.inneractive.sdk.mraid.e eVar) {
        this.f18674b = i0Var;
        this.f18673a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return this.f18673a.c();
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
        com.fyber.inneractive.sdk.mraid.e eVar = this.f18673a;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return this.f18673a.f15973a;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar = ((IAmraidWebViewController) this.f18674b).I;
        if (eVar != null) {
            eVar.a();
        }
        this.f18673a.a();
    }

    public final String toString() {
        return "action = " + this.f18673a.f15973a + " url = " + this.f18673a.c();
    }
}
