package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4533t1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f57695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57696b;

    public RunnableC4533t1(C4558u1 c4558u1, Throwable th2) {
        this.f57696b = c4558u1;
        this.f57695a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57696b).reportUnhandledException(this.f57695a);
    }
}
