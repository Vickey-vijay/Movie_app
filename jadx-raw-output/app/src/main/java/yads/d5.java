package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d5 {
    public static e5 a() {
        e5 e5Var;
        e5 e5Var2 = e5.f76916d;
        if (e5Var2 != null) {
            return e5Var2;
        }
        synchronized (e5.f76915c) {
            e5Var = e5.f76916d;
            if (e5Var == null) {
                e5Var = new e5();
                e5.f76916d = e5Var;
            }
        }
        return e5Var;
    }
}
