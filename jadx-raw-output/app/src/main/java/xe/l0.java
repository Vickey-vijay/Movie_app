package xe;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements PAGInterstitialAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f74455b;

    public l0(z zVar) {
        this.f74455b = zVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        PAGInterstitialAd pAGInterstitialAd2 = pAGInterstitialAd;
        z zVar = this.f74455b;
        zVar.E = pAGInterstitialAd2;
        pAGInterstitialAd2.setAdInteractionListener(zVar.I);
        this.f74455b.D.onAdLoaded();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f74455b.v(i10 + ", " + str);
    }
}
