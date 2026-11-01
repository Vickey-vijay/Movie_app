package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class Lh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55521a;

    public Lh(C4248hi c4248hi) {
        this.f55521a = c4248hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55521a;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).resumeSession();
    }
}
