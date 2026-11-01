package yads;

/* JADX INFO: loaded from: classes9.dex */
public abstract class st1 {
    public static ut1 a(lu2 lu2Var) {
        if (ut1.f83602g == null) {
            synchronized (ut1.f83601f) {
                if (ut1.f83602g == null) {
                    ut1.f83602g = new ut1(new nt1(new ot1()), new rt1(), new uu2(), lu2Var, tt1.f83169b);
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        ut1 ut1Var = ut1.f83602g;
        if (ut1Var != null) {
            return ut1Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
