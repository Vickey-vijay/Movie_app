package e;

import android.view.View;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements gl.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f52299a;

    public j(p pVar) {
        this.f52299a = pVar;
    }

    @Override // gl.u
    public final void onAdClick() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f52299a.M;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClick();
        }
    }

    @Override // gl.u
    public final void onAdLoaded(View view) {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f52299a.M;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdLoaded(view);
        }
    }

    @Override // gl.u
    public final void onAdShow(AdInfo adInfo) {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f52299a.M;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdShow(adInfo);
        }
    }
}
