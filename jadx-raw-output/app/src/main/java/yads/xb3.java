package yads;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xb3 {
    public static final void a(ou3 ou3Var, eo2 eo2Var) {
        String strA;
        Set setF;
        try {
            c cVarA = eo2Var.a();
            if (cVarA == null || (strA = cVarA.a()) == null) {
                strA = "";
            }
            c cVarA2 = eo2Var.a();
            if (cVarA2 == null || (setF = cVarA2.b()) == null) {
                setF = nj.q0.f();
            }
            ou3Var.a(strA);
            ou3Var.a(setF);
            Objects.toString(setF);
            boolean z10 = ad1.f75480a;
        } catch (Throwable th2) {
            th2.toString();
            boolean z11 = ad1.f75480a;
        }
    }
}
