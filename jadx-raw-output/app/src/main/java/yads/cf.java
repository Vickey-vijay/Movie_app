package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class cf {
    public static final at1 a(Context context, cq3 cq3Var) {
        pu3 pu3Var = pu3.f81606a;
        if (ct1.f76420b == null) {
            synchronized (at1.f75620e) {
                if (ct1.f76420b == null) {
                    Context contextA = uz.a(context);
                    ct1.f76420b = ct1.a(contextA, ct1.f76419a.a(contextA), cq3Var);
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        at1 at1Var = ct1.f76420b;
        if (at1Var != null) {
            return at1Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
