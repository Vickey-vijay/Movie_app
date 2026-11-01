package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class Ih implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f55353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55354c;

    public Ih(C4248hi c4248hi, String str, Throwable th2) {
        this.f55354c = c4248hi;
        this.f55352a = str;
        this.f55353b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55354c;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportError(this.f55352a, this.f55353b);
    }
}
