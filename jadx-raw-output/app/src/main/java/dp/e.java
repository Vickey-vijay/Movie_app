package dp;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import j.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends u {
    public Activity F;
    public MainMaterialCallback G;
    public d.i H;
    public String I = "";
    public String J = "";
    public final m K = new m(this);
    public final s L = new s(this);

    @Override // dp.u
    public final void B(Activity activity, l1 l1Var) {
        this.F = activity;
        this.G = l1Var;
        i.e eVar = this.f61590k;
        this.I = eVar.f54036a;
        this.J = eVar.f54038c;
        AdLog.d("appID " + this.I + ", posID " + this.J);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.I, new r0(this, activity));
    }

    @Override // dp.u
    public final void C() {
        try {
            d.i iVar = this.H;
            if (iVar != null) {
                gl.h.a(iVar.f51766a);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
