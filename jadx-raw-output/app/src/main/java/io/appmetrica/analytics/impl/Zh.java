package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes8.dex */
public final class Zh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rn f56289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56290b;

    public Zh(C4248hi c4248hi, Rn rn2) {
        this.f56290b = c4248hi;
        this.f56289a = rn2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56290b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).a(this.f56289a);
    }
}
