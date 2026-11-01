package hl;

import Lil.I1I;
import android.app.Activity;
import android.view.View;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import j.l0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends l0 {
    public final Activity E;
    public final MainBannerCallBack F;
    public int G;
    public int H;

    @Override // j.l0
    public final int t() {
        return 18;
    }

    public i(Activity activity, String str, MainBannerCallBack mainBannerCallBack) {
        super(activity, "Banner", str, mainBannerCallBack);
        this.E = activity;
        this.F = mainBannerCallBack;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        f fVar = new f(this);
        j.b0 b0Var = new j.b0(this.f61535a, this.f61536b, fVar);
        I1I i1i = new I1I();
        b0Var.setLoadTimeOut(this.f61557w);
        b0Var.loadAd();
        int i11 = this.G;
        int i12 = this.H;
        b0Var.f61445b = i11;
        b0Var.f61446c = i12;
        b0Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        b0Var.setRefreshAdCache(this.f61544j);
        fVar.f53953a = b0Var;
        fVar.f53954b = this;
        fVar.f53955c = objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false;
        return i1i;
    }

    @Override // j.l0
    public final a.a a() {
        return a.e.i();
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainBannerCallBack mainBannerCallBack = this.F;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((j.b0) y1Var).f61448e = new c(this);
            View viewG = g(this.E, bVar.f54016e, 1000, 570, this.G, this.H, false);
            MainBannerCallBack mainBannerCallBack = this.F;
            if (mainBannerCallBack != null) {
                mainBannerCallBack.onAdLoaded(viewG);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            p(e10);
        }
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqBannerAd(this.f61535a, 18, this.f61538d, this.f61536b, new d(this));
    }
}
