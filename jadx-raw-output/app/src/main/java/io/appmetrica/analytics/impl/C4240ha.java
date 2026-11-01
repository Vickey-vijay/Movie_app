package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4240ha extends B4 {
    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(Q5 q10, C4586v4 c4586v4) {
        Bundle bundle = q10.f55785m;
        Ya ya2 = bundle != null ? (Ya) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null;
        if (ya2 != null) {
            if (ya2.f56243d) {
                C4437p4 c4437p4 = c4586v4.f57790b.f57999d.f54964a;
                Boolean bool = c4437p4.f57488n;
                Boolean bool2 = c4437p4.f57483i;
                C4418oa.I.c().c(bool != null ? bool.booleanValue() : true);
                C4418oa.I.h().b(bool2);
            }
        }
        this.f55001a.a(ya2);
        return false;
    }

    public C4240ha(C4661y4 c4661y4) {
        super(c4661y4);
    }
}
