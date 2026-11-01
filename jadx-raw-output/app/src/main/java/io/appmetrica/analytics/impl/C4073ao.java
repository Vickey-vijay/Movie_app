package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4073ao extends B4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F6 f56386b;

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(@NonNull Q5 q10, @NonNull C4586v4 c4586v4) {
        C4437p4 c4437p4 = c4586v4.f57790b.f57999d.f54964a;
        this.f56386b.a(c4437p4.f57483i);
        Lb lbM = C4418oa.I.m();
        if (Boolean.TRUE.equals(c4437p4.f57476b)) {
            lbM.a(true);
        } else {
            if (Boolean.FALSE.equals(c4437p4.f57476b)) {
                lbM.a(false);
            }
        }
        lbM.a(c4437p4.f57477c);
        Boolean bool = c4437p4.f57488n;
        C4418oa.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }

    public C4073ao(@NonNull C4661y4 c4661y4, @NonNull F6 f10) {
        super(c4661y4);
        this.f56386b = f10;
    }
}
