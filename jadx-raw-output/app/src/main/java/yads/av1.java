package yads;

/* JADX INFO: loaded from: classes9.dex */
public abstract class av1 {
    public static bv1 a() {
        bv1 bv1Var;
        bv1 bv1Var2 = bv1.f75973b;
        if (bv1Var2 != null) {
            return bv1Var2;
        }
        synchronized (bv1.f75974c) {
            bv1Var = bv1.f75973b;
            if (bv1Var == null) {
                bv1Var = new bv1();
                bv1.f75973b = bv1Var;
            }
        }
        return bv1Var;
    }
}
