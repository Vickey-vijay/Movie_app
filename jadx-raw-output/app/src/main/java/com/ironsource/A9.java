package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;

/* JADX INFO: loaded from: classes8.dex */
public final class A9 implements U<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tf f25936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterstitialAdLoaderListener f25937b;

    @Override // com.ironsource.U
    public void b(final IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        this.f25936a.a(new Runnable() { // from class: com.ironsource.ih
            @Override // java.lang.Runnable
            public final void run() {
                A9.a(ironSourceError, this);
            }
        });
    }

    public A9(Tf tf2, InterstitialAdLoaderListener interstitialAdLoaderListener) {
        ck.p.j(tf2, "threadManager");
        ck.p.j(interstitialAdLoaderListener, "publisherListener");
        this.f25936a = tf2;
        this.f25937b = interstitialAdLoaderListener;
    }

    @Override // com.ironsource.U
    public void a(final InterstitialAd interstitialAd) {
        ck.p.j(interstitialAd, "adObject");
        this.f25936a.a(new Runnable() { // from class: com.ironsource.hh
            @Override // java.lang.Runnable
            public final void run() {
                A9.a(interstitialAd, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd interstitialAd, A9 a10) {
        ck.p.j(interstitialAd, "$adObject");
        ck.p.j(a10, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + interstitialAd.getAdInfo());
        a10.f25937b.onInterstitialAdLoaded(interstitialAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, A9 a10) {
        ck.p.j(ironSourceError, "$error");
        ck.p.j(a10, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + ironSourceError);
        a10.f25937b.onInterstitialAdLoadFailed(ironSourceError);
    }
}
