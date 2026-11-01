package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1961d4 {
    public KE A00;
    public final C1428Ml A01;
    public final C1438Mw A02;
    public final N0 A03;
    public final N9 A04;
    public final C1977dL A05;
    public final C1620Ua A06;
    public static final int A09 = (int) (AbstractC1680Wl.A02 * 4.0f);
    public static final int A07 = (int) (AbstractC1680Wl.A02 * 72.0f);
    public static final int A08 = (int) (AbstractC1680Wl.A02 * 8.0f);

    public C1961d4(C1977dL c1977dL, US us, AbstractC2252hy abstractC2252hy) {
        this.A05 = c1977dL;
        this.A06 = new C1620Ua(abstractC2252hy.A25(), us);
        this.A01 = abstractC2252hy.A1z();
        this.A02 = abstractC2252hy.A20().A0I();
        this.A04 = abstractC2252hy.A23();
        this.A03 = abstractC2252hy.A20().A0K();
    }

    private View A00(KE ke2) {
        C1797aQ c1797aQ = new C1797aQ(this.A05, this.A01.A01(), true, false, false);
        c1797aQ.A04(this.A02.A0F(), this.A02.A04(), null, false, true);
        c1797aQ.setAlignment(17);
        C1791aK c1791aK = new C1791aK(this.A05);
        XP.A0K(c1791aK, 0);
        c1791aK.setRadius(50);
        new KZ(c1791aK, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1791aK, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1797aQ, layoutParams);
        if (ke2 != null) {
            XP.A0H(ke2);
            linearLayout.addView(ke2, layoutParams);
            if (TextUtils.isEmpty(ke2.getText())) {
                XP.A0F(ke2);
            }
        }
        return linearLayout;
    }

    private C10246g A01() {
        C10246g c10246g = new C10246g(this.A05);
        c10246g.setLayoutManager(new C2157gI(this.A05, 0, false));
        c10246g.setAdapter(new C1211Eb(this.A05, this.A03.A02(), A09, this.A00));
        return c10246g;
    }

    private final EnumC1960d3 A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1960d3.A03;
        }
        return EnumC1960d3.A02;
    }

    public final Pair<EnumC1960d3, View> A03(KE ke2) {
        View viewA01;
        this.A00 = ke2;
        EnumC1960d3 enumC1960d3A02 = A02();
        switch (C1959d2.A00[enumC1960d3A02.ordinal()]) {
            case 1:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        AbstractC1622Uc.A04(viewA01, this.A06, UZ.A0S);
        return new Pair<>(enumC1960d3A02, viewA01);
    }
}
