package yads;

import yads.q62;

/* JADX INFO: loaded from: classes11.dex */
public final class q62 implements ef3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s62 f81727a;

    public static final void a(s62 s62Var) {
        s62Var.a(s62Var.f82539g);
    }

    public q62(s62 s62Var) {
        this.f81727a = s62Var;
    }

    @Override // yads.ef3
    public final void b() {
        final s62 s62Var = this.f81727a;
        s62Var.f82544l = null;
        my2 my2Var = s62Var.f82535c;
        if (my2Var == null || !my2Var.f80466d) {
            s62Var.f82541i.a();
        } else {
            nh1 nh1Var = s62Var.f82543k;
            nh1Var.f80674a.post(new Runnable() { // from class: cp.q8
                @Override // java.lang.Runnable
                public final void run() {
                    q62.a(s62Var);
                }
            });
        }
        this.f81727a.f82534b.b();
    }

    @Override // yads.ef3
    public final void c() {
        e72 e72Var = (e72) this.f81727a.f82533a.b();
        if (e72Var != null) {
            e72Var.setClickable(true);
        }
    }

    @Override // yads.ef3
    public final void a() {
        this.f81727a.f82534b.a();
    }
}
