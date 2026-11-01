package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4089be f55764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4689z7 f55765b;

    public Q1(S1 s10, C4689z7 c4689z7) {
        this.f55764a = s10;
        this.f55765b = c4689z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f55764a.consume(this.f55765b);
    }
}
