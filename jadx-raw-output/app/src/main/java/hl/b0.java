package hl;

import Lil.I1I;
import android.app.Activity;
import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;
import j.l0;
import j.s0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends l0 {
    public final Activity E;
    public final MainNativeAdCallBack F;
    public int G;
    public int H;

    @Override // j.l0
    public final int t() {
        return 11;
    }

    public b0(Activity activity, String str, MainNativeAdCallBack mainNativeAdCallBack) {
        super(activity, "信息流", str, mainNativeAdCallBack);
        this.E = activity;
        this.F = mainNativeAdCallBack;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        m mVar = new m(this);
        s0 s0Var = new s0(this.f61535a, this.f61536b, mVar);
        I1I i1i = new I1I();
        s0Var.setLoadTimeOut(this.f61557w);
        s0Var.loadAd();
        int i11 = this.G;
        int i12 = this.H;
        s0Var.f61639b = i11;
        s0Var.f61640c = i12;
        s0Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        s0Var.setRefreshAdCache(this.f61544j);
        mVar.f53969a = s0Var;
        mVar.f53970b = this;
        mVar.f53971c = objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false;
        return i1i;
    }

    @Override // j.l0
    public final a.a a() {
        return a.f.i();
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainNativeAdCallBack mainNativeAdCallBack = this.F;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((s0) y1Var).f61642e = new n(this);
            View viewG = g(this.E, bVar.f54016e, IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 465, this.G, this.H, false);
            MainNativeAdCallBack mainNativeAdCallBack = this.F;
            if (mainNativeAdCallBack != null) {
                mainNativeAdCallBack.onAdLoaded(viewG);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage());
            p(e10);
        }
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqNaturalAd(this.f61535a, 11, this.f61538d, this.f61536b, new g(this));
    }
}
