package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes11.dex */
public final class e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f18672a;

    public e1(i1 i1Var) {
        this.f18672a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f18672a.f18682b;
        if (mVar != null) {
            mVar.getViewTreeObserver().addOnPreDrawListener(this.f18672a.K);
        }
    }
}
