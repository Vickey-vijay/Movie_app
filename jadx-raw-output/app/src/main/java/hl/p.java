package hl;

import android.view.View;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements MainWdNativeAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f53976a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f53977b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.a f53978c = new i.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f53979d;

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdShow(AdInfo adInfo) {
    }

    public p(h hVar) {
        this.f53979d = hVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f53978c;
        aVar.f54011e = i10;
        aVar.f54012f = str;
        this.f53979d.B(aVar);
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdLoaded(View view) {
        double revenue = this.f53976a.getRevenue();
        i.a aVar = this.f53978c;
        aVar.f54007a = revenue;
        aVar.f54008b = this.f53976a;
        aVar.f54009c = this.f53977b;
        aVar.f54010d = view;
        this.f53979d.z(aVar);
    }
}
