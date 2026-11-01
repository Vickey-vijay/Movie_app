package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1768Zv extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1977dL A07;
    public final KE A08;
    public final C1791aK A09;

    public static String A0d(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0e() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0h(int i10);

    static {
        A0e();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1768Zv(C1977dL c1977dL, KE ke2, int i10, C1440My c1440My, boolean z10, String str, US us, InterfaceC1708Xn interfaceC1708Xn, C2050eX c2050eX, XH xh2, N3 n10, boolean z11, String str2) {
        super(c1977dL);
        this.A02 = A0d(0, 0, 37);
        XP.A0I(this);
        this.A07 = c1977dL;
        this.A04 = i10;
        this.A03 = z11;
        this.A02 = str2;
        this.A09 = new C1791aK(c1977dL);
        XP.A0K(this.A09, 0);
        XP.A0I(this.A09);
        if (z11) {
            this.A00 = new LinearLayout(c1977dL);
            this.A01 = new TextView(c1977dL);
            XP.A0I(this.A01);
        }
        if (ke2 == null) {
            this.A08 = new KE(c1977dL, str, c1440My, z10, us, interfaceC1708Xn, c2050eX, xh2, n10);
        } else {
            this.A08 = ke2;
        }
        XP.A0E(1001, this.A08);
        this.A05 = AbstractC1802aV.A03(this.A08, A0d(0, 9, 52));
        this.A06 = new RelativeLayout(c1977dL);
        this.A06.setLayoutParams(A0B);
        XP.A0I(this.A06);
    }

    public void A0f() {
    }

    public void A0g() {
        this.A09.setOnClickListener(this.A05);
    }

    public final KE getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C1438Mw c1438Mw, C1441Mz c1441Mz, String str, String str2, InterfaceC1690Wv interfaceC1690Wv, InterfaceC1777a4 interfaceC1777a4) {
        this.A08.setCta(c1441Mz, str, new HashMap(), interfaceC1690Wv, interfaceC1777a4);
        new KZ(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
