package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class L implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f55491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f55492b;

    public L(N n10, Context context) {
        this.f55492b = n10;
        this.f55491a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f55492b.f55595a.a(this.f55491a);
    }
}
