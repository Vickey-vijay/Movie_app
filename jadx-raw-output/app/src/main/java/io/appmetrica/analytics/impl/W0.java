package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class W0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56046a;

    public W0(C4558u1 c4558u1) {
        this.f56046a = c4558u1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f56046a).sendEventsBuffer();
    }
}
