package hl;

import Lil.I1I;
import android.app.Activity;
import android.view.View;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.util.AdLog;
import j.l0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends l0 {
    public final Activity E;
    public final MainMRECCallBack F;
    public int G;
    public int H;

    @Override // j.l0
    public final int t() {
        return 31;
    }

    public w(Activity activity, String str, MainMRECCallBack mainMRECCallBack) {
        super(activity, BrandSafetyUtils.f43552o, str, mainMRECCallBack);
        this.E = activity;
        this.F = mainMRECCallBack;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        e eVar = new e(this);
        j.c0 c0Var = new j.c0(this.f61535a, this.f61536b, eVar);
        I1I i1i = new I1I();
        c0Var.setLoadTimeOut(this.f61557w);
        c0Var.loadAd();
        int i11 = this.G;
        int i12 = this.H;
        c0Var.f61455b = i11;
        c0Var.f61456c = i12;
        c0Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        c0Var.setRefreshAdCache(this.f61544j);
        eVar.f53947a = c0Var;
        eVar.f53948b = this;
        eVar.f53949c = objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false;
        return i1i;
    }

    @Override // j.l0
    public final a.a a() {
        return a.i.i();
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainMRECCallBack mainMRECCallBack = this.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            j.c0 c0Var = (j.c0) y1Var;
            c0Var.f61458e = new o(this);
            h.j jVar = c0Var.f61457d;
            if (jVar != null) {
                jVar.D = false;
            }
            if (jVar != null) {
                jVar.D();
            }
            View viewG = g(this.E, bVar.f54016e, 1000, 570, this.G, this.H, false);
            MainMRECCallBack mainMRECCallBack = this.F;
            if (mainMRECCallBack != null) {
                mainMRECCallBack.onAdLoaded(viewG);
            }
            h.j jVar2 = c0Var.f61457d;
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
        MainSDK.getInstance().reqMrec(this.f61535a, 31, this.f61538d, this.f61536b, new e0(this));
    }
}
