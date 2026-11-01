package yads;

/* JADX INFO: loaded from: classes9.dex */
public abstract class sr2 {
    public static tr2 a() {
        if (tr2.f83152d == null) {
            synchronized (tr2.f83151c) {
                if (tr2.f83152d == null) {
                    tr2.f83152d = new tr2(new ki2(), new oy0());
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        tr2 tr2Var = tr2.f83152d;
        if (tr2Var != null) {
            return tr2Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
