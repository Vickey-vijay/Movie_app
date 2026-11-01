package yads;

import android.app.Dialog;

/* JADX INFO: loaded from: classes7.dex */
public final class mq2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir2 f80322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nq2 f80323b;

    @Override // yads.t2
    public final void b() {
        ir2 ir2Var = this.f80322a;
        ir2Var.f78780d = true;
        Dialog dialog = ((ei0) ir2Var.f78778b).f77085f;
        if (dialog != null) {
            ng0.a(dialog);
        }
        ((q2) this.f80323b.f80730a).a(13, null);
    }

    public mq2(ir2 ir2Var, nq2 nq2Var) {
        this.f80322a = ir2Var;
        this.f80323b = nq2Var;
    }
}
