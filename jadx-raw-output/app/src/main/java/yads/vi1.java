package yads;

import android.os.Handler;
import android.util.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class vi1 extends ry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mo f83926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f83927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r63 f83928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p63 f83929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ti1 f83930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public si1 f83931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f83932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f83933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f83934s;

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        si1 si1Var = new si1(ym1Var, qeVar, j10);
        si1Var.a(this.f83926k);
        if (this.f83933r) {
            si1Var.a(ym1Var.a(a(ym1Var.f82311a)));
        } else {
            this.f83931p = si1Var;
            if (!this.f83932q) {
                this.f83932q = true;
                a((Object) null, this.f83926k);
            }
        }
        return si1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    public final void a(Object obj, mo moVar, s63 s63Var) {
        ti1 ti1Var;
        ym1 ym1VarA;
        ti1 ti1Var2;
        if (this.f83933r) {
            ti1 ti1Var3 = this.f83930o;
            this.f83930o = new ti1(s63Var, ti1Var3.f83060d, ti1Var3.f83061e);
            si1 si1Var = this.f83931p;
            if (si1Var != null) {
                a(si1Var.f82660h);
            }
        } else {
            if (!s63Var.c()) {
                s63Var.a(0, this.f83928m, 0L);
                r63 r63Var = this.f83928m;
                long j10 = r63Var.f82130n;
                Object obj2 = r63Var.f82118b;
                si1 si1Var2 = this.f83931p;
                if (si1Var2 != null) {
                    long j11 = si1Var2.f82655c;
                    ti1 ti1Var4 = this.f83930o;
                    Object obj3 = si1Var2.f82654b.f82311a;
                    ti1Var4.a(ti1Var4.a(obj3), this.f83929n, true);
                    long j12 = this.f83929n.f81270f + j11;
                    if (j12 != this.f83930o.a(0, this.f83928m, 0L).f82130n) {
                        j10 = j12;
                    }
                }
                Pair pairA = s63Var.a(this.f83928m, this.f83929n, 0, j10);
                Object obj4 = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                if (this.f83934s) {
                    ti1 ti1Var5 = this.f83930o;
                    ti1Var = new ti1(s63Var, ti1Var5.f83060d, ti1Var5.f83061e);
                } else {
                    ti1Var = new ti1(s63Var, obj2, obj4);
                }
                this.f83930o = ti1Var;
                si1 si1Var3 = this.f83931p;
                if (si1Var3 != null) {
                    a(jLongValue);
                    ym1 ym1Var = si1Var3.f82654b;
                    Object obj5 = ym1Var.f82311a;
                    if (this.f83930o.f83061e != null && obj5.equals(ti1.f83059f)) {
                        obj5 = this.f83930o.f83061e;
                    }
                    ym1VarA = ym1Var.a(obj5);
                }
                this.f83934s = true;
                this.f83933r = true;
                a((s63) this.f83930o);
                if (ym1VarA != null) {
                    si1 si1Var4 = this.f83931p;
                    si1Var4.getClass();
                    si1Var4.a(ym1VarA);
                }
            }
            if (this.f83934s) {
                ti1 ti1Var6 = this.f83930o;
                ti1Var2 = new ti1(s63Var, ti1Var6.f83060d, ti1Var6.f83061e);
            } else {
                ti1Var2 = new ti1(s63Var, r63.f82114s, ti1.f83059f);
            }
            this.f83930o = ti1Var2;
        }
        ym1VarA = null;
        this.f83934s = true;
        this.f83933r = true;
        a((s63) this.f83930o);
        if (ym1VarA != null) {
            si1 si1Var5 = this.f83931p;
            si1Var5.getClass();
            si1Var5.a(ym1VarA);
        }
    }

    @Override // yads.ry, yads.mo
    public final void d() {
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        this.f83933r = false;
        this.f83932q = false;
        super.e();
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f83926k.c();
    }

    public vi1(mo moVar, boolean z10) {
        boolean z11;
        this.f83926k = moVar;
        if (z10) {
            moVar.getClass();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f83927l = z11;
        this.f83928m = new r63();
        this.f83929n = new p63();
        moVar.getClass();
        this.f83930o = ti1.a(moVar.c());
    }

    public final Object a(Object obj) {
        return (this.f83930o.f83061e == null || !obj.equals(ti1.f83059f)) ? obj : this.f83930o.f83061e;
    }

    @Override // yads.ry
    public final ym1 a(Object obj, ym1 ym1Var) {
        Object obj2 = ym1Var.f82311a;
        Object obj3 = this.f83930o.f83061e;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = ti1.f83059f;
        }
        return ym1Var.a(obj2);
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.f82464j = r83Var;
        this.f82463i = ib3.a((Handler.Callback) null);
        if (this.f83927l) {
            return;
        }
        this.f83932q = true;
        a((Object) null, this.f83926k);
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        ((si1) pm1Var).a();
        if (pm1Var == this.f83931p) {
            this.f83931p = null;
        }
    }

    public final void a(long j10) {
        si1 si1Var = this.f83931p;
        int iA = this.f83930o.a(si1Var.f82654b.f82311a);
        if (iA == -1) {
            return;
        }
        long j11 = this.f83930o.a(iA, this.f83929n, false).f81269e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        si1Var.f82660h = j10;
    }
}
