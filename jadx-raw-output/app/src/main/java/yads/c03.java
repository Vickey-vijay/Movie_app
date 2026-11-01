package yads;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c03 {
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    public static final boolean a(Context context, v9 v9Var, nv0 nv0Var, mm mmVar, a03 a03Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        mmVar.getClass();
        int iC = nv0Var.c(context);
        int iA = nv0Var.a(context);
        if (iC > 0 && iA > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z14 = v9Var.f83834z;
        Context applicationContext = context.getApplicationContext();
        int iC2 = a03Var.c(applicationContext);
        int iA2 = a03Var.a(applicationContext);
        int iC3 = nv0Var.c(applicationContext);
        int iA3 = nv0Var.a(applicationContext);
        int iOrdinal = a03Var.b().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (iC3 > iC2) {
                    }
                    z11 = false;
                } else {
                    z11 = true;
                }
            } else if (iC3 > iC2 && iC2 > 0 && (iA3 <= iA2 || iA2 == 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else if (iC3 <= iC2 && iC2 > 0 && iA3 <= iA2) {
            z11 = true;
        } else {
            z11 = false;
        }
        int iD = kl3.d(applicationContext);
        int iB = kl3.b(applicationContext);
        int iC4 = nv0Var.c(applicationContext);
        int iA4 = nv0Var.a(applicationContext);
        if (iC4 <= iD && iA4 <= iB) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z14 && (!z10 || !z13)) {
            return false;
        }
        return true;
    }
}
