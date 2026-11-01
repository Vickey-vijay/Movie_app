package yads;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bp0 {
    public static dp0 a() {
        dp0 dp0Var;
        dp0 dp0Var2 = dp0.f76766d;
        if (dp0Var2 != null) {
            return dp0Var2;
        }
        synchronized (dp0.f76765c) {
            dp0Var = dp0.f76766d;
            if (dp0Var == null) {
                dp0Var = new dp0();
                dp0.f76766d = dp0Var;
            }
        }
        return dp0Var;
    }
}
