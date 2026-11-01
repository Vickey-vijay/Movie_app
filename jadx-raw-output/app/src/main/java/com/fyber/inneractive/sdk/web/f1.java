package com.fyber.inneractive.sdk.web;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f18675a;

    public f1(i1 i1Var) {
        this.f18675a = i1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        m mVar;
        m mVar2 = this.f18675a.f18682b;
        if (mVar2 == null) {
            return false;
        }
        mVar2.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f18675a.k();
        i1 i1Var = this.f18675a;
        i1Var.a(new com.fyber.inneractive.sdk.mraid.b0(i1Var.G));
        i1 i1Var2 = this.f18675a;
        if (i1Var2.G == c0.INTERSTITIAL && (mVar = i1Var2.f18682b) != null) {
            mVar.a("if (window.showInterstitial) { showInterstitial(); }");
        }
        this.f18675a.j();
        i1 i1Var3 = this.f18675a;
        i1Var3.a(com.fyber.inneractive.sdk.util.o.a(i1Var3.f18682b), true);
        this.f18675a.n();
        com.fyber.inneractive.sdk.util.r.f18607b.postDelayed(this.f18675a.L, 100L);
        return false;
    }
}
