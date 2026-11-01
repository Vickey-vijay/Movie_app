package yads;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ap0 {
    public static cp0 a() {
        cp0 cp0Var;
        cp0 cp0Var2 = cp0.f76379d;
        if (cp0Var2 != null) {
            return cp0Var2;
        }
        synchronized (cp0.f76378c) {
            cp0Var = cp0.f76379d;
            if (cp0Var == null) {
                cp0Var = new cp0();
                cp0.f76379d = cp0Var;
            }
        }
        return cp0Var;
    }
}
