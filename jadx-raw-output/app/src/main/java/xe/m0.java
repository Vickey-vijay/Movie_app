package xe;

import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f74456a;

    public m0(z zVar) {
        this.f74456a = zVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f74456a.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
        z zVar = this.f74456a;
        PAGInterstitialAd.loadAd(zVar.G, pAGInterstitialRequest, zVar.H);
    }
}
