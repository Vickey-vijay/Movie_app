package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile y92 f85256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f85257b = new Object();

    public static final y92 a(Context context) {
        if (f85256a == null) {
            synchronized (f85257b) {
                if (f85256a == null) {
                    f85256a = new y92(ug1.a(context, "YadPreferenceFile"));
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        y92 y92Var = f85256a;
        if (y92Var != null) {
            return y92Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
