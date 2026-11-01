package hl;

import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements MainSplashAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f53996a;

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdLoaded() {
    }

    public x(l lVar) {
        this.f53996a = lVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f53996a.q("onAdClick");
        this.f53996a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f53996a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdClose() {
        this.f53996a.q("onAdClose");
        this.f53996a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f53996a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdComplete() {
        this.f53996a.q("onAdVideoComplete");
        this.f53996a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f53996a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdComplete();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f53996a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f53996a.q("onAdShow");
        this.f53996a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f53996a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdSkipped() {
        this.f53996a.q("onAdSkipped");
        this.f53996a.getClass();
        MainSplashAdCallBack mainSplashAdCallBack = this.f53996a.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdSkipped();
        }
    }
}
