package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class pr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr2 f81554a;

    public final or2 a(Context context, v9 v9Var, lu2 lu2Var, d4 d4Var) {
        qq2 qq2Var;
        if (v9Var == null || (qq2Var = v9Var.f83826r) == null) {
            return null;
        }
        if (qq2Var.f81937b) {
            yx2 yx2Var = qq2Var.f81939d;
            if (yx2Var != null) {
                return new wx2(yx2Var, new za(context, lu2Var, d4Var));
            }
            return null;
        }
        rv rvVar = qq2Var.f81938c;
        if (rvVar != null) {
            return new pv(this.f81554a, new bw2(rvVar.f82437b, rvVar.f82438c));
        }
        return null;
    }

    public pr2(wk2 wk2Var) {
        this.f81554a = wk2Var;
    }
}
