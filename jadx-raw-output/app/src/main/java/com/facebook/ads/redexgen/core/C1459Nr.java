package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1459Nr extends AbstractC1707Xm {
    public static byte[] A03;
    public C1977dL A00;
    public InterfaceC1706Xl A01;
    public final YQ A02;

    static {
        A05();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, ExifInterface.MARKER_APP1, -27, -41, -110, -77, -42};
    }

    public C1459Nr(C1977dL c1977dL, InterfaceC1708Xn interfaceC1708Xn, C1620Ua c1620Ua, int i10) {
        super(c1977dL);
        this.A00 = c1977dL;
        setGravity(16);
        A04();
        this.A02 = new YQ(this.A00, i10);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1718Xx(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public final void A06() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public final void A07() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public final void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public final void A09(float f10, int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public final void A0A(C1440My c1440My, boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public int getToolbarHeight() {
        return AbstractC1707Xm.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public InterfaceC1706Xl getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setAdReportingVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setCTAClickListener(KE ke2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setFullscreen(boolean z10) {
    }

    public void setInitialUnskippableSeconds(int i10) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setPageDetails(N9 n10, String str, int i10, NF nf2) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setPageDetailsVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setProgress(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setProgressImage(XX xx) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setProgressImmediate(float f10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setProgressSpinnerInvisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setToolbarActionMode(int i10) {
        this.A02.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1707Xm
    public void setToolbarListener(InterfaceC1706Xl interfaceC1706Xl) {
        this.A01 = interfaceC1706Xl;
    }
}
