package hl;

import Lil.I1I;
import android.app.Activity;
import android.view.ViewGroup;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import j.d1;
import j.l0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends l0 {
    public final MainSplashAdCallBack E;
    public final ViewGroup F;
    public boolean G;

    @Override // j.l0
    public final int t() {
        return 13;
    }

    public l(Activity activity, String str, ViewGroup viewGroup, MainSplashAdCallBack mainSplashAdCallBack) {
        super(activity, "开屏", str, mainSplashAdCallBack);
        this.G = true;
        this.F = viewGroup;
        this.E = mainSplashAdCallBack;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        r rVar = new r(this);
        d1 d1Var = new d1(this.f61535a, this.f61536b, this.F, rVar);
        I1I i1i = new I1I();
        d1Var.setLoadTimeOut(this.f61557w);
        d1Var.f61476d = this.G;
        d1Var.loadAd();
        d1Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        d1Var.setRefreshAdCache(this.f61544j);
        rVar.f53980a = d1Var;
        rVar.f53981b = this;
        rVar.f53982c = objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false;
        return i1i;
    }

    @Override // j.l0
    public final a.a a() {
        return a.c.i();
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainSplashAdCallBack mainSplashAdCallBack = this.E;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((d1) y1Var).f61477e = new x(this);
            MainSplashAdCallBack mainSplashAdCallBack = this.E;
            if (mainSplashAdCallBack != null) {
                mainSplashAdCallBack.onAdLoaded();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            p(e10);
        }
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqSplashAd(this.f61535a, 13, this.f61538d, this.f61536b, 1, new j0(this));
    }
}
