package com.applovin.mediation.rtb;

import android.content.Context;
import androidx.annotation.NonNull;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.a;
import com.google.ads.mediation.applovin.d;
import com.google.ads.mediation.applovin.f;
import com.google.ads.mediation.applovin.g;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: loaded from: classes9.dex */
public final class AppLovinRtbRewardedRenderer extends f {
    private AppLovinAd appLovinAd;

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(@NonNull AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }

    public AppLovinRtbRewardedRenderer(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull d dVar, @NonNull a aVar, @NonNull g gVar) {
        super(mediationAdLoadCallback, dVar, aVar, gVar);
    }

    @Override // com.google.ads.mediation.applovin.f
    public void loadAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        AppLovinSdk appLovinSdkC = this.appLovinInitializer.c(mediationRewardedAdConfiguration.getContext());
        this.appLovinSdk = appLovinSdkC;
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialB = this.appLovinAdFactory.b(appLovinSdkC);
        this.incentivizedInterstitial = appLovinIncentivizedInterstitialB;
        appLovinIncentivizedInterstitialB.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, mediationRewardedAdConfiguration.getWatermark());
        this.networkExtras = mediationRewardedAdConfiguration.getMediationExtras();
        this.appLovinSdk.getAdService().loadNextAdForAdToken(mediationRewardedAdConfiguration.getBidResponse(), this);
    }
}
