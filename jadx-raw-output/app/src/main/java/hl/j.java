package hl;

import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements MainInterstitialAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f53966a;

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdLoaded() {
    }

    public j(q qVar) {
        this.f53966a = qVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f53966a.q("onAdClick");
        this.f53966a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f53966a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdClose() {
        this.f53966a.q("onAdClose");
        this.f53966a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f53966a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f53966a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f53966a.q("onAdShow");
        this.f53966a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f53966a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoComplete() {
        this.f53966a.q("onAdVideoComplete");
        this.f53966a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f53966a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoComplete();
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoStart() {
        this.f53966a.q("onAdVideoStart");
        this.f53966a.getClass();
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f53966a.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoStart();
        }
    }
}
