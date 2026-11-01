package io.appmetrica.analytics.impl;

import android.app.Service;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4557u0 implements A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f57742a;

    public final void a(int i10) {
        this.f57742a.stopSelf(i10);
    }

    public C4557u0(Service service) {
        this.f57742a = service;
    }
}
