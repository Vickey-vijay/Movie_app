package c3;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import d3.f;

/* JADX INFO: compiled from: PangleFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {
    public PAGConfig.Builder a() {
        return new PAGConfig.Builder();
    }

    public PAGAppOpenRequest b() {
        return new PAGAppOpenRequest();
    }

    public PAGBannerRequest c(PAGBannerSize pAGBannerSize) {
        return new PAGBannerRequest(pAGBannerSize);
    }

    public PAGInterstitialRequest d() {
        return new PAGInterstitialRequest();
    }

    public PAGNativeRequest e() {
        return new PAGNativeRequest();
    }

    public PAGRewardedRequest f() {
        return new PAGRewardedRequest();
    }

    public d3.a g(@NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, @NonNull d dVar) {
        return new d3.a(mediationAdLoadCallback, aVar, dVar, this);
    }

    public d3.b h(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, @NonNull d dVar) {
        return new d3.b(mediationAdLoadCallback, aVar, dVar, this);
    }

    public d3.c i(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, d dVar) {
        return new d3.c(mediationAdLoadCallback, aVar, dVar, this);
    }

    public d3.d j(@NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, d dVar) {
        return new d3.d(mediationAdLoadCallback, aVar, dVar, this);
    }

    public f k(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, d dVar) {
        return new f(mediationAdLoadCallback, aVar, dVar, this);
    }
}
