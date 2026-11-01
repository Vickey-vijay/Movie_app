package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class bu1 {
    public final cu1 a() {
        cu1 cu1Var = cu1.f76434f;
        if (cu1Var == null) {
            synchronized (this) {
                cu1Var = cu1.f76434f;
                if (cu1Var == null) {
                    cu1Var = new cu1();
                    cu1.f76434f = cu1Var;
                }
            }
        }
        return cu1Var;
    }
}
