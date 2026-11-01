package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: loaded from: classes7.dex */
public final class X0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f56125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f56126b;

    public X0(C4558u1 c4558u1, Revenue revenue) {
        this.f56126b = c4558u1;
        this.f56125a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f56126b).reportRevenue(this.f56125a);
    }
}
