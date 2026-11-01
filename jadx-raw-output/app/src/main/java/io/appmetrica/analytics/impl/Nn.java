package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Nn implements InterfaceC4104c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Object f55658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC4104c3 f55659b;

    @Override // io.appmetrica.analytics.impl.InterfaceC4104c3
    public final int getBytesTruncated() {
        return this.f55659b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.f55658a + ", metaInfo=" + this.f55659b + '}';
    }

    public Nn(@Nullable Object obj, @NonNull InterfaceC4104c3 interfaceC4104c3) {
        this.f55658a = obj;
        this.f55659b = interfaceC4104c3;
    }
}
