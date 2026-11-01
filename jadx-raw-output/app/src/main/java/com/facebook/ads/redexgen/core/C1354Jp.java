package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1354Jp extends AbstractC1811ae implements Wf {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC2252hy A00;
    public final C1676Wh A01;
    public final InterfaceC1708Xn A02;
    public final C1843bA A03;
    public final C1943cm A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, ExifInterface.START_CODE, 30, 36, 34};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C1354Jp(C1815ai c1815ai, boolean z10) {
        int id2;
        int iA01;
        super(c1815ai, z10);
        this.A02 = c1815ai.A0D();
        this.A00 = c1815ai.A05();
        this.A03 = new C1843bA(c1815ai.A06(), c1815ai.A02());
        this.A03.A01(getTitleDescContainer(), z10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC1811ae.A07, AbstractC1811ae.A07, AbstractC1811ae.A07, AbstractC1811ae.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c1815ai.A0I()) {
            this.A04 = new C1943cm(c1815ai.A06());
            this.A04.setPageDetails(c1815ai.A05().A23());
            XP.A0E(1007, this.A04);
            RelativeLayout.LayoutParams pageDetailsParams = new RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(AbstractC1811ae.A07, AbstractC1811ae.A07 - (AbstractC1811ae.A07 / 2), AbstractC1811ae.A07, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id2 = this.A04.getId();
            iA01 = c1815ai.A01() - (AbstractC1811ae.A07 / 2);
        } else {
            id2 = getCtaButton().getId();
            iA01 = c1815ai.A01();
            this.A04 = null;
        }
        FrameLayout insideContainerLayout = new FrameLayout(c1815ai.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id2);
        layoutParams2.setMargins(0, iA01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC1811ae.A07, 0, AbstractC1811ae.A07, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0F(c1815ai.A05(), c1815ai.A0C());
        View viewA02 = c1815ai.A02();
        this.A01 = C1676Wh.A00(c1815ai.A06(), this.A00, this);
        C1675Wg c1675WgA02 = this.A01.A02(this.A00);
        c1815ai.A06().A0H().A00(c1675WgA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (viewA02 != null && c1675WgA02.A00) {
            viewA02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ao
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1O(view);
                }
            });
        } else if (viewA02 != null && U7.A1I(getAdContextWrapper())) {
            AbstractC1765Zs.A00(viewA02, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC1822ap(this));
        }
        if (U7.A17(c1815ai.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c1815ai.A0C() != null) {
                c1815ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && U7.A18(c1815ai.A06())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1811ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1811ae
    public final boolean A0D() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1811ae
    public final void A1B() {
        super.A1B();
        this.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1811ae
    public final void A1G(C1431Mp c1431Mp, String str, double d10, Bundle bundle) {
        super.A1G(c1431Mp, str, d10, bundle);
        if (d10 > 0.0d) {
            int mediaHeight = (int) (((double) (A06 - (AbstractC1811ae.A07 * 2))) / d10);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1811ae
    public final boolean A1M() {
        return false;
    }

    public final /* synthetic */ void A1O(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
