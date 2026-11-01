package hl;

import android.view.View;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements MainMRECCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f53947a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f53948b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53949c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f53950d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f53951e;

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    public e(w wVar) {
        this.f53951e = wVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f53950d;
        aVar.f54011e = i10;
        aVar.f54012f = str;
        if (this.f53949c) {
            this.f53951e.v(aVar);
        } else {
            this.f53951e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdLoaded(View view) {
        double revenue = this.f53947a.getRevenue();
        i.a aVar = this.f53950d;
        aVar.f54007a = revenue;
        aVar.f54008b = this.f53947a;
        aVar.f54009c = this.f53948b;
        aVar.f54010d = view;
        if (this.f53949c) {
            this.f53951e.c(aVar);
        } else {
            this.f53951e.z(aVar);
        }
    }
}
