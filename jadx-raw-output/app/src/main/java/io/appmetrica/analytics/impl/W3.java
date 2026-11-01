package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class W3 extends Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final We f56062a;

    public W3(@NonNull Context context) {
        this(new We(C4105c4.l().c(context).b(context)));
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final void a(int i10) {
        this.f56062a.c(i10);
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final int b() {
        return (int) this.f56062a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final SparseArray<Jc> c() {
        return new SparseArray<>();
    }

    public W3(We we2) {
        this.f56062a = we2;
    }
}
