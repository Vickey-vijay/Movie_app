package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4508s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f57641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f57642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57643d;

    public RunnableC4508s1(C4558u1 c4558u1, String str, String str2, Throwable th2) {
        this.f57643d = c4558u1;
        this.f57640a = str;
        this.f57641b = str2;
        this.f57642c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57643d).reportError(this.f57640a, this.f57641b, this.f57642c);
    }
}
