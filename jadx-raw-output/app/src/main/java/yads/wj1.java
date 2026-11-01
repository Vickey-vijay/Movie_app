package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class wj1 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj1 f84222b;

    public wj1(int i10, qj1 qj1Var) {
        this.f84221a = i10;
        this.f84222b = qj1Var;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        int iC;
        int iC2 = kl3.c(context);
        int i10 = context.getResources().getDisplayMetrics().widthPixels;
        Float fA = this.f84222b.a();
        if (fA != null) {
            iC = ek.b.c(fA.floatValue() * iC2);
        } else {
            iC = 0;
        }
        if (i10 - iC < this.f84221a) {
            return false;
        }
        return true;
    }
}
