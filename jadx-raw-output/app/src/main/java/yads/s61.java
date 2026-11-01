package yads;

import yads.s61;

/* JADX INFO: loaded from: classes2.dex */
public final class s61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt1 f82531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l00 f82532b;

    public final void a() {
        nt1 nt1Var = this.f82531a;
        nt1Var.f80754a.f81141a.execute(new Runnable() { // from class: cp.t9
            @Override // java.lang.Runnable
            public final void run() {
                s61.a(this.f51600b);
            }
        });
    }

    public s61(nt1 nt1Var, l00 l00Var) {
        this.f82531a = nt1Var;
        this.f82532b = l00Var;
    }

    public static final void a(s61 s61Var) {
        s61Var.f82532b.onInitializationCompleted();
    }
}
