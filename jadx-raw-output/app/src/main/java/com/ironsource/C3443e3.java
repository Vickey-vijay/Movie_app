package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;

/* JADX INFO: renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3443e3 implements U<BannerAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tf f28724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerAdLoaderListener f28725b;

    @Override // com.ironsource.U
    public void b(final IronSourceError ironSourceError) {
        ck.p.j(ironSourceError, "error");
        this.f28724a.a(new Runnable() { // from class: com.ironsource.wk
            @Override // java.lang.Runnable
            public final void run() {
                C3443e3.a(ironSourceError, this);
            }
        });
    }

    public C3443e3(Tf tf2, BannerAdLoaderListener bannerAdLoaderListener) {
        ck.p.j(tf2, "threadManager");
        ck.p.j(bannerAdLoaderListener, "publisherListener");
        this.f28724a = tf2;
        this.f28725b = bannerAdLoaderListener;
    }

    @Override // com.ironsource.U
    public void a(final BannerAdView bannerAdView) {
        ck.p.j(bannerAdView, "adObject");
        this.f28724a.a(new Runnable() { // from class: com.ironsource.vk
            @Override // java.lang.Runnable
            public final void run() {
                C3443e3.a(bannerAdView, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView bannerAdView, C3443e3 c3443e3) {
        ck.p.j(bannerAdView, "$adObject");
        ck.p.j(c3443e3, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + bannerAdView.getAdInfo());
        c3443e3.f28725b.onBannerAdLoaded(bannerAdView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, C3443e3 c3443e3) {
        ck.p.j(ironSourceError, "$error");
        ck.p.j(c3443e3, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + ironSourceError);
        c3443e3.f28725b.onBannerAdLoadFailed(ironSourceError);
    }
}
