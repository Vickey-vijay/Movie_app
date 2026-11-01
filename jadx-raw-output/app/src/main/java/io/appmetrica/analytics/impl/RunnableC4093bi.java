package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC4093bi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f56424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56425b;

    public RunnableC4093bi(C4248hi c4248hi, V v10) {
        this.f56425b = c4248hi;
        this.f56424a = v10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56425b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).a(this.f56424a);
    }
}
