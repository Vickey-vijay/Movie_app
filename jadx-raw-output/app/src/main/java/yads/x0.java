package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x0 {
    public static z0 a() {
        z0 z0Var;
        Object obj = z0.f85159f;
        z0 z0Var2 = z0.f85160g;
        if (z0Var2 != null) {
            return z0Var2;
        }
        synchronized (z0.f85159f) {
            z0Var = z0.f85160g;
            if (z0Var == null) {
                z0Var = new z0();
                z0.f85160g = z0Var;
            }
        }
        return z0Var;
    }
}
