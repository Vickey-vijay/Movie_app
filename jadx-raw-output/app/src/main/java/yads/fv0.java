package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class fv0 implements zg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f77502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g62 f77503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gv0 f77504c;

    @Override // yads.zg3
    public final void c() {
    }

    @Override // yads.zg3
    public final void a() {
        this.f77502a.a(v5.f83756p);
        this.f77503b.a();
        this.f77504c.a();
    }

    @Override // yads.zg3
    public final void b() {
        this.f77502a.a(v5.f83756p);
        this.f77503b.a();
        this.f77504c.f77951e.a(y30.f84802f);
    }

    public fv0(w5 w5Var, g62 g62Var, z52 z52Var, Iterator it, z30 z30Var) {
        this.f77502a = w5Var;
        this.f77503b = g62Var;
        this.f77504c = new gv0(w5Var, g62Var, z52Var, it, z30Var);
    }
}
