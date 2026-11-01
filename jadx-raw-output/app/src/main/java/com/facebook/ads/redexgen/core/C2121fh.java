package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2121fh extends R8 implements MediaViewApi, Repairable, SM {
    public static byte[] A0E;
    public static String[] A0F = {"opPNeHLRCwNMjghH70VvpS5N8kNNBiJu", "eEOY2RUjN4bpbDsCyz0GPhNNbfKnjNLD", "VFQc0pqb8IELGhnpfLoj2hUSBo2VhTCu", "GBUHck22", "gxS7cL5mKFosIlCCzwl1gr8LaZQoy", "JvRhV7isjcFk5", "Q8NK4BrUIZ6kI5bk", "yT7QEu4e"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C1977dL A07;
    public C0L A08;
    public C1758Zl A09;
    public C5G A0A;
    public C1953cw A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0F;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "ck5ggAbj2vioxfDq";
            strArr2[4] = "NneLGMvrJ83sFMBsADIKrHrKRcoTv";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
            i13++;
        }
    }

    public static void A08() {
        A0E = new byte[]{-61, ExifInterface.MARKER_APP1, -14, -17, -11, -13, -27, -20, -96, -14, -27, -18, -28, -27, -14, -27, -14, -96, -19, -11, -13, -12, -96, -30, -27, -96, -13, -27, -12, -96, -30, -27, -26, -17, -14, -27, -96, -18, ExifInterface.MARKER_APP1, -12, -23, -10, -27, -63, -28, -82, 9, 5, 4, 56, 39, 44, 40, 49, 38, 40, 17, 40, 55, 58, 50, 53, 46, -52, -16, -28, -22, -24, -93, -11, -24, -15, -25, -24, -11, -24, -11, -93, -16, -8, -10, -9, -93, -27, -24, -93, -10, -24, -9, -93, -27, -24, -23, -14, -11, -24, -93, -15, -28, -9, -20, -7, -24, -60, -25, -79, -7, 29, 17, 23, 21, -48, 34, 21, 30, 20, 21, 34, 21, 34, -48, 29, 37, 35, 36, -48, 18, 21, -48, 35, 21, 36, -48, 18, 21, 22, 31, 34, 21, -48, 30, 17, 36, 25, 38, 21, -14, 17, 30, 30, 21, 34, -15, 20, -34, -83, -46, -38, -59, -48, -51, -56, -124, -70, -51, -55, -37, -124, -57, -45, -46, -41, -40, -42, ExifInterface.MARKER_EOI, -57, -40, -45, -42, -124, -44, -59, -42, -59, -47, -41, -124, -40, -35, -44, -55, -110, -62, -43, -24, -35, -22, ExifInterface.MARKER_EOI, -108, -75, -40, -108, -67, -41, -29, -30, -108, -35, -25, -108, -30, -23, -32, -32, -94, -26, -7, -12, -11, -1, -80, 2, -11, -2, -12, -11, 2, -11, 2, -80, -3, 5, 3, 4, -80, -14, -11, -80, 3, -11, 4, -80, -14, -11, -10, -1, 2, -11, -80, -2, -15, 4, -7, 6, -11, -47, -12, -66, -41, -26, -33, -70, -58, -60, -123, -67, -72, -70, -68, -71, -58, -58, -62, -123, -72, -69, -54, -123, -59, -72, -53, -64, -51, -68, -123, -70, -61, -64, -70, -62, -68, -69, -15, -28, -33, -32, -22, -48, -19, -25, -72};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        if (this.A0A != null) {
            this.A0A.setVisibility(8);
            P3.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            if (this.A01 != null) {
                XP.A0H(this.A08);
            }
            float f10 = AbstractC1680Wl.A02;
            float density = 4.0f * f10;
            int hPadding = Math.round(density);
            float density2 = 12.0f * f10;
            int vPadding = Math.round(density2);
            this.A08.setChildSpacing(hPadding);
            this.A08.setPadding(0, vPadding, 0, vPadding);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 54));
    }

    private void A07() {
        EnumC1685Wq.A04(this.A03, EnumC1685Wq.A0B);
        EnumC1685Wq.A04(this.A09, EnumC1685Wq.A0B);
        EnumC1685Wq.A04(this.A05, EnumC1685Wq.A0B);
        EnumC1685Wq.A04(this.A01, EnumC1685Wq.A0B);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, C1520Qc c1520Qc) {
        if (this.A0B != null) {
            this.A03.removeView(this.A0B);
        }
        if (!c1520Qc.A1g()) {
            return;
        }
        String strA1D = c1520Qc.A1D();
        if (this.A03.getContext() == null) {
            return;
        }
        this.A0B = AbstractC1952cv.A01(this.A07, strA1D);
        if (this.A0B != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(5, view.getId());
            layoutParams.addRule(7, view.getId());
            layoutParams.addRule(6, view.getId());
            layoutParams.addRule(8, view.getId());
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
            A09(this.A0B, layoutParams);
            this.A06.bringChildToFront(this.A0B);
        }
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            A0F[1] = "0pGJtKTiEG7M1QZmgSqLESVqtH6XSoGw";
            if (imageView2 != null) {
                XP.A0H(this.A02);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(XP.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 102));
    }

    private final void A0C(C1977dL c1977dL, AttributeSet attributeSet, int i10, int i11, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1977dL, attributeSet, i10, i11));
        A0H(new C1758Zl(c1977dL, attributeSet, i10, i11));
        this.A08 = new C0L(c1977dL, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1977dL, attributeSet, i10, i11));
        A07();
    }

    private final void A0D(C1977dL c1977dL, AttributeSet attributeSet, int i10, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1977dL, attributeSet, i10));
        A0H(new C1758Zl(c1977dL, attributeSet, i10));
        this.A08 = new C0L(c1977dL, attributeSet, i10);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1977dL, attributeSet, i10));
        A07();
    }

    private final void A0E(C1977dL c1977dL, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1977dL, attributeSet));
        A0H(new C1758Zl(c1977dL, attributeSet));
        this.A08 = new C0L(c1977dL, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1977dL, attributeSet));
        A07();
    }

    private final void A0F(C1977dL c1977dL, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1977dL));
        A0H(new C1758Zl(c1977dL));
        this.A08 = new C0L(c1977dL);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1977dL));
        A07();
    }

    private void A0G(C1520Qc c1520Qc, boolean z10, C1635Up c1635Up) {
        KZ kzA04 = new KZ(this.A02, this.A07).A04();
        if (z10) {
            kzA04.A06(new C2128fo(this, c1520Qc));
        }
        kzA04.A07(c1635Up.getUrl());
    }

    private void A0H(C1758Zl c1758Zl) {
        if (!this.A0D) {
            if (this.A09 != null) {
                this.A03.removeView(this.A09);
            }
            c1758Zl.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(c1758Zl, layoutParams);
            this.A09 = c1758Zl;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 57));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> carousel = ((RK) nativeAd.getNativeAdApi()).A03();
        if (carousel == null) {
            return false;
        }
        Iterator<NativeAd> it = carousel.iterator();
        while (it.hasNext()) {
            if (it.next().getAdCoverImage() == null) {
                return false;
            }
        }
        if (A0F[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[6] = "NNKiamhSotpSBh0S";
        strArr[4] = "WQowSckFUFZtjqKDGN1yGWQ8HKryj";
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return !TextUtils.isEmpty(((RK) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code duplicated, block: B:67:0x02f3  */
    public final void A0L(NativeAd nativeAd) {
        AbstractC2256i6 abstractC2256i6;
        ViewParent parent;
        C1977dL adObjectContext = ((C1520Qc) nativeAd.getInternalNativeAd()).A12();
        adObjectContext.A0O(this);
        this.A07.A0L(adObjectContext);
        this.A07.A0K(adObjectContext.A0F());
        this.A0D = true;
        C1520Qc c1520QcA0L = C1520Qc.A0L(nativeAd.getInternalNativeAd());
        c1520QcA0L.A1T(this.A03);
        this.A02.setVisibility(8);
        this.A02.setImageDrawable(null);
        if (c1520QcA0L.A10() != null && c1520QcA0L.A10().A1Y()) {
            if (!TextUtils.isEmpty(c1520QcA0L.A10().A20().A0H().A09())) {
                c1520QcA0L.A12().A0F().AJ9(LT.A0A);
            } else {
                c1520QcA0L.A12().A0F().AJ9(LT.A09);
            }
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((RH) this.A05.getMediaViewVideoRendererApi()).A03();
            if (this.A01 != null) {
                this.A01.setVisibility(8);
                if (this.A01 instanceof C1749Zc) {
                    ((C1749Zc) this.A01).A04();
                } else {
                    ((C10246g) this.A01).setAdapter(null);
                }
            }
            A01(false);
            this.A0A = new C5G(this.A07, this.A07.A0A(), new C2126fm(this, c1520QcA0L, nativeAd), c1520QcA0L.A10(), A04(261, 31, 13), 4, c1520QcA0L.A1A());
            EnumC1685Wq.A04(this.A0A, EnumC1685Wq.A0B);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.A03.addView(this.A0A, layoutParams);
            this.A00 = this.A0A;
            bringChildToFront(this.A0A);
            this.A0A.setVisibility(0);
            A0A(this.A0A, c1520QcA0L);
            A01(true);
            return;
        }
        if (A0I(nativeAd)) {
            c1520QcA0L.A12().A0F().AJ9(LT.A04);
            boolean z10 = c1520QcA0L.A18() == EnumC1638Us.A0B;
            if (!U7.A2n(this.A07) || z10) {
                this.A01 = this.A08;
                ((C0L) this.A01).setCurrentPosition(0);
                ((C0L) this.A01).setShowTextInCarousel(z10);
                if (z10) {
                    final C1977dL c1977dL = this.A07;
                    final C0L c0l = (C0L) this.A01;
                    final List<C1520Qc> listA1I = c1520QcA0L.A1I();
                    final C1637Ur c1637UrA17 = c1520QcA0L.A17();
                    abstractC2256i6 = new AbstractC2256i6(c1977dL, c0l, listA1I, c1637UrA17) { // from class: com.facebook.ads.redexgen.X.7A
                        public final C1977dL A00;
                        public final C1637Ur A01;

                        {
                            super(c0l, listA1I, c1977dL);
                            this.A00 = c1977dL;
                            this.A01 = c1637UrA17 == null ? new C1637Ur() : c1637UrA17;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.core.QC
                        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final OB A0F(ViewGroup viewGroup, int i10) {
                            return new OB(new C1714Xt(this.A00, this.A01));
                        }

                        @Override // com.facebook.ads.redexgen.core.QC
                        /* JADX INFO: renamed from: A0Q */
                        public final void A0K(OB ob2, int i10) {
                            super.A0K(ob2, i10);
                            C1714Xt c1714Xt = (C1714Xt) ob2.A0p();
                            A0O(c1714Xt.getImageCardView(), i10);
                            if (((AbstractC2256i6) this).A01.get(i10) != null) {
                                c1714Xt.setTitle(((AbstractC2256i6) this).A01.get(i10).getAdHeadline());
                                c1714Xt.setSubtitle(((AbstractC2256i6) this).A01.get(i10).getAdLinkDescription());
                                c1714Xt.setButtonText(((AbstractC2256i6) this).A01.get(i10).getAdCallToAction());
                            }
                            C1520Qc c1520Qc = ((AbstractC2256i6) this).A01.get(i10);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(c1714Xt);
                            c1520Qc.A1P(c1714Xt, c1714Xt, arrayList);
                        }
                    };
                } else {
                    final C0L c0l2 = (C0L) this.A01;
                    final List<C1520Qc> listA1I2 = c1520QcA0L.A1I();
                    final C1977dL c1977dL2 = this.A07;
                    abstractC2256i6 = new AbstractC2256i6(c0l2, listA1I2, c1977dL2) { // from class: com.facebook.ads.redexgen.X.79
                        public final C1977dL A00;

                        {
                            this.A00 = c1977dL2;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.core.QC
                        /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final OB A0F(ViewGroup viewGroup, int i10) {
                            return new OB(new C1720Xz(this.A00));
                        }

                        @Override // com.facebook.ads.redexgen.core.QC
                        /* JADX INFO: renamed from: A0Q, reason: merged with bridge method [inline-methods] */
                        public final void A0K(OB ob2, int i10) {
                            super.A0K(ob2, i10);
                            C1720Xz c1720Xz = (C1720Xz) ob2.A0p();
                            YM imageView = (YM) c1720Xz.getImageCardView();
                            imageView.setImageDrawable(null);
                            A0O(imageView, i10);
                            C1520Qc childAd = ((AbstractC2256i6) this).A01.get(i10);
                            childAd.A12().A0L(this.A00);
                            childAd.A1O(c1720Xz, c1720Xz);
                        }
                    };
                }
                abstractC2256i6.A0P(new C2125fl(this, c1520QcA0L));
                ((C10246g) this.A01).setAdapter(abstractC2256i6);
            } else {
                A01(false);
                int width = this.A03.getWidth();
                if (width == 0) {
                    if (this.A03.getParent() instanceof ViewGroup) {
                        parent = this.A03.getParent();
                    } else {
                        parent = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    while (width == 0 && viewGroup != null) {
                        width = viewGroup.getWidth();
                        boolean z11 = viewGroup.getParent() instanceof ViewGroup;
                        String[] strArr = A0F;
                        if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0F;
                        strArr2[6] = "X2xGJjQ8zu6cU8Eo";
                        strArr2[4] = "AZj2zr3QMe0wQwV9kynIxRcnRDB4X";
                        viewGroup = (ViewGroup) (z11 ? viewGroup.getParent() : null);
                    }
                }
                XP.A0H(this.A01);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                this.A01 = new C1749Zc(this.A07);
                this.A03.addView(this.A01, layoutParams2);
                ((C1749Zc) this.A01).A05(c1520QcA0L, width);
                XP.A0I(this.A01);
                A01(true);
            }
            this.A00 = this.A01;
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((RH) this.A05.getMediaViewVideoRendererApi()).A03();
            bringChildToFront(this.A01);
            this.A01.setVisibility(0);
            A0A(this.A01, c1520QcA0L);
            return;
        }
        boolean zA0J = A0J(nativeAd);
        String[] strArr3 = A0F;
        if (strArr3[3].length() != strArr3[7].length()) {
            throw new RuntimeException();
        }
        A0F[5] = "QrlGDx1qLp0kN";
        if (zA0J) {
            c1520QcA0L.A12().A0F().AJ9(LT.A0D);
            c1520QcA0L.A1e(this.A0C);
            this.A00 = this.A05.getMediaViewVideoRendererApi().getVideoView();
            A05();
            this.A09.setVisibility(8);
            this.A09.setImage(null, null);
            if (this.A01 != null) {
                this.A01.setVisibility(8);
                if (this.A01 instanceof C1749Zc) {
                    ((C1749Zc) this.A01).A04();
                } else {
                    ((C10246g) this.A01).setAdapter(null);
                }
            }
            bringChildToFront(this.A05);
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A05;
            String[] strArr4 = A0F;
            if (strArr4[2].charAt(31) != strArr4[0].charAt(31)) {
                String[] strArr5 = A0F;
                strArr5[2] = "KRt7yuKunmEFowe58PEdTHnfFAzQvUNu";
                strArr5[0] = "FpiuEPXAVB8biFGx18DJjcPDa6TrT1Ju";
                mediaViewVideoRenderer.setNativeAd(nativeAd);
                ((RH) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
                if (c1520QcA0L.getAdCoverImage() != null) {
                    new KZ(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C2124fk(this, c1520QcA0L)).A07(c1520QcA0L.getAdCoverImage().getUrl());
                }
            } else {
                String[] strArr6 = A0F;
                strArr6[6] = "rknJE6EzKshvoL3E";
                strArr6[4] = "1VlRGSe6v9ZgAEzaXTE4MJVCDSD8V";
                mediaViewVideoRenderer.setNativeAd(nativeAd);
                ((RH) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
                if (c1520QcA0L.getAdCoverImage() != null) {
                    new KZ(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C2124fk(this, c1520QcA0L)).A07(c1520QcA0L.getAdCoverImage().getUrl());
                }
            }
            if (BuildConfigApi.isDebug()) {
                Log.i(A0G, A04(292, 9, 49) + ((RK) nativeAd.getNativeAdApi()).A02());
            }
            A0A(this.A05, c1520QcA0L);
            return;
        }
        if (nativeAd.getAdCoverImage() == null) {
            return;
        }
        c1520QcA0L.A12().A0F().AJ9(LT.A0B);
        this.A00 = this.A09.getBodyImageView();
        A05();
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((RH) this.A05.getMediaViewVideoRendererApi()).A03();
        if (this.A01 != null) {
            this.A01.setVisibility(8);
            if (this.A01 instanceof C1749Zc) {
                ((C1749Zc) this.A01).A04();
            } else {
                ((C10246g) this.A01).setAdapter(null);
            }
        }
        bringChildToFront(this.A09);
        this.A09.setVisibility(0);
        new KZ(this.A09, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C2123fj(this, c1520QcA0L)).A07(c1520QcA0L.getAdCoverImage().getUrl());
        A0A(this.A09, c1520QcA0L);
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z10) {
        C1977dL c1977dLA12 = ((C1520Qc) nativeAdBaseApi).A12();
        C1977dL adObjectContext = this.A07;
        adObjectContext.A0L(c1977dLA12);
        c1977dLA12.A0O(this);
        this.A0D = true;
        C1520Qc c1520QcA0L = C1520Qc.A0L(nativeAdBaseApi);
        c1520QcA0L.A1S(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((RH) this.A05.getMediaViewVideoRendererApi()).A03();
        if (this.A01 != null) {
            this.A01.setVisibility(8);
            if (this.A01 instanceof C1749Zc) {
                ((C1749Zc) this.A01).A04();
            } else {
                ((C10246g) this.A01).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        C1635Up adIcon = c1520QcA0L.getAdIcon();
        if (adIcon != null) {
            SF sfA11 = c1520QcA0L.A11();
            if (A0F[1].charAt(7) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "8vonm0Gh";
            strArr[7] = "EfYx5Mmt";
            Bitmap bitmapA0N = sfA11.A0N(adIcon.getUrl());
            if (bitmapA0N != null) {
                this.A02.setImageBitmap(bitmapA0N);
                if (z10) {
                    this.A03.post(new C2129fp(this, c1520QcA0L));
                }
            } else {
                A0G(c1520QcA0L, z10, adIcon);
            }
        } else {
            QQ qqA16 = c1520QcA0L.A16();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            c1977dLA12.A0F().A3F(c1520QcA0L.A0y(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (qqA16 != null) {
                qqA16.ADB(V1.A00(adErrorType));
            }
            Log.e(A04(46, 17, 121), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                C1977dL adObjectContext2 = this.A07;
                adObjectContext2.A08().AAy(A04(258, 3, 44), AbstractC1590Sv.A0W, new C1591Sw(A04(192, 23, 42)));
            }
        }
        A0A(this.A02, c1520QcA0L);
    }

    public final boolean A0N() {
        if (this.A01 != null) {
            View view = this.A01;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "f43XNCk8";
            strArr[7] = "DdRxJSTL";
            if (view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final C1977dL A6e() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view != this.A01 && view != this.A05 && view != this.A09) {
            ImageView imageView = this.A02;
            if (A0F[5].length() != 13) {
                throw new RuntimeException();
            }
            A0F[1] = "R8dYcckG0onv7yQggjKFRkmHXZbq9UJh";
            if (view != imageView) {
                return;
            }
        }
        this.A06.bringChildToFront(view);
        if (this.A0B != null) {
            this.A06.bringChildToFront(this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r4.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r4.A03.getVisibility() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        return r4.A03.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return 0;
     */
    @Override // com.facebook.ads.internal.api.MediaViewApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getMediaWidth() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.Zl r0 = r4.A09
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L35
            com.facebook.ads.redexgen.X.Zl r0 = r4.A09
            int r3 = r0.getImageWidth()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2121fh.A0F
            r0 = 2
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L28
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2121fh.A0F
            java.lang.String r1 = "us0p5hBNoGIfish2"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "DFvDCw92fILzmemlu9XfPwpsPQRiq"
            r0 = 4
            r2[r0] = r1
            return r3
        L35:
            com.facebook.ads.MediaViewVideoRenderer r3 = r4.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2121fh.A0F
            r0 = 1
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 65
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2121fh.A0F
            java.lang.String r1 = "7zc9sXuG"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "ncWuDUJK"
            r0 = 7
            r2[r0] = r1
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L6d
        L57:
            com.facebook.ads.MediaViewVideoRenderer r0 = r4.A05
            com.facebook.ads.internal.api.MediaViewVideoRendererApi r0 = r0.getMediaViewVideoRendererApi()
            android.view.View r0 = r0.getVideoView()
            int r0 = r0.getWidth()
            return r0
        L66:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L6d
            goto L57
        L6d:
            com.facebook.ads.MediaView r0 = r4.A03
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L7c
            com.facebook.ads.MediaView r0 = r4.A03
            int r0 = r0.getWidth()
            return r0
        L7c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2121fh.getMediaWidth():int");
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1977dL) {
            this.A07 = (C1977dL) context;
        } else {
            this.A07 = RB.A03(context);
        }
        this.A07.A0O(this);
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                A0F(this.A07, mediaView);
                break;
            case 1:
                A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
                break;
            case 2:
                C1977dL c1977dL = this.A07;
                AttributeSet attributeSet = adViewConstructorParams.getAttributeSet();
                if (A0F[1].charAt(7) == 'A') {
                    throw new RuntimeException();
                }
                A0F[1] = "4tObUcmoIw93Quo4uXvWt9YCbUPkknut";
                A0D(c1977dL, attributeSet, adViewConstructorParams.getDefStyleAttr(), mediaView);
                break;
                break;
            case 3:
                A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
                break;
            default:
                throw new IllegalArgumentException(A04(155, 37, 26));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        int width = this.A03.getWidth();
        int currentHeight = this.A03.getHeight();
        if (width > 0 && currentHeight > 0) {
            this.A03.repair(th2);
            this.A03.getLayoutParams().width = width;
            this.A03.getLayoutParams().height = currentHeight;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((RH) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((RH) this.A05.getMediaViewVideoRendererApi()).A07(new C2122fi(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            if (this.A05 != null) {
                this.A03.removeView(this.A05);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((RH) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A0A());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((C2121fh) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(XP.A00());
            return;
        }
        throw new IllegalStateException(A04(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 43, 70));
    }
}
