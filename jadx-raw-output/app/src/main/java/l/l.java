package l;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;
import gl.n0;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends r {
    public MainNativeAdCallBack B;
    public n0 C;

    @Override // j.n0
    public final boolean b() {
        return true;
    }

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        int i12;
        int i13;
        try {
            i.e eVar = this.f61590k;
            String str = eVar.f54038c;
            this.B = zVar;
            n0 n0Var = new n0(activity, this.f61588i, this.f61585f, str, eVar, this.f61603x, new v(this));
            this.C = n0Var;
            n0Var.f53564v = this.f61598s;
            i.e eVar2 = this.f61590k;
            if (eVar2 == null || (i12 = eVar2.f54039d) == 0) {
                i12 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
            }
            if (eVar2 == null || (i13 = eVar2.f54040e) == 0) {
                i13 = 465;
            }
            n0Var.f53547e = i12;
            n0Var.f53548f = i13;
            n0Var.f53549g = i10;
            n0Var.f53550h = i11;
            n0Var.f53552j = new c0(this);
            n0Var.b(activity);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // j.n0
    public final boolean t() {
        MaxAd maxAd;
        try {
            n0 n0Var = this.C;
            if (n0Var == null || (maxAd = n0Var.f53560r) == null || maxAd.getNativeAd() == null) {
                return true;
            }
            return maxAd.getNativeAd().isExpired();
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("isExpired error, msg = "), e10);
            return true;
        }
    }
}
