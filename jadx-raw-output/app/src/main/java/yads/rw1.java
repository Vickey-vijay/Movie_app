package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class rw1 {
    public final sw1 a(Context context) {
        sw1 sw1Var = sw1.f82786d;
        if (sw1Var == null) {
            synchronized (this) {
                sw1Var = sw1.f82786d;
                if (sw1Var == null) {
                    Object obj = dw2.f76819j;
                    nt2 nt2VarA = cw2.a().a(context);
                    sw1Var = new sw1(nt2VarA != null ? nt2VarA.f80757b : 0);
                    sw1.f82786d = sw1Var;
                }
            }
        }
        return sw1Var;
    }
}
