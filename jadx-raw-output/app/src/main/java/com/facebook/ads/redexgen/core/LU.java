package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LU extends AbstractC1724Yd {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final O2 A04;
    public final C1977dL A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{3, 32, 34, ExifInterface.START_CODE, 3, 44, 47, 51, 37, 96, 1, 36, 96, 18, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A01();
        A09 = (int) (AbstractC1680Wl.A02 * 4.0f);
        A08 = (int) (AbstractC1680Wl.A02 * 10.0f);
        A07 = (int) (AbstractC1680Wl.A02 * 44.0f);
    }

    public LU(C1977dL c1977dL, US us, String str) {
        super(c1977dL, us, str);
        this.A05 = c1977dL;
        this.A04 = O3.A00(c1977dL.A02());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        XP.A0K(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1724Yd
    public final void A0N() {
        this.A01.setImageBitmap(XY.A01(XX.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC1733Ym(this));
        this.A01.setContentDescription(A00(4, 18, 84));
        C1728Yh c1728Yh = new C1728Yh(this.A05);
        c1728Yh.setData(this.A04.A0H(), XX.HIDE_AD);
        c1728Yh.setOnClickListener(new ViewOnClickListenerC1734Yn(this, c1728Yh));
        C1728Yh c1728Yh2 = new C1728Yh(this.A05);
        c1728Yh2.setData(this.A04.A0L(), XX.REPORT_AD);
        c1728Yh2.setOnClickListener(new ViewOnClickListenerC1735Yo(this, c1728Yh2));
        C1728Yh c1728Yh3 = new C1728Yh(this.A05);
        c1728Yh3.setData(this.A04.A0M(), XX.AD_CHOICES_ICON);
        c1728Yh3.setOnClickListener(new ViewOnClickListenerC1736Yp(this, c1728Yh3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        XP.A0R(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c1728Yh, layoutParams);
        this.A02.addView(c1728Yh2, layoutParams);
        this.A02.addView(c1728Yh3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1724Yd
    public final void A0O() {
        XP.A0G(this);
        XP.A0H(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1724Yd
    public final void A0P(O6 o10, O4 o11) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        XP.A0W(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        XP.A0R(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1724Yd
    public final void A0Q(O6 o10, O4 o11) {
        XP.A0R(this.A03);
        this.A01.setImageBitmap(XY.A01(XX.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC1737Yq(this));
        this.A01.setContentDescription(A00(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (O6 o12 : o10.A05()) {
            C1728Yh c1728Yh = new C1728Yh(this.A05);
            c1728Yh.setData(o12.A04(), null);
            c1728Yh.setOnClickListener(new ViewOnClickListenerC1738Yr(this, c1728Yh, o12));
            this.A02.addView(c1728Yh, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1724Yd
    public final boolean A0R() {
        return true;
    }
}
