package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y1 {
    public static z1 a() {
        z1 z1Var;
        z1 z1Var2 = z1.f85174c;
        if (z1Var2 != null) {
            return z1Var2;
        }
        synchronized (z1.f85173b) {
            z1Var = z1.f85174c;
            if (z1Var == null) {
                z1Var = new z1();
                z1.f85174c = z1Var;
            }
        }
        return z1Var;
    }
}
