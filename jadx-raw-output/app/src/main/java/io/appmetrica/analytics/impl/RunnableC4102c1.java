package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC4102c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f56432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f56433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56434c;

    public RunnableC4102c1(C4558u1 c4558u1, String str, String str2) {
        this.f56434c = c4558u1;
        this.f56432a = str;
        this.f56433b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4682z0 c4682z0 = this.f56434c.f57743a;
        String str = this.f56432a;
        String str2 = this.f56433b;
        c4682z0.getClass();
        C4657y0.c().a(str, str2);
    }
}
