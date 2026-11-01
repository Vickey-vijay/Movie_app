package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EP extends FrameLayout implements InterfaceC1978dM {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final C1979dN A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"1TbW2eCQhsvMTBw6WLgOl0T9uhpIUPzf", "ziTp6gBPmnDALVepebGOFatIHSWtUxBS", "U8KhSuPVLRzWbOpxbAxolTOugcqmOnaD", "0bQh9HQE8V8VC7fBvS6H2cn6s67Amjp4", "9aGEAiUrkMnbIgwzZX43En2EpYymCUz", "e9g0133auHqHsGsSwLriU2UE0E7n3ej0", "gJVbKnLfSb6S0wmfJEV2eyQXUghITZN0", ""};
    public static final int A0E = (int) (AbstractC1680Wl.A02 * 6.0f);
    public static final int A0D = (int) (AbstractC1680Wl.A02 * 8.0f);
    public static final int A0C = (int) (AbstractC1680Wl.A02 * 12.0f);
    public static final int A0A = (int) (AbstractC1680Wl.A02 * 350.0f);
    public static final int A09 = (int) (AbstractC1680Wl.A02 * 250.0f);
    public static final int A0B = (int) (AbstractC1680Wl.A02 * 175.0f);

    public EP(C1977dL c1977dL, NativeAd nativeAd, C1637Ur c1637Ur, EnumC1638Us enumC1638Us, C1791aK c1791aK, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1977dL);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new C1979dN(c1977dL, this.A05, c1637Ur, c1791aK, adOptionsView);
        this.A06.setPadding(A0C, A0C, A0C, A0E);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (enumC1638Us == EnumC1638Us.A09 || enumC1638Us == EnumC1638Us.A0B) {
            A07(c1637Ur);
        }
        addView(this.A04, new FrameLayout.LayoutParams(-1, -2));
        if (enumC1638Us != EnumC1638Us.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(c1637Ur);
            A04(c1637Ur);
            A05(c1637Ur);
        }
        this.A07.add(c1791aK);
        this.A07.add(mediaView);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    private int A00() {
        int measuredHeight;
        int measuredHeight2;
        int linkDescHeight;
        int subtitleHeight = 0;
        if (this.A03 != null && this.A03.getVisibility() == 0) {
            measuredHeight = this.A03.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (this.A02 != null) {
            int linkDescHeight2 = this.A02.getVisibility();
            if (linkDescHeight2 == 0) {
                measuredHeight2 = this.A02.getMeasuredHeight();
            } else {
                measuredHeight2 = 0;
            }
        } else {
            measuredHeight2 = 0;
        }
        if (this.A00 != null) {
            int linkDescHeight3 = this.A00.getVisibility();
            if (linkDescHeight3 == 0) {
                TextView textView = this.A00;
                if (A08[0].charAt(24) != 'u') {
                    throw new RuntimeException();
                }
                A08[0] = "HiZrVlulAuiH54vlSWYSbySNuASlYz5G";
                linkDescHeight = textView.getMeasuredHeight();
            } else {
                linkDescHeight = 0;
            }
        } else {
            linkDescHeight = 0;
        }
        if (this.A01 != null && this.A01.getVisibility() == 0) {
            subtitleHeight = this.A01.getMeasuredHeight() + A0C + A0D;
        }
        int titleHeight = getMeasuredHeight();
        int ctaHeight = this.A06.getMeasuredHeight();
        return ((((titleHeight - ctaHeight) - measuredHeight) - measuredHeight2) - linkDescHeight) - subtitleHeight;
    }

    private void A01() {
        if (this.A03 != null) {
            this.A03.setLines(1);
        }
        if (this.A02 != null) {
            this.A02.setLines(1);
        }
        if (this.A00 != null) {
            this.A00.setLines(1);
        }
    }

    private void A02(int i10) {
        XP.A0L(this.A04, i10 > A0B ? 0 : 8);
        XP.A0L(this.A03, i10 > A0A ? 0 : 8);
        XP.A0L(this.A00, i10 <= A09 ? 8 : 0);
    }

    public static void A03(int i10, int i11, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int iA04 = XP.A04(textView, i11);
                textView.setLines(iA04 + 1);
                textView.measure(i10, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * iA04), 1073741824));
                i11 -= textView.getLineHeight() * iA04;
            }
        }
    }

    private void A04(C1637Ur c1637Ur) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            this.A00 = new TextView(getContext());
            c1637Ur.A06(this.A00);
            this.A00.setText(this.A05.getAdBodyText());
            this.A00.setPadding(A0C, 0, A0C, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(C1637Ur c1637Ur) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            XP.A0I(this.A01);
            c1637Ur.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            this.A01.setPadding(A0D, A0D, A0D, A0D);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0D, 0, A0D, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(C1637Ur c1637Ur) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            this.A02 = new TextView(getContext());
            c1637Ur.A07(this.A02);
            this.A02.setText(this.A05.getAdHeadline());
            this.A02.setPadding(A0C, A0D, A0C, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(C1637Ur c1637Ur) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            this.A03 = new TextView(getContext());
            c1637Ur.A06(this.A03);
            this.A03.setText(this.A05.getAdLinkDescription());
            this.A03.setPadding(A0C, 0, A0C, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1978dM
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1978dM
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C1979dN c1979dN = this.A06;
        int top2 = this.A06.getMeasuredHeight();
        c1979dN.layout(i10, i11, i12, top2 + i11);
        int top3 = this.A06.getMeasuredHeight();
        int i14 = i11 + top3;
        if (this.A03 != null) {
            int visibility = this.A03.getVisibility();
            if (A08[4].length() == 2) {
                throw new RuntimeException();
            }
            A08[4] = "Mpk43iWHaBi74JKA9YKWwwxfR5sOjUPQ";
            if (visibility == 0) {
                int measuredHeight = this.A03.getMeasuredHeight();
                int top4 = i14 + measuredHeight;
                this.A03.layout(i10, i14, i12, top4);
                i14 += measuredHeight;
            }
        }
        MediaView mediaView = this.A04;
        int top5 = this.A04.getMeasuredHeight();
        mediaView.layout(i10, i14, i12, top5 + i14);
        int top6 = this.A04.getMeasuredHeight();
        int i15 = i14 + top6;
        if (this.A02 != null) {
            TextView textView = this.A02;
            int top7 = this.A02.getMeasuredHeight();
            textView.layout(i10, i15, i12, top7 + i15);
            int top8 = this.A02.getMeasuredHeight();
            i15 += top8;
        }
        if (this.A00 != null) {
            int top9 = this.A00.getVisibility();
            if (top9 == 0) {
                TextView textView2 = this.A00;
                int top10 = this.A00.getMeasuredHeight();
                textView2.layout(i10, i15, i12, top10 + i15);
            }
        }
        if (this.A01 != null) {
            TextView textView3 = this.A01;
            int i16 = A0C + i10;
            int top11 = this.A01.getMeasuredHeight();
            int i17 = i13 - top11;
            int top12 = A0C;
            int i18 = i17 - top12;
            int top13 = A0C;
            int i19 = i12 - top13;
            int top14 = A0C;
            textView3.layout(i16, i18, i19, i13 - top14);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMin;
        A02(View.MeasureSpec.getSize(i11));
        A01();
        super.onMeasure(i10, i11);
        int iA00 = A00();
        int emptySpace = this.A04.getMediaWidth();
        if (emptySpace == 0) {
            iMin = iA00;
        } else {
            int emptySpace2 = this.A04.getMediaHeight();
            if (emptySpace2 == 0 || ((C2121fh) this.A04.getMediaViewApi()).A0N()) {
                iMin = iA00;
            } else {
                int emptySpace3 = this.A04.getMediaHeight();
                float f10 = emptySpace3;
                int emptySpace4 = this.A04.getMediaWidth();
                float aspectRatio = f10 / emptySpace4;
                int emptySpace5 = this.A04.getMeasuredWidth();
                iMin = Math.min((int) (emptySpace5 * aspectRatio), iA00);
            }
        }
        MediaView mediaView = this.A04;
        int mediaViewHeight = A08[4].length();
        if (mediaViewHeight == 2) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "bBjhlDCZcebcBoQzUAOgAVf3zFQrapwM";
        strArr[2] = "urvh83LMTjJVKtjaQ5bPrRJiE37dq76T";
        int emptySpace6 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        mediaView.measure(i10, emptySpace6);
        if (iMin < iA00) {
            A03(i10, iA00 - iMin, this.A02, this.A00, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1978dM
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
