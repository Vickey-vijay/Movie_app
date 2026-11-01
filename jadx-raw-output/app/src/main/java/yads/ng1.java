package yads;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ng1 {
    public static og1 a() {
        og1 og1Var;
        og1 og1Var2 = og1.f81032e;
        if (og1Var2 != null) {
            return og1Var2;
        }
        synchronized (og1.f81031d) {
            og1Var = og1.f81032e;
            if (og1Var == null) {
                og1Var = new og1(new ey1(ey1.f77225c));
                og1.f81032e = og1Var;
            }
        }
        return og1Var;
    }
}
