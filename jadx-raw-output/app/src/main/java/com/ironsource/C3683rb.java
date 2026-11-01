package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* JADX INFO: renamed from: com.ironsource.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3683rb {

    /* JADX INFO: renamed from: com.ironsource.rb$a */
    public static final class a implements InterfaceC3433db {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LevelPlayRewardedAdListener f30625a;

        public a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
            this.f30625a = levelPlayRewardedAdListener;
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClicked() adInfo: " + levelPlayAdInfo);
            this.f30625a.onAdClicked(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdClosed() adInfo: " + levelPlayAdInfo);
            this.f30625a.onAdClosed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdError, "error");
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayFailed() adInfo: " + levelPlayAdInfo + " error: " + levelPlayAdError);
            this.f30625a.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdDisplayed() adInfo: " + levelPlayAdInfo);
            this.f30625a.onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdInfoChanged() adInfo: " + levelPlayAdInfo);
            this.f30625a.onAdInfoChanged(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
            ck.p.j(levelPlayAdError, "error");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoadFailed() error: " + levelPlayAdError);
            this.f30625a.onAdLoadFailed(levelPlayAdError);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdLoaded() adInfo: " + levelPlayAdInfo);
            this.f30625a.onAdLoaded(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3433db
        public void onAdRewarded(LevelPlayReward levelPlayReward, LevelPlayAdInfo levelPlayAdInfo) {
            ck.p.j(levelPlayReward, "reward");
            ck.p.j(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayRewardedAdListener.onAdRewarded() reward: " + levelPlayReward + " adInfo: " + levelPlayAdInfo);
            this.f30625a.onAdRewarded(levelPlayReward, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3433db b(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        return new a(levelPlayRewardedAdListener);
    }
}
