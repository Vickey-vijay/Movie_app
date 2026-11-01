package hl;

import android.view.View;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements MainThirdBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f53961a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f53962b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53963c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f53964d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f53965e;

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    public i0(z zVar) {
        this.f53965e = zVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f53964d;
        aVar.f54011e = i10;
        aVar.f54012f = str;
        if (this.f53963c) {
            this.f53965e.v(aVar);
        } else {
            this.f53965e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdLoaded(View view) {
        double revenue = this.f53961a.getRevenue();
        i.a aVar = this.f53964d;
        aVar.f54007a = revenue;
        aVar.f54008b = this.f53961a;
        aVar.f54009c = this.f53962b;
        aVar.f54010d = view;
        if (this.f53963c) {
            this.f53965e.c(aVar);
        } else {
            this.f53965e.z(aVar);
        }
    }
}
