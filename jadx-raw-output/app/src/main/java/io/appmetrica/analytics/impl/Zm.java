package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes8.dex */
public final class Zm extends AbstractC4561u4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Mn f56310g;

    public Zm(@NonNull String str, @NonNull String str2, @NonNull Mn mn2, @NonNull to toVar, @NonNull K2 k10) {
        super(0, str, str2, toVar, k10);
        this.f56310g = mn2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4561u4
    public final void a(@NonNull C4228go c4228go) {
        String str = (String) this.f56310g.a((String) this.f57753f);
        c4228go.f56868d.f56981a = str == null ? new byte[0] : str.getBytes();
    }

    @VisibleForTesting
    public final Mn h() {
        return this.f56310g;
    }
}
