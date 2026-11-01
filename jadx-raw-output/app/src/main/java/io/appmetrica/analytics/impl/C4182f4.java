package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4182f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f56710a;

    public C4182f4() {
        this(new SystemTimeProvider());
    }

    public C4182f4(SystemTimeProvider systemTimeProvider) {
        this.f56710a = systemTimeProvider;
    }

    public final void a() {
        this.f56710a.elapsedRealtime();
    }
}
