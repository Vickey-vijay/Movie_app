package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54428b;

    public A(int i10, int i11) {
        this.f54427a = i10;
        this.f54428b = i11;
    }

    public final String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.f54427a + ", firstCollectingInappMaxAgeSeconds=" + this.f54428b + ')';
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
