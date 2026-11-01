package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4275ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56976a;

    public final String toString() {
        return "ServiceDescription(packageName='" + this.f56976a + "', serviceScheme='appmetrica', serviceClass=" + AppMetricaService.class + ')';
    }

    public C4275ik(String str) {
        this.f56976a = str;
    }
}
