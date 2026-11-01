package yads;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wo2 {
    public static xo2 a() {
        xo2 xo2Var;
        xo2 xo2Var2 = xo2.f84663b;
        if (xo2Var2 != null) {
            return xo2Var2;
        }
        synchronized (xo2.f84662a) {
            xo2Var = xo2.f84663b;
            if (xo2Var == null) {
                xo2Var = new xo2();
                xo2.f84663b = xo2Var;
            }
        }
        return xo2Var;
    }
}
