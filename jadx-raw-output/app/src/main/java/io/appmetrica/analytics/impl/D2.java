package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D2 implements InterfaceC4567ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55129a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4567ua
    @NonNull
    public abstract /* synthetic */ Nn a(@Nullable Object obj);

    @VisibleForTesting(otherwise = 4)
    public final int a() {
        return this.f55129a;
    }

    public D2(int i10) {
        this.f55129a = i10;
    }
}
