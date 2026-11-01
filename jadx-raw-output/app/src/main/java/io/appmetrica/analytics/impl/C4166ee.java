package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4166ee {
    public static final B9 a(C4166ee c4166ee, K9 k10) {
        int i10;
        c4166ee.getClass();
        B9 b10 = new B9();
        switch (k10) {
            case UNKNOWN:
                i10 = 0;
                break;
            case APPSFLYER:
                i10 = 1;
                break;
            case ADJUST:
                i10 = 2;
                break;
            case KOCHAVA:
                i10 = 3;
                break;
            case TENJIN:
                i10 = 4;
                break;
            case AIRBRIDGE:
                i10 = 5;
                break;
            case SINGULAR:
                i10 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        b10.f55013a = i10;
        return b10;
    }
}
