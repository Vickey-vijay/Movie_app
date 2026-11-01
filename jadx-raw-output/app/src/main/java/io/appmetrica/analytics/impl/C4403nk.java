package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4403nk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f57363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57364b;

    public C4403nk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f57363a = systemTimeProvider;
        this.f57364b = systemTimeProvider.currentTimeMillis();
    }
}
