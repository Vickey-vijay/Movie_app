package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2140g0 extends QK {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(AbstractC1524Qg abstractC1524Qg);

    public abstract boolean A0Y(AbstractC1524Qg abstractC1524Qg);

    public abstract boolean A0Z(AbstractC1524Qg abstractC1524Qg, int i10, int i11, int i12, int i13);

    public abstract boolean A0a(AbstractC1524Qg abstractC1524Qg, AbstractC1524Qg abstractC1524Qg2, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0N(AbstractC1524Qg abstractC1524Qg) {
        return !this.A00 || abstractC1524Qg.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0O(AbstractC1524Qg abstractC1524Qg, QJ qj2, QJ qj3) {
        if (qj2 != null && (qj2.A01 != qj3.A01 || qj2.A03 != qj3.A03)) {
            return A0Z(abstractC1524Qg, qj2.A01, qj2.A03, qj3.A01, qj3.A03);
        }
        return A0X(abstractC1524Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0P(AbstractC1524Qg abstractC1524Qg, QJ qj2, QJ qj3) {
        int i10 = qj2.A01;
        int oldLeft = qj2.A03;
        View view = abstractC1524Qg.A0H;
        int oldTop = qj3 == null ? view.getLeft() : qj3.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top2 = qj3 == null ? view.getTop() : qj3.A03;
        if (!abstractC1524Qg.A0g() && (i10 != oldTop || oldLeft != top2)) {
            view.layout(oldTop, top2, view.getWidth() + oldTop, view.getHeight() + top2);
            return A0Z(abstractC1524Qg, i10, oldLeft, oldTop, top2);
        }
        return A0Y(abstractC1524Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0Q(AbstractC1524Qg abstractC1524Qg, QJ qj2, QJ qj3) {
        if (qj2.A01 != qj3.A01 || qj2.A03 != qj3.A03) {
            return A0Z(abstractC1524Qg, qj2.A01, qj2.A03, qj3.A01, qj3.A03);
        }
        A0U(abstractC1524Qg);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0R(AbstractC1524Qg abstractC1524Qg, AbstractC1524Qg abstractC1524Qg2, QJ qj2, QJ qj3) {
        int i10;
        int i11;
        int i12 = qj2.A01;
        int i13 = qj2.A03;
        if (abstractC1524Qg2.A0l()) {
            i10 = qj2.A01;
            i11 = qj2.A03;
        } else {
            i10 = qj3.A01;
            i11 = qj3.A03;
        }
        return A0a(abstractC1524Qg, abstractC1524Qg2, i12, i13, i10, i11);
    }

    public final void A0T(AbstractC1524Qg abstractC1524Qg) {
        A0K(abstractC1524Qg);
    }

    public final void A0U(AbstractC1524Qg abstractC1524Qg) {
        A0K(abstractC1524Qg);
    }

    public final void A0V(AbstractC1524Qg abstractC1524Qg) {
        A0K(abstractC1524Qg);
    }

    public final void A0W(AbstractC1524Qg abstractC1524Qg, boolean z10) {
        A0K(abstractC1524Qg);
    }
}
