package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4526sj implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f57684a;

    public C4526sj(Throwable th2) {
        this.f57684a = th2;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa2) {
        sa2.reportUnhandledException(this.f57684a);
    }
}
