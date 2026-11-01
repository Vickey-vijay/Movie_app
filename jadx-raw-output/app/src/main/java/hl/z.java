package hl;

import Lil.I1I;
import android.app.Activity;
import android.view.View;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.util.AdLog;
import j.l0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends l0 {
    public final Activity E;
    public final MainThirdBannerCallBack F;
    public int G;
    public int H;

    @Override // j.l0
    public final int t() {
        return 30;
    }

    public z(Activity activity, String str, MainThirdBannerCallBack mainThirdBannerCallBack) {
        super(activity, "ThirdBanner", str, mainThirdBannerCallBack);
        this.E = activity;
        this.F = mainThirdBannerCallBack;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        i0 i0Var = new i0(this);
        j.e0 e0Var = new j.e0(this.f61535a, this.f61536b, i0Var);
        I1I i1i = new I1I();
        e0Var.setLoadTimeOut(this.f61557w);
        e0Var.loadAd();
        int i11 = this.G;
        int i12 = this.H;
        e0Var.f61482b = i11;
        e0Var.f61483c = i12;
        e0Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        e0Var.setRefreshAdCache(this.f61544j);
        i0Var.f53961a = e0Var;
        i0Var.f53962b = this;
        i0Var.f53963c = objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false;
        return i1i;
    }

    @Override // j.l0
    public final a.a a() {
        return a.g.i();
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainThirdBannerCallBack mainThirdBannerCallBack = this.F;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        int i10;
        int i11;
        super.o(y1Var, bVar);
        try {
            j.e0 e0Var = (j.e0) y1Var;
            e0Var.f61485e = new h0(this);
            fl.j jVar = e0Var.f61484d;
            if (jVar != null) {
                jVar.D = false;
            }
            if (jVar != null) {
                jVar.D();
            }
            View view = bVar.f54016e;
            i.e thirdParams = e0Var.getThirdParams();
            if (thirdParams == null || (i10 = thirdParams.f54039d) == 0) {
                i10 = 1000;
            }
            int i12 = i10;
            if (thirdParams == null || (i11 = thirdParams.f54040e) == 0) {
                i11 = 570;
            }
            View viewG = g(this.E, view, i12, i11, this.G, this.H, false);
            MainThirdBannerCallBack mainThirdBannerCallBack = this.F;
            if (mainThirdBannerCallBack != null) {
                mainThirdBannerCallBack.onAdLoaded(viewG);
            }
            fl.j jVar2 = e0Var.f61484d;
            if (jVar2 != null) {
                jVar2.C();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            p(e10);
        }
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqThirdBanner(this.f61535a, 30, this.f61538d, this.f61536b, new k(this));
    }
}
