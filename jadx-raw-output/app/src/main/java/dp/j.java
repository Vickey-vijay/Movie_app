package dp;

import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements PAGNativeAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f52256b;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        int i10;
        int i11;
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        b0 b0Var = this.f52256b;
        i.e eVar = b0Var.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        int i12 = i11;
        ImageView imageView = b0Var.G.f51785g;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        b0 b0Var2 = this.f52256b;
        d.q qVar = b0Var2.G;
        qVar.f51780b = b0Var2.K;
        qVar.b(pAGNativeAd2, i10, i12, b0Var2.B, b0Var2.C);
    }

    public j(b0 b0Var) {
        this.f52256b = b0Var;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f52256b.v(i10 + ", " + str);
    }
}
