package hl;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements MainMaterialCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f53985a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f53986b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.a f53987c = new i.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f53988d;

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoComplete() {
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoStart() {
    }

    public s(b bVar) {
        this.f53988d = bVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f53987c;
        aVar.f54011e = i10;
        aVar.f54012f = str;
        this.f53988d.B(aVar);
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdLoaded(View view) {
        double revenue = this.f53985a.getRevenue();
        i.a aVar = this.f53987c;
        aVar.f54007a = revenue;
        aVar.f54008b = this.f53985a;
        aVar.f54009c = this.f53986b;
        aVar.f54010d = view;
        this.f53988d.z(aVar);
    }
}
