package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m43 {
    public static n43 a() {
        if (n43.f80556b == null) {
            synchronized (n43.f80557c) {
                if (n43.f80556b == null) {
                    n43.f80556b = new n43();
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        n43 n43Var = n43.f80556b;
        if (n43Var != null) {
            return n43Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
