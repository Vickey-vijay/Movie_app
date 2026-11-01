package yads;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ip0 {
    public static kp0 a() {
        kp0 kp0Var;
        kp0 kp0Var2 = kp0.f79520c;
        if (kp0Var2 != null) {
            return kp0Var2;
        }
        synchronized (kp0.f79519b) {
            kp0Var = kp0.f79520c;
            if (kp0Var == null) {
                kp0Var = new kp0();
                kp0.f79520c = kp0Var;
            }
        }
        return kp0Var;
    }
}
