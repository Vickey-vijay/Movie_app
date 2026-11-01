package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.m1;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i10, int i11, boolean z10, h1 h1Var, int i12, int i13, int i14, int i15) {
        if (h1Var == null) {
            return null;
        }
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int iMin = Math.min(i12, i14) - com.fyber.inneractive.sdk.util.o.b(i15 * 2);
            h1Var.f18583a = iMin;
            h1Var.f18584b = iMin;
        } else if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int iMin2 = Math.min(i12, i14) - com.fyber.inneractive.sdk.util.o.b(i15 * 2);
            h1Var.f18583a = iMin2;
            h1Var.f18584b = (iMin2 * 9) / 16;
        } else if (unitDisplayType == UnitDisplayType.MRECT) {
            h1Var.f18583a = com.fyber.inneractive.sdk.util.o.b(com.safedk.android.internal.d.f44769a);
            h1Var.f18584b = com.fyber.inneractive.sdk.util.o.b(250);
        } else if (unitDisplayType == UnitDisplayType.DEFAULT && z10) {
            m1.a(unitDisplayType, h1Var, i10, i11, i12, i13);
        } else {
            h1Var.f18583a = 0;
            h1Var.f18584b = 0;
        }
        return h1Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i10, int i11, h1 h1Var, int i12, ViewGroup viewGroup) {
        h1 h1Var2 = new h1(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int i13 = h1Var.f18583a;
            m1.a(unitDisplayType, h1Var2, i10, i11, i13, i13);
        } else {
            m1.a(unitDisplayType, h1Var2, i10, i11, h1Var.f18583a, h1Var.f18584b);
        }
        return h1Var2;
    }
}
