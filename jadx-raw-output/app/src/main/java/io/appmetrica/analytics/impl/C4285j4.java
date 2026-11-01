package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4285j4 {
    public static InterfaceC4234h4 a(Q3 q10) {
        switch (AbstractC4260i4.f56943a[q10.f55772e.ordinal()]) {
            case 1:
                return new C4087bc();
            case 2:
                return new C4300jj();
            case 3:
                return new C4377mj();
            case 4:
                return new Dh(new Fh());
            case 5:
                return new Dh(new Vj());
            case 6:
                return new C4370mc();
            case 7:
                return new C4370mc();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
