package hl;

import android.view.View;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements MainNativeAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f53974a;

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdLoaded(View view) {
    }

    public n(b0 b0Var) {
        this.f53974a = b0Var;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f53974a.q("onAdClick");
        this.f53974a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f53974a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdClose() {
        this.f53974a.q("onAdClose");
        this.f53974a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f53974a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f53974a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f53974a.q("onAdShow");
        this.f53974a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f53974a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoComplete() {
        this.f53974a.q("onAdVideoComplete");
        this.f53974a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f53974a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdVideoComplete();
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoStart() {
        this.f53974a.q("onAdVideoStart");
        this.f53974a.getClass();
        MainNativeAdCallBack mainNativeAdCallBack = this.f53974a.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdVideoStart();
        }
    }
}
