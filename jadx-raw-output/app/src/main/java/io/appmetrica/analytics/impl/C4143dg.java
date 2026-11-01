package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4143dg implements InterfaceC4548tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4194fg f56596a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4548tg
    @WorkerThread
    public final void a(C4424og c4424og) {
        C4194fg c4194fg = this.f56596a;
        C4194fg.a(c4194fg, c4424og, (Xf) c4194fg.f56769e.getValue());
    }

    public C4143dg(C4194fg c4194fg) {
        this.f56596a = c4194fg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4548tg
    @WorkerThread
    public final void a(Throwable th2) {
        C4194fg c4194fg = this.f56596a;
        C4194fg.a(c4194fg, null, (Xf) c4194fg.f56769e.getValue());
    }
}
