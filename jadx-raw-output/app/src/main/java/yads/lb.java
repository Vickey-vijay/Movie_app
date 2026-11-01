package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class lb implements f32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ix0 f79740a;

    @Override // yads.f32
    public final void a(x51 x51Var) {
        lm2 lm2Var = this.f79740a.f78846a;
        jk.k kVar = ix0.f78845b[0];
        lm2Var.getClass();
        lm2Var.f79854a = new WeakReference(x51Var);
    }

    public lb(ix0 ix0Var) {
        this.f79740a = ix0Var;
    }
}
