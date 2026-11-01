package f;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import gl.n0;
import j.p1;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends x {
    public n0 D;
    public MainBannerCallBack E;

    @Override // j.n0
    public final boolean b() {
        return true;
    }

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        int i10;
        int i11;
        try {
            i.e eVar = this.f61590k;
            String str = eVar.f54038c;
            this.E = p1Var;
            n0 n0Var = new n0(activity, this.f61588i, this.f61585f, str, eVar, this.f61603x, new h0(this));
            this.D = n0Var;
            n0Var.f53564v = this.f61598s;
            i.e eVar2 = this.f61590k;
            if (eVar2 == null || (i10 = eVar2.f54039d) == 0) {
                i10 = 1000;
            }
            if (eVar2 == null || (i11 = eVar2.f54040e) == 0) {
                i11 = 570;
            }
            int i12 = this.B;
            int i13 = this.C;
            n0Var.f53547e = i10;
            n0Var.f53548f = i11;
            n0Var.f53549g = i12;
            n0Var.f53550h = i13;
            n0Var.f53552j = new e0(this);
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
            n0 n0Var = this.D;
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
