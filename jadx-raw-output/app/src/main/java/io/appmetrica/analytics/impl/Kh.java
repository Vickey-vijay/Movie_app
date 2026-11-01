package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class Kh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f55470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55471b;

    public Kh(C4248hi c4248hi, Throwable th2) {
        this.f55471b = c4248hi;
        this.f55470a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55471b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportUnhandledException(this.f55470a);
    }
}
