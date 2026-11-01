package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4222gi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56826c;

    public RunnableC4222gi(C4248hi c4248hi, String str, String str2) {
        this.f56826c = c4248hi;
        this.f56824a = str;
        this.f56825b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56826c;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportEvent(this.f56824a, this.f56825b);
    }
}
