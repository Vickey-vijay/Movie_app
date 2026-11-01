package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Q extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f55761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u10) {
        super(0);
        this.f55761a = u10;
    }

    @Override // bk.a
    public final Object invoke() {
        U u10 = this.f55761a;
        N n10 = u10.f55946f;
        Context context = u10.f55941a;
        n10.getClass();
        return N.a(new L(n10, context));
    }
}
