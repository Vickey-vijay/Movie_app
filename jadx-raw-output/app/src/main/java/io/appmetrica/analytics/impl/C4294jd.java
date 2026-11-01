package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4294jd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4421od f57016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f57017b;

    public C4294jd(C4421od c4421od, ModuleEvent moduleEvent) {
        this.f57016a = c4421od;
        this.f57017b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4421od.a(this.f57016a).reportEvent(this.f57017b);
    }
}
