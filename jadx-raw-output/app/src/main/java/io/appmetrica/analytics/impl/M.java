package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class M implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f55533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hi f55534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f55535c;

    public M(N n10, Context context, Hi hi2) {
        this.f55535c = n10;
        this.f55533a = context;
        this.f55534b = hi2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f55535c.f55595a.a(this.f55533a, this.f55534b);
    }
}
