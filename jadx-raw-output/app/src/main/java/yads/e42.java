package yads;

import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes2.dex */
public final class e42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj f76914a;

    public final d42 a() {
        o72 o72Var;
        Object obj = this.f76914a.f76286a.get(C3426d4.i.I0);
        d62 d62Var = null;
        on1 on1Var = obj instanceof on1 ? (on1) obj : null;
        if (on1Var != null) {
            d62 d62Var2 = on1Var.f81111b != null ? new d62() : null;
            o72Var = on1Var.f81110a != null ? new o72() : null;
            d62Var = d62Var2;
        } else {
            o72Var = null;
        }
        return new d42(d62Var, o72Var);
    }

    public e42(cj cjVar) {
        this.f76914a = cjVar;
    }
}
