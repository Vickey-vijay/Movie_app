package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class en1 implements cn1, pk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gn1 f77138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bn1 f77139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ok0 f77140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in1 f77141d;

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f77140c.a();
        }
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f77139b.a(hm1Var);
        }
    }

    @Override // yads.pk0
    public final void c(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f77140c.c();
        }
    }

    public final boolean e(int i10, ym1 ym1Var) {
        ym1 ym1VarA = null;
        if (ym1Var != null) {
            gn1 gn1Var = this.f77138a;
            for (int i11 = 0; i11 < gn1Var.f77862c.size(); i11++) {
                if (((ym1) gn1Var.f77862c.get(i11)).f82314d == ym1Var.f82314d) {
                    ym1VarA = ym1Var.a(e.a(gn1Var.f77861b, ym1Var.f82311a));
                    break;
                }
            }
            if (ym1VarA == null) {
                return false;
            }
        }
        int i12 = i10 + this.f77138a.f77863d;
        bn1 bn1Var = this.f77139b;
        if (bn1Var.f75910a != i12 || !ib3.a(bn1Var.f75911b, ym1VarA)) {
            this.f77139b = new bn1(this.f77141d.f78731f.f75912c, i12, ym1VarA, 0L);
        }
        ok0 ok0Var = this.f77140c;
        if (ok0Var.f81062a == i12 && ib3.a(ok0Var.f81063b, ym1VarA)) {
            return true;
        }
        this.f77140c = new ok0(this.f77141d.f78732g.f81064c, i12, ym1VarA);
        return true;
    }

    public en1(in1 in1Var, gn1 gn1Var) {
        this.f77141d = in1Var;
        this.f77139b = in1Var.f78731f;
        this.f77140c = in1Var.f78732g;
        this.f77138a = gn1Var;
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, int i11) {
        if (e(i10, ym1Var)) {
            this.f77140c.a(i11);
        }
    }

    @Override // yads.pk0
    public final void b(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f77140c.d();
        }
    }

    @Override // yads.cn1
    public final void c(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f77139b.a(vf1Var, hm1Var);
        }
    }

    @Override // yads.pk0
    public final void d(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f77140c.b();
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, Exception exc) {
        if (e(i10, ym1Var)) {
            this.f77140c.a(exc);
        }
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f77139b.c(vf1Var, hm1Var);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f77139b.b(vf1Var, hm1Var);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10) {
        if (e(i10, ym1Var)) {
            this.f77139b.a(vf1Var, hm1Var, iOException, z10);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f77139b.b(hm1Var);
        }
    }
}
