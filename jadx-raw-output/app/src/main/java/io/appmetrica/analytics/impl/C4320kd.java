package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4320kd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4421od f57106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f57107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f57108c;

    public C4320kd(C4421od c4421od, int i10, String str) {
        this.f57106a = c4421od;
        this.f57107b = i10;
        this.f57108c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4421od.a(this.f57106a).a(new G9(this.f57107b, this.f57108c));
    }
}
