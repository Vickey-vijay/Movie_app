package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* JADX INFO: loaded from: classes7.dex */
public final class Ef implements LevelPlayInterstitialAdListener {
    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClicked(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        C3502h8.a().b(Pf.f27382a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdClosed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        C3502h8.a().c(Pf.f27382a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayFailed(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdError, "error");
        ck.p.j(levelPlayAdInfo, "adInfo");
        C3502h8 c3502h8A = C3502h8.a();
        Pf pf2 = Pf.f27382a;
        c3502h8A.a(pf2.a(levelPlayAdError), pf2.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        C3502h8.a().f(Pf.f27382a.a(levelPlayAdInfo));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoadFailed(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "error");
        C3502h8.a().a(Pf.f27382a.a(levelPlayAdError));
    }

    @Override // com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener
    public void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "adInfo");
        C3502h8.a().e(Pf.f27382a.a(levelPlayAdInfo));
    }
}
