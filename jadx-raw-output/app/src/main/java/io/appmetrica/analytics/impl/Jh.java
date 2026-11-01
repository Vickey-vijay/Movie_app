package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class Jh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f55431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55432d;

    public Jh(C4248hi c4248hi, String str, String str2, Throwable th2) {
        this.f55432d = c4248hi;
        this.f55429a = str;
        this.f55430b = str2;
        this.f55431c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55432d;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportError(this.f55429a, this.f55430b, this.f55431c);
    }
}
