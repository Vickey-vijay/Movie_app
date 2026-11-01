package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes7.dex */
public final class Yf implements InterfaceC4548tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4194fg f56249a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4548tg
    @WorkerThread
    public final void a(C4424og c4424og) {
        C4194fg c4194fg = this.f56249a;
        C4194fg.a(c4194fg, c4424og, (Xf) c4194fg.f56768d.getValue());
    }

    public Yf(C4194fg c4194fg) {
        this.f56249a = c4194fg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4548tg
    @WorkerThread
    public final void a(Throwable th2) {
        C4194fg c4194fg = this.f56249a;
        C4194fg.a(c4194fg, null, (Xf) c4194fg.f56768d.getValue());
    }
}
