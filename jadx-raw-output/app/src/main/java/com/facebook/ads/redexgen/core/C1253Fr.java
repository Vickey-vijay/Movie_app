package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1253Fr extends AbstractRunnableC1664Vt {
    public final /* synthetic */ InterfaceC1927cW A00;
    public final /* synthetic */ C1928cX A01;

    public C1253Fr(C1928cX c1928cX, InterfaceC1927cW interfaceC1927cW) {
        this.A01 = c1928cX;
        this.A00 = interfaceC1927cW;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1664Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1254Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
