package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class Dg implements P7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z4 f55141a;

    @NonNull
    @VisibleForTesting
    public final Z4 a() {
        return this.f55141a;
    }

    @Override // io.appmetrica.analytics.impl.P7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Cg a(@NonNull Context context, @NonNull R4 r10, @NonNull C4462q4 c4462q4) {
        return new Cg(context, r10, c4462q4, this.f55141a, new S4(), Il.a());
    }

    public Dg(@NonNull Z4 z10) {
        this.f55141a = z10;
    }
}
