package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4276il implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4682z0 f56977a;

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Void r10) {
        this.f56977a.getClass();
        return C4682z0.a() ? new ro(this, true, "") : new ro(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public C4276il(@NonNull C4682z0 c4682z0) {
        this.f56977a = c4682z0;
    }

    public final ro a() {
        return a((Void) null);
    }
}
