package hl;

import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements MainSplashAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f53980a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f53981b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53982c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f53983d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f53984e;

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdComplete() {
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdSkipped() {
    }

    public r(l lVar) {
        this.f53984e = lVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f53983d;
        aVar.f54011e = i10;
        aVar.f54012f = str;
        if (this.f53982c) {
            this.f53984e.v(aVar);
        } else {
            this.f53984e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdLoaded() {
        double revenue = this.f53980a.getRevenue();
        i.a aVar = this.f53983d;
        aVar.f54007a = revenue;
        aVar.f54008b = this.f53980a;
        aVar.f54009c = this.f53981b;
        if (this.f53982c) {
            this.f53984e.c(aVar);
        } else {
            this.f53984e.z(aVar);
        }
    }
}
