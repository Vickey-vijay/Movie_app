package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* JADX INFO: renamed from: com.ironsource.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3487gb {

    /* JADX INFO: renamed from: com.ironsource.gb$a */
    public static final class a implements InterfaceC3433db {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LevelPlayInterstitialAdListener f29016a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f29016a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + levelPlayAdInfo);
            this.f29016a.onAdClicked(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + levelPlayAdInfo);
            this.f29016a.onAdClosed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdError, "error");
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + levelPlayAdInfo + " error: " + levelPlayAdError);
            this.f29016a.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + levelPlayAdInfo);
            this.f29016a.onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + levelPlayAdInfo);
            this.f29016a.onAdInfoChanged(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
            ck.p.j(levelPlayAdError, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + levelPlayAdError);
            this.f29016a.onAdLoadFailed(levelPlayAdError);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + levelPlayAdInfo);
            this.f29016a.onAdLoaded(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3433db b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
