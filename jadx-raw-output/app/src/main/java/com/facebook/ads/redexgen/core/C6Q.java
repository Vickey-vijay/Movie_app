package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Q extends C2120fg {
    public InterfaceC1978dM A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C1977dL c1977dL, NativeAd nativeAd, C1637Ur c1637Ur) {
        C1791aK c1791aK = new C1791aK(c1977dL);
        MediaView mediaView = new MediaView(c1977dL);
        AdOptionsView adOptionsView = new AdOptionsView(c1977dL, nativeAd, nativeAdLayout);
        c1637Ur.A09(adOptionsView, 28);
        this.A00 = new EP(c1977dL, nativeAd, c1637Ur, C1520Qc.A0L(nativeAd.getInternalNativeAd()).A18(), c1791aK, mediaView, adOptionsView);
        XP.A0K(nativeAdLayout, c1637Ur.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1791aK, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
