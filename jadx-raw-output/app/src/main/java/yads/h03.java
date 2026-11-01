package yads;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h03 {
    public static f03 a(j7 j7Var) {
        k7 k7Var;
        r03 r03Var = (j7Var == null || (k7Var = j7Var.f78927b) == null) ? null : k7Var.f79322b;
        int i10 = r03Var == null ? -1 : g03.f77580a[r03Var.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return new zl3();
            }
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new se0();
    }
}
