package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4448pf implements Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4064af f57509a;

    @VisibleForTesting
    public C4448pf(C4064af c4064af) {
        this.f57509a = c4064af;
    }

    @Override // io.appmetrica.analytics.impl.Ti
    public final boolean a() {
        return this.f57509a.i();
    }

    @Override // io.appmetrica.analytics.impl.Ti
    public final void b() {
        this.f57509a.h().b();
    }

    public C4448pf() {
        this(C4418oa.k().y());
    }
}
