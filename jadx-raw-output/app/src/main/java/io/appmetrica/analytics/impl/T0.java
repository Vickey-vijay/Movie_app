package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f55885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f55886b;

    public T0(C4558u1 c4558u1, boolean z10) {
        this.f55886b = c4558u1;
        this.f55885a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4682z0 c4682z0 = this.f55886b.f57743a;
        boolean z10 = this.f55885a;
        c4682z0.getClass();
        C4657y0.c().setDataSendingEnabled(z10);
    }
}
