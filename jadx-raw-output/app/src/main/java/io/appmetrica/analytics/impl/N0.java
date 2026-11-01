package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class N0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f55597b;

    public N0(C4558u1 c4558u1, String str) {
        this.f55597b = c4558u1;
        this.f55596a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f55597b.d().f57105b.a(this.f55596a, false);
    }
}
