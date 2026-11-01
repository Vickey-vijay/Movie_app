package hl;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements MainRewardVideoAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f53937a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f53938b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53939c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f53940d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f53941e;

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoComplete() {
    }

    @Override // com.yk.e.callBack.MainRewardVideoAdCallBack
    public final void onReward(String str) {
    }

    public a(g0 g0Var) {
        this.f53941e = g0Var;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f53940d;
        aVar.f54011e = i10;
        aVar.f54012f = str;
        if (this.f53939c) {
            this.f53941e.v(aVar);
        } else {
            this.f53941e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainVideoAdCallBack
    public final void onAdVideoCache() {
        double revenue = this.f53937a.getRevenue();
        i.a aVar = this.f53940d;
        aVar.f54007a = revenue;
        aVar.f54008b = this.f53937a;
        aVar.f54009c = this.f53938b;
        if (this.f53939c) {
            this.f53941e.c(aVar);
        } else {
            this.f53941e.z(aVar);
        }
    }
}
