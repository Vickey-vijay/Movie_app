package hl;

import android.view.View;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements MainNativeAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f53969a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f53970b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53971c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f53972d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f53973e;

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoComplete() {
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoStart() {
    }

    public m(b0 b0Var) {
        this.f53973e = b0Var;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f53972d;
        aVar.f54011e = i10;
        aVar.f54012f = str;
        if (this.f53971c) {
            this.f53973e.v(aVar);
        } else {
            this.f53973e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdLoaded(View view) {
        double revenue = this.f53969a.getRevenue();
        i.a aVar = this.f53972d;
        aVar.f54007a = revenue;
        aVar.f54008b = this.f53969a;
        aVar.f54009c = this.f53970b;
        aVar.f54010d = view;
        if (this.f53971c) {
            this.f53973e.c(aVar);
        } else {
            this.f53973e.z(aVar);
        }
    }
}
