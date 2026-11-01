package hl;

import Lil.I1I;
import android.app.Activity;
import android.view.View;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import j.l0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends l0 {
    public final Activity E;
    public final MainMaterialCallback F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;

    @Override // j.l0
    public final int t() {
        return 28;
    }

    public b(Activity activity, String str, MainMaterialCallback mainMaterialCallback) {
        super(activity, "暂停插屏", str, mainMaterialCallback);
        this.I = false;
        this.J = true;
        this.E = activity;
        this.F = mainMaterialCallback;
    }

    @Override // j.l0
    public final a.a a() {
        if (a.h.f3411c == null) {
            synchronized (a.h.class) {
                if (a.h.f3411c == null) {
                    a.h.f3411c = new a.h();
                }
            }
        }
        return a.h.f3411c;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        s sVar = new s(this);
        j.d dVar = new j.d(this.f61535a, this.f61536b, sVar);
        I1I i1i = new I1I();
        dVar.setLoadTimeOut(this.f61557w);
        int i11 = this.G;
        int i12 = this.H;
        dVar.f61465c = i11;
        dVar.f61466d = i12;
        dVar.f61467e = this.I;
        dVar.f61468f = this.J;
        dVar.loadAd();
        dVar.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        dVar.setRefreshAdCache(this.f61544j);
        sVar.f53985a = dVar;
        sVar.f53986b = this;
        return i1i;
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainMaterialCallback mainMaterialCallback = this.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((j.d) y1Var).f61469g = new t(this);
            View viewG = g(this.E, bVar.f54016e, 1000, 570, this.G, this.H, false);
            MainMaterialCallback mainMaterialCallback = this.F;
            if (mainMaterialCallback != null) {
                mainMaterialCallback.onAdLoaded(viewG);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            p(e10);
        }
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqPauseInterstitialAd(this.f61535a, 28, this.f61538d, this.f61536b, new y(this));
    }
}
