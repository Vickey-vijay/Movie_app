package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4475qh extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4575ui f57572b;

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        return this.f57572b.a(q10, new C4550ti());
    }

    public C4475qh(Y4 y10) {
        super(y10);
        this.f57572b = new C4575ui(new C4367m9(y10), y10);
    }
}
