package hl;

import Lil.I1I;
import android.app.Activity;
import android.view.View;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.WorldNativeImgParams;
import com.yk.e.object.WorldNativeLyParams;
import com.yk.e.object.WorldNativeTagParams;
import com.yk.e.object.WorldNativeTvParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import j.l0;
import j.m2;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends l0 {
    public final Activity E;
    public final MainWdNativeAdCallback F;
    public int G;
    public int H;
    public WorldNativeTvParams I;
    public WorldNativeTvParams J;
    public WorldNativeTvParams K;
    public WorldNativeImgParams L;
    public WorldNativeLyParams M;
    public WorldNativeLyParams N;
    public WorldNativeLyParams O;
    public WorldNativeTagParams P;

    @Override // j.l0
    public final int t() {
        return 29;
    }

    public h(Activity activity, String str, MainWdNativeAdCallback mainWdNativeAdCallback) {
        super(activity, "文案信息流", str, mainWdNativeAdCallback);
        this.E = activity;
        this.F = mainWdNativeAdCallback;
    }

    @Override // j.l0
    public final a.a a() {
        if (a.j.f3415c == null) {
            synchronized (a.j.class) {
                if (a.j.f3415c == null) {
                    a.j.f3415c = new a.j();
                }
            }
        }
        return a.j.f3415c;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        p pVar = new p(this);
        m2 m2Var = new m2(this.f61535a, this.f61536b, pVar);
        I1I i1i = new I1I();
        m2Var.setLoadTimeOut(this.f61557w);
        m2Var.loadAd();
        int i11 = this.G;
        int i12 = this.H;
        m2Var.f61569c = i11;
        m2Var.f61570d = i12;
        m2Var.f61577k = this.N;
        m2Var.f61579m = this.P;
        m2Var.f61578l = this.O;
        m2Var.f61576j = this.M;
        m2Var.f61574h = this.K;
        m2Var.f61575i = this.L;
        m2Var.f61573g = this.J;
        m2Var.f61572f = this.I;
        m2Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        m2Var.setRefreshAdCache(this.f61544j);
        pVar.f53976a = m2Var;
        pVar.f53977b = this;
        return i1i;
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainWdNativeAdCallback mainWdNativeAdCallback = this.F;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((m2) y1Var).f61571e = new d0(this);
            View view = bVar.f54016e;
            int dimensionPixelOffset = this.E.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.E, "dp_135"));
            View viewG = g(this.E, view, -1, dimensionPixelOffset, -1, dimensionPixelOffset, true);
            MainWdNativeAdCallback mainWdNativeAdCallback = this.F;
            if (mainWdNativeAdCallback != null) {
                mainWdNativeAdCallback.onAdLoaded(viewG);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            p(e10);
        }
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqWorldNativeAd(this.f61535a, 29, this.f61538d, this.f61536b, new v(this));
    }
}
