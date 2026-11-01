package yads;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iu1 {
    public static ju1 a() {
        ju1 ju1Var;
        ju1 ju1Var2 = ju1.f79192b;
        if (ju1Var2 != null) {
            return ju1Var2;
        }
        synchronized (ju1.f79193c) {
            ju1Var = ju1.f79192b;
            if (ju1Var == null) {
                ju1Var = new ju1();
                ju1.f79192b = ju1Var;
            }
        }
        return ju1Var;
    }
}
