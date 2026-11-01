package dp;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import j.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends u {
    public gl.n0 F;
    public MainMaterialCallback G;
    public final w H = new w(this);

    @Override // j.n0
    public final boolean b() {
        return true;
    }

    @Override // dp.u
    public final void B(Activity activity, l1 l1Var) {
        int i10;
        int i11;
        try {
            i.e eVar = this.f61590k;
            String str = eVar.f54038c;
            this.G = l1Var;
            gl.n0 n0Var = new gl.n0(activity, this.f61588i, this.f61585f, str, eVar, this.f61603x, new l0(this));
            this.F = n0Var;
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
            n0Var.f53552j = new l(this);
            n0Var.f53555m = true;
            n0Var.f53554l = this.H;
            n0Var.b(activity);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // dp.u
    public final void C() {
        try {
            d.d dVar = this.F.f53553k;
            if (dVar != null) {
                gl.h.a(dVar.f51760b);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // j.n0
    public final boolean t() {
        MaxAd maxAd;
        try {
            gl.n0 n0Var = this.F;
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
