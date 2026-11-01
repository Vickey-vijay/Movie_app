package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class T extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f55883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hi f55884b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u10, Hi hi2) {
        super(0);
        this.f55883a = u10;
        this.f55884b = hi2;
    }

    @Override // bk.a
    public final Object invoke() {
        U u10 = this.f55883a;
        N n10 = u10.f55948h;
        Context context = u10.f55941a;
        Hi hi2 = this.f55884b;
        n10.getClass();
        return N.a(new M(n10, context, hi2));
    }
}
