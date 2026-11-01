package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4396nd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57341a;

    public C4396nd(String str) {
        this.f57341a = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4682z0 c4682z0 = C4105c4.l().f56451p;
        String str = this.f57341a;
        c4682z0.getClass();
        C4657y0.c().a(str);
    }
}
