package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g4 {
    public static h4 a(e82 e82Var) {
        m4 m4Var;
        int i10 = e82Var != null ? e82Var.f76976a : -1;
        boolean z10 = ad1.f75480a;
        if (204 == i10) {
            m4Var = m4.f80061d;
        } else {
            Map map = e82Var != null ? e82Var.f76978c : null;
            Integer numValueOf = e82Var != null ? Integer.valueOf(e82Var.f76976a) : null;
            if (numValueOf != null && 400 == numValueOf.intValue() && map != null && t01.b(map, u11.N)) {
                m4Var = m4.f80065h;
            } else if (403 == i10) {
                m4Var = m4.f80064g;
            } else if (404 == i10) {
                m4Var = m4.f80059b;
            } else if (500 > i10 || i10 > 599) {
                m4Var = -1 == i10 ? m4.f80069l : m4.f80062e;
            } else {
                m4Var = m4.f80063f;
            }
        }
        return new h4(m4Var, e82Var);
    }
}
