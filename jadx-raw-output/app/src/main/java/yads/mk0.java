package yads;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public interface mk0 {
    void a(ok0 ok0Var);

    boolean a();

    boolean a(String str);

    UUID b();

    void b(ok0 ok0Var);

    lk0 c();

    k20 d();

    int getState();

    static void a(mk0 mk0Var, mk0 mk0Var2) {
        if (mk0Var == mk0Var2) {
            return;
        }
        if (mk0Var2 != null) {
            mk0Var2.b(null);
        }
        if (mk0Var != null) {
            mk0Var.a((ok0) null);
        }
    }
}
