package e;

import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements PAGNativeAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f52301b;

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        int dimensionPixelOffset = this.f52301b.L.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f52301b.L, "dp_135"));
        h0 h0Var = this.f52301b;
        d.q qVar = h0Var.N;
        qVar.f51780b = h0Var.R;
        TextView textView = qVar.f51783e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f52301b.N.b(pAGNativeAd2, -1, dimensionPixelOffset, -1, dimensionPixelOffset);
    }

    public l(h0 h0Var) {
        this.f52301b = h0Var;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f52301b.v(i10 + ", " + str);
    }
}
