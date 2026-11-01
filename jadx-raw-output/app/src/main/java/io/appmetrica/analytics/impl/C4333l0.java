package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4333l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f57158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57159b;

    public final String toString() {
        return "AppMetricaConfigExtension(autoCollectedDataSubscribers=" + this.f57158a + ", needClearEnvironment=" + this.f57159b + ')';
    }

    public C4333l0(List list, boolean z10) {
        this.f57158a = list;
        this.f57159b = z10;
    }
}
