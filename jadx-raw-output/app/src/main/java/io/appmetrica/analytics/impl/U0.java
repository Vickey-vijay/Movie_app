package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class U0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f55955b;

    public U0(C4558u1 c4558u1, String str) {
        this.f55955b = c4558u1;
        this.f55954a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4682z0 c4682z0 = this.f55955b.f57743a;
        String str = this.f55954a;
        c4682z0.getClass();
        C4657y0.c().setUserProfileID(str);
    }
}
