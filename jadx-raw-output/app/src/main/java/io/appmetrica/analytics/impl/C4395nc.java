package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4395nc extends AbstractC4177f {
    @Override // io.appmetrica.analytics.impl.AbstractC4177f
    public final void b(@NonNull Q5 q10, @NonNull C4462q4 c4462q4) {
        boolean zBooleanValue = ((Boolean) WrapUtils.getOrDefault(c4462q4.f57545b.f57476b, Boolean.FALSE)).booleanValue();
        Lb lbM = C4418oa.I.m();
        lbM.a(zBooleanValue);
        lbM.a(c4462q4.f57545b.f57477c);
        Boolean bool = c4462q4.f57545b.f57488n;
        if (bool != null) {
            C4418oa.I.c().b(bool.booleanValue());
        }
        this.f56703b.a(q10, c4462q4);
    }

    public C4395nc(Context context, Cg cg2) {
        super(context, cg2);
    }
}
