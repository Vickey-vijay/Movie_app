package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cr2 {
    public static br2 a(Context context, iu3 iu3Var) {
        Context applicationContext = context.getApplicationContext();
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(applicationContext);
        if (nt2VarA != null && nt2VarA.G) {
            rh1 rh1Var = new rh1(applicationContext);
            mh1 mh1Var = new mh1();
            ar2 ar2Var = new ar2(iu3Var);
            Object obj2 = tr2.f83151c;
            return new ts(applicationContext, rh1Var, mh1Var, ar2Var, sr2.a(), new ii2());
        }
        return new so(applicationContext, new rh1(applicationContext), new mh1(), new ar2(iu3Var));
    }
}
