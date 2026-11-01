package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f55714b;

    public P0(C4558u1 c4558u1, String str) {
        this.f55714b = c4558u1;
        this.f55713a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f55714b).c(this.f55713a);
    }
}
