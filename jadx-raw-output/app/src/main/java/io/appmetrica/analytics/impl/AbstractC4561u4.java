package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4561u4 extends Bd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f57753f;

    public abstract void a(@NonNull C4228go c4228go);

    @NonNull
    public final Object g() {
        return this.f57753f;
    }

    public AbstractC4561u4(int i10, String str, Object obj, to toVar, K2 k10) {
        super(i10, str, toVar, k10);
        this.f57753f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Bd, io.appmetrica.analytics.impl.InterfaceC4202fo
    public final void a(@NonNull C4176eo c4176eo) {
        if (f()) {
            K2 k10 = this.f55025d;
            int i10 = this.f55023b;
            C4228go c4228goA = k10.a(c4176eo, (C4228go) ((HashMap) c4176eo.f56700a.get(i10)).get(this.f55022a), this);
            if (c4228goA != null) {
                a(c4228goA);
            }
        }
    }
}
