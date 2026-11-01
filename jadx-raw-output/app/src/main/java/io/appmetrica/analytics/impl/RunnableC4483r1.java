package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4483r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f57589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57590c;

    public RunnableC4483r1(C4558u1 c4558u1, String str, Throwable th2) {
        this.f57590c = c4558u1;
        this.f57588a = str;
        this.f57589b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57590c).reportError(this.f57588a, this.f57589b);
    }
}
