package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ValidationException;

/* JADX INFO: loaded from: classes5.dex */
public class Fn implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to f55245a;

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Object obj) {
        ro roVarA = this.f55245a.a(obj);
        if (roVarA.f57616a) {
            return roVarA;
        }
        throw new ValidationException(roVarA.f57617b);
    }

    public Fn(@NonNull to toVar) {
        this.f55245a = toVar;
    }

    @NonNull
    @VisibleForTesting
    public final to a() {
        return this.f55245a;
    }
}
