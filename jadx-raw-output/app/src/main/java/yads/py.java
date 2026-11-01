package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class py implements cn1, pk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f81644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bn1 f81645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ok0 f81646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry f81647d;

    public final hm1 a(hm1 hm1Var) {
        ry ryVar = this.f81647d;
        long j10 = hm1Var.f78282f;
        ryVar.getClass();
        ry ryVar2 = this.f81647d;
        long j11 = hm1Var.f78283g;
        ryVar2.getClass();
        return (j10 == hm1Var.f78282f && j11 == hm1Var.f78283g) ? hm1Var : new hm1(hm1Var.f78277a, hm1Var.f78278b, hm1Var.f78279c, hm1Var.f78280d, hm1Var.f78281e, j10, j11);
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f81645b.a(a(hm1Var));
        }
    }

    @Override // yads.pk0
    public final void c(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f81646c.c();
        }
    }

    public py(ry ryVar, Object obj) {
        this.f81647d = ryVar;
        this.f81645b = ryVar.b((ym1) null);
        this.f81646c = ryVar.a((ym1) null);
        this.f81644a = obj;
    }

    public final boolean e(int i10, ym1 ym1Var) {
        ym1 ym1VarA;
        if (ym1Var != null) {
            ym1VarA = this.f81647d.a(this.f81644a, ym1Var);
            if (ym1VarA == null) {
                return false;
            }
        } else {
            ym1VarA = null;
        }
        this.f81647d.getClass();
        bn1 bn1Var = this.f81645b;
        if (bn1Var.f75910a != i10 || !ib3.a(bn1Var.f75911b, ym1VarA)) {
            this.f81645b = new bn1(this.f81647d.f80295c.f75912c, i10, ym1VarA, 0L);
        }
        ok0 ok0Var = this.f81646c;
        if (ok0Var.f81062a == i10 && ib3.a(ok0Var.f81063b, ym1VarA)) {
            return true;
        }
        this.f81646c = new ok0(this.f81647d.f80296d.f81064c, i10, ym1VarA);
        return true;
    }

    @Override // yads.pk0
    public final void b(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f81646c.d();
        }
    }

    @Override // yads.cn1
    public final void c(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f81645b.a(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.pk0
    public final void d(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f81646c.b();
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f81646c.a();
        }
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f81645b.c(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, int i11) {
        if (e(i10, ym1Var)) {
            this.f81646c.a(i11);
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, Exception exc) {
        if (e(i10, ym1Var)) {
            this.f81646c.a(exc);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f81645b.b(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10) {
        if (e(i10, ym1Var)) {
            this.f81645b.a(vf1Var, a(hm1Var), iOException, z10);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f81645b.b(a(hm1Var));
        }
    }
}
