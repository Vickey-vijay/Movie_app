package hl;

import android.view.View;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements MainWdNativeAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f53946a;

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdLoaded(View view) {
    }

    public d0(h hVar) {
        this.f53946a = hVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f53946a.q("onAdClick");
        this.f53946a.getClass();
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f53946a.F;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdClose() {
        this.f53946a.q("onAdClose");
        this.f53946a.getClass();
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f53946a.F;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f53946a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdShow(AdInfo adInfo) {
        this.f53946a.q("onAdShow");
        this.f53946a.getClass();
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f53946a.F;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdShow(adInfo);
        }
    }
}
