package yads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class w12 implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j52 f84077a;

    @Override // yads.yb
    public final boolean a() {
        View viewA;
        l12 l12Var = ((k12) this.f84077a).f79281d;
        return (l12Var == null || (viewA = l12Var.f79682c.a()) == null || kl3.f79470a.a(viewA).f84628a < 1) ? false : true;
    }

    public w12(j52 j52Var) {
        this.f84077a = j52Var;
    }
}
