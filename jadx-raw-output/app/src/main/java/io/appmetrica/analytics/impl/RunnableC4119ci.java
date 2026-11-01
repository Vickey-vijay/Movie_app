package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC4119ci implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56522a;

    public RunnableC4119ci(C4248hi c4248hi) {
        this.f56522a = c4248hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56522a;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).sendEventsBuffer();
    }
}
