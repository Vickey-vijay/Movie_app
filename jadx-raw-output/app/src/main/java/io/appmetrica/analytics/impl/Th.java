package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class Th implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f55927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55928b;

    public Th(C4248hi c4248hi, boolean z10) {
        this.f55928b = c4248hi;
        this.f55927a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55928b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).setDataSendingEnabled(this.f55927a);
    }
}
