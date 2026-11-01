package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4428ok extends Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo f57451a;

    public C4428ok() {
        this(C4418oa.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final void a(int i10) {
        xo xoVar = this.f57451a;
        synchronized (xoVar) {
            zo zoVar = xoVar.f57978a;
            zoVar.a(zoVar.a().put("last_migration_api_level", i10));
        }
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final int b() {
        int iOptInt;
        xo xoVar = this.f57451a;
        synchronized (xoVar) {
            iOptInt = xoVar.f57978a.a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final SparseArray<Jc> c() {
        SparseArray<Jc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C4453pk(this.f57451a));
        sparseArray.put(115, new C4478qk());
        sparseArray.put(116, new C4552tk());
        return sparseArray;
    }

    public C4428ok(xo xoVar) {
        this.f57451a = xoVar;
    }
}
