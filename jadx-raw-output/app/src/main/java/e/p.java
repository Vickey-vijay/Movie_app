package e;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import gl.n0;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends c0 {
    public n0 L;
    public MainWdNativeAdCallback M;

    @Override // j.n0
    public final boolean b() {
        return true;
    }

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        try {
            i.e eVar = this.f61590k;
            String str = eVar.f54038c;
            this.M = d0Var;
            n0 n0Var = new n0(activity, this.f61588i, this.f61585f, str, eVar, this.f61603x, new j(this));
            this.L = n0Var;
            n0Var.f53564v = this.f61598s;
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(IDUtil.getDimen(activity, "dp_135"));
            n0 n0Var2 = this.L;
            n0Var2.f53547e = -1;
            n0Var2.f53548f = dimensionPixelOffset;
            n0Var2.f53549g = -1;
            n0Var2.f53550h = dimensionPixelOffset;
            n0Var2.f53552j = new t(this);
            n0Var2.f53556n = true;
            n0Var2.b(activity);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // j.n0
    public final boolean t() {
        MaxAd maxAd;
        try {
            n0 n0Var = this.L;
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
