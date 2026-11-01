package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4115ce implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56514a;

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Object obj) {
        if (obj != null) {
            return new ro(this, true, "");
        }
        return new ro(this, false, this.f56514a + " is null.");
    }

    public C4115ce(@NonNull String str) {
        this.f56514a = str;
    }

    @NonNull
    public final String a() {
        return this.f56514a;
    }
}
