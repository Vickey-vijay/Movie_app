package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4372me implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(Boolean bool) {
        int i10;
        if (bool == null) {
            i10 = -1;
        } else if (ck.p.e(bool, Boolean.TRUE)) {
            i10 = 1;
        } else {
            if (!ck.p.e(bool, Boolean.FALSE)) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 0;
        }
        return Integer.valueOf(i10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return a(((Number) obj).intValue());
    }

    public final Boolean a(int i10) {
        if (i10 != -1) {
            if (i10 == 0) {
                return Boolean.FALSE;
            }
            if (i10 == 1) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
