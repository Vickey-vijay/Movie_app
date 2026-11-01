package hl;

import android.view.View;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements MainThirdBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f53960a;

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdLoaded(View view) {
    }

    public h0(z zVar) {
        this.f53960a = zVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f53960a.q("onAdClick");
        this.f53960a.getClass();
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f53960a.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdClose() {
        this.f53960a.q("onAdClose");
        this.f53960a.getClass();
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f53960a.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f53960a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f53960a.q("onAdShow");
        this.f53960a.getClass();
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f53960a.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdShow(adInfo);
        }
    }
}
