package dp;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import j.l1;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends u {
    public MainMaterialCallback F;
    public d.q G;
    public String H = "";
    public String I = "";
    public final j J = new j(this);
    public final o K = new o(this);

    @Override // dp.u
    public final void B(Activity activity, l1 l1Var) {
        this.F = l1Var;
        i.e eVar = this.f61590k;
        this.H = eVar.f54036a;
        this.I = eVar.f54038c;
        AdLog.d("appID " + this.H + ", posID " + this.I);
        this.G = new d.q(activity);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), new k0(this, activity), this.H);
    }

    @Override // dp.u
    public final void C() {
        try {
            d.q qVar = this.G;
            if (qVar != null) {
                gl.h.a(qVar.f51781c);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
