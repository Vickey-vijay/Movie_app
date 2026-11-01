package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4377mj implements InterfaceC4234h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4234h4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4274ij a(Context context, C4157e5 c4157e5, Q3 q10, C4462q4 c4462q4) {
        Cg cg2;
        R4 r10 = new R4(q10.f55769b, q10.f55768a);
        synchronized (c4157e5) {
            cg2 = (Cg) c4157e5.f56636a.get(r10.toString());
        }
        return new C4274ij(cg2);
    }
}
