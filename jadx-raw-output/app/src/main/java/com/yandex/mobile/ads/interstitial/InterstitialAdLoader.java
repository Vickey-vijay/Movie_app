package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import yads.ct3;
import yads.iu3;
import yads.x00;
import yads.zp3;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public final class InterstitialAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp3 f51045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x00 f51046b;

    public final void loadAd(AdRequestConfiguration adRequestConfiguration) {
        this.f51046b.f84394a.a(this.f51045a.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f51046b.f84394a.a(interstitialAdLoadListener != null ? new ct3(interstitialAdLoadListener) : null);
    }

    public InterstitialAdLoader(Context context) {
        iu3 iu3Var = new iu3(context);
        this.f51045a = new zp3();
        this.f51046b = new x00(context, iu3Var);
    }
}
