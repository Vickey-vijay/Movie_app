package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f18748a;

    public r0(v0 v0Var) {
        this.f18748a = v0Var;
    }

    public final void a(boolean z10) {
        if (this.f18748a.f18781u.compareAndSet(false, true)) {
            this.f18748a.d("onCancelResult(" + z10 + ");");
            this.f18748a.f18782v.set(false);
        }
    }
}
