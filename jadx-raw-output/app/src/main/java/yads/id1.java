package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class id1 {
    public static hd1 a(Context context, iu3 iu3Var) {
        Context applicationContext = context.getApplicationContext();
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(applicationContext);
        if (nt2VarA != null && nt2VarA.F) {
            rh1 rh1Var = new rh1(applicationContext);
            mh1 mh1Var = new mh1();
            gd1 gd1Var = new gd1(iu3Var);
            Object obj2 = qd1.f81830c;
            return new ps(applicationContext, rh1Var, mh1Var, gd1Var, pd1.a(), new ii2());
        }
        return new io(applicationContext, new rh1(applicationContext), new mh1(), new gd1(iu3Var));
    }
}
