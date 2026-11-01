package hl;

import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements MainInterstitialAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f53990a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f53991b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53992c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f53993d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f53994e;

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoComplete() {
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoStart() {
    }

    public u(q qVar) {
        this.f53994e = qVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f53993d;
        aVar.f54011e = i10;
        aVar.f54012f = str;
        if (this.f53992c) {
            this.f53994e.v(aVar);
        } else {
            this.f53994e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdLoaded() {
        double revenue = this.f53990a.getRevenue();
        i.a aVar = this.f53993d;
        aVar.f54007a = revenue;
        aVar.f54008b = this.f53990a;
        aVar.f54009c = this.f53991b;
        if (this.f53992c) {
            this.f53994e.c(aVar);
        } else {
            this.f53994e.z(aVar);
        }
    }
}
