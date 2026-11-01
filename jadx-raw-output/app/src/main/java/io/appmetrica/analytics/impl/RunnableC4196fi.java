package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC4196fi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56773b;

    public RunnableC4196fi(C4248hi c4248hi, String str) {
        this.f56773b = c4248hi;
        this.f56772a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56773b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportEvent(this.f56772a);
    }
}
