package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZH extends LinearLayout {
    public static byte[] A0D;
    public static String[] A0E = {"gmSbsJUTV6ssYU6sPFdQApLIq3Ne91IM", "MfGeHL5PmkPbpLjQYYWOTSdzt", "", "SJThwTW85f7z2tdQDzwWLTm6w", "rQXooJE", "LhKJvtc1UCCcm5M0SWMNGP7YHUEfZfxE", "", "2Oh5HyK"};
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final Uri A0I;
    public static final View.OnTouchListener A0J;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public ZG A04;
    public ZU A05;
    public String A06;
    public final float A07;
    public final WebView A08;
    public final C1977dL A09;
    public final ZZ A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        byte[] bArr = {-43, -12, -10, -2, -68, -27, -24, -20, -34, 0, 41, 44, 49, 27, 44, 30, 23, 56, 45, 54, -24, 54, 41, 60, 49, 62, 45, -24, ExifInterface.START_CODE, 58, 55, 63, 59, 45, 58, 41, ExifInterface.START_CODE, 55, 61, 60, 2, ExifInterface.START_CODE, 52, 41, 54, 51, 55, 68, 58, 72, 69, 63, 58, 4, 63, 68, 74, 59, 68, 74, 4, 55, 57, 74, 63, 69, 68, 4, 44, 31, 27, 45, -29, -17, -19, -82, ExifInterface.MARKER_APP1, -18, -28, -14, -17, -23, -28, -82, -29, -24, -14, -17, -19, -27, 59, 71, 71, 67, 13, 2, 2, 74, 74, 74, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 54, 66, 64};
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "Ujyw6mT";
        strArr2[4] = "Vqhraj8";
        A0D = bArr;
    }

    static {
        A0A();
        A0G = Color.rgb(224, 224, 224);
        A0H = Color.argb(34, 0, 0, 0);
        A0F = (int) (AbstractC1680Wl.A02 * 16.0f);
        A0I = WQ.A00(A06(90, 23, 118));
        A0J = new ZB();
    }

    public ZH(C1977dL c1977dL, WebView webView, boolean z10) {
        super(c1977dL);
        this.A07 = getResources().getDisplayMetrics().density;
        this.A0A = new LR(this);
        this.A08 = webView;
        this.A09 = c1977dL;
        this.A0B = U8.A06(c1977dL);
        this.A0C = z10;
        A08();
        A0C(false);
    }

    private void A08() {
        int buttonSizePx;
        int i10 = (int) (A0F * this.A07);
        XP.A0K(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A09);
        this.A01.setContentDescription(A06(4, 5, 28));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(XY.A01(XX.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0J);
        this.A01.setOnClickListener(new ZC(this));
        addView(this.A01, layoutParams);
        if (this.A0B && !U7.A2o(this.A09)) {
            this.A00 = new ImageView(this.A09);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 54));
            ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i10, i10);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(XY.A01(XX.BACK_ARROW_V2));
            this.A00.setOnTouchListener(A0J);
            this.A00.setOnClickListener(new ZD(this));
            addView(this.A00, layoutParams2);
        }
        this.A05 = new ZU(this.A09);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0B || U7.A2o(this.A09)) {
            buttonSizePx = 1056964608;
        } else {
            buttonSizePx = 1065353216;
        }
        layoutParams3.weight = buttonSizePx;
        this.A05.setGravity(17);
        if (U7.A2o(this.A09) && !this.A0C) {
            LinearLayout linearLayout = new LinearLayout(this.A09);
            linearLayout.setOrientation(1);
            addView(linearLayout, layoutParams3);
            XP.A0I(linearLayout);
            ImageView imageView = new ImageView(this.A09);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(XY.A01(XX.HANDLER));
            linearLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView(this.A05, titleParams);
        } else {
            addView(this.A05, layoutParams3);
        }
        if (this.A0B && !U7.A2o(this.A09)) {
            this.A02 = new ImageView(this.A09);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 93));
            ViewGroup.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(i10, i10);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(XY.A02(XX.BACK_ARROW_V2));
            this.A02.setOnTouchListener(A0J);
            this.A02.setOnClickListener(new ZE(this));
            addView(this.A02, titleViewsParams);
        }
        this.A03 = new ImageView(this.A09);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i10, i10);
        this.A03.setContentDescription(A06(16, 19, 107));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0J);
        this.A03.setOnClickListener(new ZF(this));
        addView(this.A03, layoutParams4);
        A09();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    private void A09() {
        PackageManager packageManager;
        Bitmap externalBrowserBitmap = null;
        boolean zA0k = U7.A0k(this.A09);
        if (!zA0k && (packageManager = this.A09.getPackageManager()) != null) {
            List<ResolveInfo> infos = packageManager.queryIntentActivities(new Intent(A06(46, 26, 121), A0I), 65536);
            if (infos.isEmpty()) {
                this.A03.setVisibility(8);
            } else {
                int size = infos.size();
                String[] strArr = A0E;
                if (strArr[7].length() == strArr[4].length()) {
                    A0E[0] = "OiPmrAn3GllLAwonlzrco6n6FhbN6530";
                    if (size == 1) {
                        if (infos.get(0).activityInfo != null) {
                            if (A06(72, 18, 35).equals(infos.get(0).activityInfo.packageName)) {
                                externalBrowserBitmap = XY.A01(XX.BROWSER_LAUNCH_CHROME);
                            }
                        }
                    }
                } else if (size == 1) {
                    if (infos.get(0).activityInfo != null) {
                        if (A06(72, 18, 35).equals(infos.get(0).activityInfo.packageName)) {
                            externalBrowserBitmap = XY.A01(XX.BROWSER_LAUNCH_CHROME);
                        }
                    }
                }
                externalBrowserBitmap = getExternalBrowserBitmap();
            }
        }
        if (U7.A2o(this.A09) || zA0k) {
            ImageView imageView = this.A03;
            String[] strArr2 = A0E;
            if (strArr2[2].length() != strArr2[6].length()) {
                throw new RuntimeException();
            }
            A0E[0] = "H3zrzdIXpl7cuf9737Dh0UcXPx3q90pI";
            imageView.setVisibility(0);
            externalBrowserBitmap = getExternalBrowserBitmap();
        }
        this.A03.setImageBitmap(externalBrowserBitmap);
        String[] strArr3 = A0E;
        if (strArr3[2].length() != strArr3[6].length()) {
            throw new RuntimeException();
        }
        A0E[5] = "C5b1pkMeIVGGxpo7XcAe9IGkuMZh8kn1";
    }

    private void A0C(boolean z10) {
        int i10 = z10 ? 0 : 8;
        if (this.A00 != null) {
            this.A00.setVisibility(i10);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        if (z10) {
            A0C(true);
        }
    }

    public ZZ getBrowserNavigationListener() {
        return this.A0A;
    }

    public static Bitmap getExternalBrowserBitmap() {
        XX xx = XX.BROWSER_LAUNCH_NATIVE_V2;
        if (A0E[0].charAt(23) == 'K') {
            throw new RuntimeException();
        }
        A0E[0] = "lUY1mRDCMXM3WZHcFiHRXNaY27JpPEEp";
        return XY.A01(xx);
    }

    public void setCloseButtonVisibility(int i10) {
        this.A01.setVisibility(i10);
    }

    public void setListener(ZG zg2) {
        this.A04 = zg2;
    }

    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    public void setUrl(String str) {
        this.A06 = str;
        if (!TextUtils.isEmpty(this.A06)) {
            String strA06 = A06(35, 11, 107);
            if (A0E[0].charAt(23) == 'K') {
                throw new RuntimeException();
            }
            A0E[0] = "qQ1cUQL6zuFcmcs6RwakvLgHhcCBx0UL";
            if (!strA06.equals(this.A06)) {
                this.A05.setSubtitle(this.A06);
                this.A03.setEnabled(true);
                this.A03.setColorFilter((ColorFilter) null);
                return;
            }
        }
        this.A05.setSubtitle(null);
        this.A03.setEnabled(false);
        this.A03.setColorFilter(new PorterDuffColorFilter(A0G, PorterDuff.Mode.SRC_IN));
    }
}
