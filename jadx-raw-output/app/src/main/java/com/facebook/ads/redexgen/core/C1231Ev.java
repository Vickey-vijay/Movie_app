package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1231Ev extends AbstractC1524Qg implements InterfaceC1715Xu {
    public N3 A00;
    public AbstractC2049eW A01;
    public C2050eX A02;
    public C2050eX A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1977dL A09;
    public final C5Q A0A;

    public C1231Ev(C5Q c5q, SparseBooleanArray sparseBooleanArray, C2050eX c2050eX, int i10, int i11, int i12, int i13, C1977dL c1977dL, N3 n10) {
        super(c5q);
        this.A09 = c1977dL;
        this.A0A = c5q;
        this.A08 = sparseBooleanArray;
        this.A02 = c2050eX;
        this.A04 = i10;
        this.A05 = i11;
        this.A06 = i12;
        this.A07 = i13;
        this.A00 = n10;
    }

    private void A05(US us, XH xh2, String str, C1944cn c1944cn) {
        if (this.A08.get(c1944cn.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C1233Ex(this, str, c1944cn, us, c1944cn.A04(), xh2);
        this.A03 = new C2050eX(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C1232Ew(this, c1944cn));
    }

    public final KE A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C1944cn c1944cn, US us, SF sf2, XH xh2, String str) {
        int iA02 = c1944cn.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c1944cn.A03().A0H().A08();
        String strA09 = c1944cn.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A0A.A1T()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(sf2.A0T(strA09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c1944cn.A03().A0I().A0F(), c1944cn.A03().A0I().A04());
        this.A0A.setCTAInfo(c1944cn.A03().A0J(), c1944cn.A04());
        this.A0A.A1W(c1944cn.A04());
        A05(us, xh2, str, c1944cn);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1715Xu
    public final void AIV() {
        this.A0A.A1O();
    }
}
