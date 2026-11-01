package yads;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f76519a;

    @Override // yads.i2
    public final h2 a(Activity activity, RelativeLayout relativeLayout, q2 q2Var, b2 b2Var, Intent intent, Window window, x1 x1Var) {
        if (x1Var != null) {
            v9 v9Var = x1Var.f84404a;
            d4 d4Var = x1Var.f84405b;
            w02 w02Var = x1Var.f84408e;
            Object obj = dw2.f76819j;
            nt2 nt2VarA = cw2.a().a(window.getContext());
            if (w02Var != null) {
                return new g2(activity, relativeLayout, window, w02Var, v9Var, q2Var, b2Var, d4Var, this.f76519a, x1Var.f84409f, nt2VarA, new zx0(activity), new ey0(d4Var.f76559a));
            }
        }
        return null;
    }

    public d2(lu2 lu2Var) {
        this.f76519a = lu2Var;
    }
}
