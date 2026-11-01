package hl;

import android.view.View;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements MainBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f53943a;

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdLoaded(View view) {
    }

    public c(i iVar) {
        this.f53943a = iVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f53943a.q("onAdClick");
        this.f53943a.getClass();
        MainBannerCallBack mainBannerCallBack = this.f53943a.F;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdClose() {
        this.f53943a.q("onAdClose");
        this.f53943a.getClass();
        MainBannerCallBack mainBannerCallBack = this.f53943a.F;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f53943a.u(i10, str);
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f53943a.q("onAdShow");
        this.f53943a.getClass();
        MainBannerCallBack mainBannerCallBack = this.f53943a.F;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdShow(adInfo);
        }
    }
}
