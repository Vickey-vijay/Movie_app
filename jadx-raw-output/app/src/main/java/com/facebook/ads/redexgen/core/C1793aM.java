package com.facebook.ads.redexgen.core;

import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1793aM extends LinearLayout {
    public static final int A06 = (int) (AbstractC1680Wl.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1977dL A04;
    public final C1794aN[] A05;

    public C1793aM(C1977dL c1977dL, int i10, int i11, int i12, int i13) {
        super(c1977dL);
        this.A00 = A06;
        this.A04 = c1977dL;
        setOrientation(0);
        this.A03 = i10;
        this.A01 = i12;
        this.A02 = i13;
        this.A05 = new C1794aN[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.A05[i14] = A00();
            addView(this.A05[i14]);
        }
        A01();
    }

    private C1794aN A00() {
        C1794aN c1794aN = new C1794aN(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c1794aN.setLayoutParams(starRatingViewParams);
        return c1794aN;
    }

    private void A01() {
        int i10 = 0;
        while (i10 < i) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A05[i10].getLayoutParams();
            int i11 = i10 == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i11;
            i10++;
        }
        requestLayout();
    }

    private void A02(float f10) {
        for (int i10 = 0; i10 < i; i10++) {
            float fillRatio = Math.min(1.0f, f10 - i10);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i10].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i10) {
        this.A00 = i10;
        A01();
    }

    public void setRating(float f10) {
        A02(f10);
    }
}
