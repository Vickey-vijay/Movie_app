package f;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements PAGNativeAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f52740b;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        int i10;
        int i11;
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        s sVar = this.f52740b;
        i.e eVar = sVar.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        int i12 = i11;
        d.q qVar = sVar.E;
        qVar.f51780b = sVar.I;
        qVar.b(pAGNativeAd2, i10, i12, sVar.B, sVar.C);
    }

    public e(s sVar) {
        this.f52740b = sVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f52740b.v(i10 + ", " + str);
    }
}
