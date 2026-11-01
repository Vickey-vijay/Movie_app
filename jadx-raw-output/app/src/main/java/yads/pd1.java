package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pd1 {
    public static qd1 a() {
        if (qd1.f81831d == null) {
            synchronized (qd1.f81830c) {
                if (qd1.f81831d == null) {
                    qd1.f81831d = new qd1(new ki2(), new oy0());
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        qd1 qd1Var = qd1.f81831d;
        if (qd1Var != null) {
            return qd1Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
