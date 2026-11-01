package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class RunnableC4205g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56793c;

    public RunnableC4205g1(C4558u1 c4558u1, String str, String str2) {
        this.f56793c = c4558u1;
        this.f56791a = str;
        this.f56792b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4682z0 c4682z0 = this.f56793c.f57743a;
        String str = this.f56791a;
        String str2 = this.f56792b;
        c4682z0.getClass();
        C4657y0.c().putAppEnvironmentValue(str, str2);
    }
}
