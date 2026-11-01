package l;

import android.view.View;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements gl.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f63353a;

    public v(l lVar) {
        this.f63353a = lVar;
    }

    @Override // gl.u
    public final void onAdClick() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f63353a.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
    }

    @Override // gl.u
    public final void onAdLoaded(View view) {
        MainNativeAdCallBack mainNativeAdCallBack = this.f63353a.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdLoaded(view);
        }
    }

    @Override // gl.u
    public final void onAdShow(AdInfo adInfo) {
        MainNativeAdCallBack mainNativeAdCallBack = this.f63353a.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdShow(adInfo);
        }
    }
}
