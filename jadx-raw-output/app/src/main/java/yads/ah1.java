package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ah1 {
    public static bh1 a(Context context) {
        if (bh1.f75823g == null) {
            synchronized (bh1.f75822f) {
                if (bh1.f75823g == null) {
                    eh1 eh1Var = new eh1();
                    dh1 dh1Var = new dh1();
                    Object obj = dw2.f76819j;
                    bh1.f75823g = new bh1(context, eh1Var, dh1Var, cw2.a(), new ox2());
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        bh1 bh1Var = bh1.f75823g;
        if (bh1Var != null) {
            return bh1Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
