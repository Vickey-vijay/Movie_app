package hl;

import Lil.I1I;
import android.app.Activity;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;
import j.l0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends l0 {
    public final MainInterstitialAdCallBack E;
    public boolean F;

    @Override // j.l0
    public final int t() {
        return 16;
    }

    public q(Activity activity, String str, MainInterstitialAdCallBack mainInterstitialAdCallBack) {
        super(activity, "插屏", str, mainInterstitialAdCallBack);
        this.F = true;
        this.E = mainInterstitialAdCallBack;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        u uVar = new u(this);
        j.a0 a0Var = new j.a0(this.f61535a, this.f61536b, uVar);
        I1I i1i = new I1I();
        a0Var.setLoadTimeOut(this.f61557w);
        a0Var.f61437c = this.F;
        a0Var.loadAd();
        a0Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        a0Var.setRefreshAdCache(this.f61544j);
        uVar.f53990a = a0Var;
        uVar.f53991b = this;
        uVar.f53992c = objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false;
        return i1i;
    }

    @Override // j.l0
    public final a.a a() {
        return a.k.i();
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.E;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((j.a0) y1Var).f61438d = new j(this);
            MainInterstitialAdCallBack mainInterstitialAdCallBack = this.E;
            if (mainInterstitialAdCallBack != null) {
                mainInterstitialAdCallBack.onAdLoaded();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            p(e10);
        }
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqInterstitialAd(this.f61535a, 16, this.f61538d, this.f61536b, new c0(this));
    }
}
