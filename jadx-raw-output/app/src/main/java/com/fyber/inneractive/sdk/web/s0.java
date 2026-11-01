package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f18756a;

    public s0(v0 v0Var) {
        this.f18756a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18756a.f18781u.compareAndSet(false, true)) {
            this.f18756a.d("onCancelResult(true);");
            this.f18756a.f18782v.set(false);
        }
    }
}
