package hl;

import Lil.I1I;
import android.app.Activity;
import com.yk.e.MainSDK;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import j.j1;
import j.l0;
import j.y1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends l0 {
    public final MainRewardVideoAdCallBack E;
    public int F;
    public String G;
    public String H;

    @Override // j.l0
    public final int t() {
        return 14;
    }

    public g0(Activity activity, String str, MainRewardVideoAdCallBack mainRewardVideoAdCallBack) {
        super(activity, "激励视频", str, mainRewardVideoAdCallBack);
        this.F = 1;
        this.G = "";
        this.H = "";
        this.E = mainRewardVideoAdCallBack;
    }

    @Override // j.l0
    public final I1I f(int i10, Object... objArr) {
        a aVar = new a(this);
        j1 j1Var = new j1(this.f61535a, this.f61536b, aVar);
        I1I i1i = new I1I();
        j1Var.setLoadTimeOut(this.f61557w);
        j1Var.loadAd();
        j1Var.f61523d = this.G;
        j1Var.f61524e = this.H;
        j1Var.f61522c = this.F;
        j1Var.startLoadData((Integer) objArr[0], (JSONArray) objArr[1]);
        j1Var.setRefreshAdCache(this.f61544j);
        aVar.f53937a = j1Var;
        aVar.f53938b = this;
        aVar.f53939c = objArr.length >= 3 ? ((Boolean) objArr[2]).booleanValue() : false;
        return i1i;
    }

    @Override // j.l0
    public final a.a a() {
        return a.l.i();
    }

    @Override // j.l0
    public final void b(int i10, String str) {
        super.b(i10, str);
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.E;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdFail(i10, str);
        }
    }

    @Override // j.l0
    public final void o(y1 y1Var, i.b bVar) {
        super.o(y1Var, bVar);
        try {
            ((j1) y1Var).f61525f = new a0(this);
            MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.E;
            if (mainRewardVideoAdCallBack != null) {
                mainRewardVideoAdCallBack.onAdVideoCache();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            p(e10);
        }
    }

    @Override // j.l0
    public final void y() {
        super.y();
        MainSDK.getInstance().reqRewardVideoAd(this.f61535a, 14, this.f61538d, this.f61536b, 1, new f0(this));
    }
}
