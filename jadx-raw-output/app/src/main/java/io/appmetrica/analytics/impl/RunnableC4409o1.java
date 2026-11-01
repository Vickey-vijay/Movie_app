package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4409o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57375b;

    public RunnableC4409o1(C4558u1 c4558u1, String str) {
        this.f57375b = c4558u1;
        this.f57374a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57375b).reportEvent(this.f57374a);
    }
}
