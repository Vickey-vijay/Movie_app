package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4300jj implements InterfaceC4234h4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4234h4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4274ij a(Context context, C4157e5 c4157e5, Q3 q10, C4462q4 c4462q4) {
        Cg cg2;
        C4420oc c4420oc = new C4420oc(q10.f55769b, q10.f55768a);
        synchronized (c4157e5) {
            cg2 = (Cg) c4157e5.f56636a.get(c4420oc.toString());
        }
        return new C4274ij(cg2);
    }
}
