package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cw2 {
    public static dw2 a() {
        dw2 dw2Var;
        dw2 dw2Var2 = dw2.f76820k;
        if (dw2Var2 != null) {
            return dw2Var2;
        }
        synchronized (dw2.f76819j) {
            dw2Var = dw2.f76820k;
            if (dw2Var == null) {
                dw2Var = new dw2();
                dw2.f76820k = dw2Var;
            }
        }
        return dw2Var;
    }
}
