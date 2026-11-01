package yads;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class iw1 extends hk3 {
    @Override // yads.hk3
    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        gw1 gw1Var = (gw1) b();
        if (gw1Var == null) {
            return;
        }
        kk3Var.a(gw1Var, oiVar);
        kk3Var.a(oiVar, new sv1(gw1Var));
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        gw1 gw1Var = (gw1) view;
        oj1 oj1Var = (oj1) obj;
        String str = oj1Var.f81054a;
        if (str != null && str.length() > 0) {
            gw1Var.setAspectRatio(oj1Var.f81055b);
            gw1Var.a(str, (fw1) null);
        }
    }

    public iw1(gw1 gw1Var) {
        super(gw1Var);
    }

    @Override // yads.hk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
