package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4371md extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4421od f57272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f57273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f57274c;

    public C4371md(C4421od c4421od, String str, byte[] bArr) {
        this.f57272a = c4421od;
        this.f57273b = str;
        this.f57274c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4421od.a(this.f57272a).setSessionExtra(this.f57273b, this.f57274c);
    }
}
