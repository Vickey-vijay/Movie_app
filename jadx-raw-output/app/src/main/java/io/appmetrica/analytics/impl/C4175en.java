package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4175en implements Mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mn f56697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f56698b;

    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final Object a(@Nullable Object obj) {
        return obj != this.f56697a.a(obj) ? this.f56698b : obj;
    }

    public C4175en(@NonNull Mn mn2, @Nullable Object obj) {
        this.f56697a = mn2;
        this.f56698b = obj;
    }
}
