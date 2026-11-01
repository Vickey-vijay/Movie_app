package f;

import android.view.View;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements gl.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f52745a;

    public h0(o oVar) {
        this.f52745a = oVar;
    }

    @Override // gl.u
    public final void onAdClick() {
        MainBannerCallBack mainBannerCallBack = this.f52745a.E;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
    }

    @Override // gl.u
    public final void onAdLoaded(View view) {
        MainBannerCallBack mainBannerCallBack = this.f52745a.E;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdLoaded(view);
        }
    }

    @Override // gl.u
    public final void onAdShow(AdInfo adInfo) {
        MainBannerCallBack mainBannerCallBack = this.f52745a.E;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdShow(adInfo);
        }
    }
}
